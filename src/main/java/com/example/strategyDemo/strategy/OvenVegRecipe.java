package com.example.strategyDemo.strategy;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class OvenVegRecipe implements RecipeInterface{
    @Override
    public String cutting() {
        return "cutting veg \n";
    }

    @Override
    public String fry() {
        return "baking veg \n";
    }
}
