package com.example.strategyDemo;

import com.example.strategyDemo.strategy.OvenVegRecipe;
import com.example.strategyDemo.strategy.RecipeInterface;
import com.example.strategyDemo.strategy.SteakRecipe;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RecipeStrategyProvider {

    private final OvenVegRecipe ovenVegRecipe;
    private final SteakRecipe steakRecipe;

    public RecipeInterface getStrategy(RecipeName name) {

        return switch (name) {
            case OVEN_VEG -> ovenVegRecipe;
            case STEAK -> steakRecipe;
        };
    }
}
