package com.example.strategyDemo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RecipeName {
    OVEN_VEG("ovenVeg"),
    STEAK("steak");

    private final String value;

    public static RecipeName fromValue(String value) {
        for (RecipeName e : values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        return null;
    }

}
