package com.example.strategyDemo.strategy;

import org.springframework.stereotype.Component;

@Component
public class SteakRecipe implements RecipeInterface{
    @Override
    public String cutting() {
        return "cutting steak \n";
    }

    @Override
    public String fry() {
        return "frying steak \n";
    }
}
