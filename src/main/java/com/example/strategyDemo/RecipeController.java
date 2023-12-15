package com.example.strategyDemo;

import com.example.strategyDemo.strategy.RecipeInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@RequiredArgsConstructor
@Controller
public class RecipeController {

    private final RecipeService recipeService;
    private final RecipeStrategyProvider strategyProvider;

    @GetMapping("/recipe/{name}")
    @ResponseBody
    public String getRecipe(@PathVariable String name) {
        RecipeName recipeName = RecipeName.fromValue(name);
        if(recipeName== null){
            return "no recipe found";
        }
        RecipeInterface strategy = strategyProvider.getStrategy(recipeName);
        return recipeService.buildRecipe(strategy);
    }
}
