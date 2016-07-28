package com.siaskov.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by EgorSiaskov on 24/07/16.
 */
public class ColorWheel {


    // Fields (member Var) - propertyes about the object

    private final String[] mColors = new String[]  {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };


    // Methods - action the object can take

    public int getColor() {
        
        // The Button was clicked, so update the fact
        String color;
        Random randomGenerator = new Random();
        // Randomly select a fact
        int randomNumer = randomGenerator.nextInt(mColors.length);

        color = mColors[randomNumer];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }
}
