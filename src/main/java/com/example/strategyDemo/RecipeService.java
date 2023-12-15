package com.example.strategyDemo;

import com.example.strategyDemo.strategy.RecipeInterface;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {

    public String buildRecipe(RecipeInterface recipe){
        StringBuilder sb = new StringBuilder();
        sb.append("wash hands \n");
        sb.append(recipe.cutting());
        sb.append("turn on oven \n");
        sb.append(recipe.fry());
        sb.append("wash dishes\n");
        return sb.toString();
    }
}
