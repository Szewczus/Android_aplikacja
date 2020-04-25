package com.example.numerek;

import android.app.Application;

import java.util.Random;


public class Aplikacja   extends Application {

    private static int los;
    public static int nr=0;
    public Aplikacja()
    {
        super();

    }
    public static void losuj()
    {
        Random generator = new Random();
        los = generator.nextInt(100);
    }

    public static int zwroc()
    {
        return los;
    }


}
