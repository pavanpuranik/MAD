package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView t = (TextView)findViewById(R.id.text1);
        Button c = (Button)findViewById(R.id.color);
        Button s = (Button)findViewById(R.id.size);

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float font = 20;
                t.setTextSize(font);
                font+=5;
                if(font==50){
                    font=20;
                }
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ch = 1;
                switch (ch){
                    case 1:
                        t.setTextColor(Color.RED);
                        break;
                    case 2:
                        t.setTextColor(Color.BLUE);
                        break;
                    case 3:
                        t.setTextColor(Color.GREEN);
                        break;
                }

                ch+=1;
                if(ch>3){
                    ch=1;
                }
            }
        });
    }
}
