package com.example.numerek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView numerek;
    public static int liczba;
    //public Aplikacja a=new Aplikacja();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    protected void onResume() {
        super.onResume();
        if(Aplikacja.nr %2!=0)
        {
            numerek=(TextView)findViewById(R.id.numerek);
            Aplikacja.losuj();
            //liczba=Aplikacja.zwroc();
            MainActivity.liczba=Aplikacja.zwroc();
            numerek.setText(Integer.toString(liczba));

        }
        else
        {
            numerek=(TextView)findViewById(R.id.numerek);
            numerek.setText(Integer.toString(liczba));
        }
        Aplikacja.nr++;

    }





}
