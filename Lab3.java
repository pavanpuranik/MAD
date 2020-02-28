package com.example.labprogram3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        act();
    }

    protected void act(){
        Button add = (Button)findViewById(R.id.plus);
        Button subtract = (Button)findViewById(R.id.minus);
        Button product = (Button)findViewById(R.id.multiply);
        Button divide = (Button)findViewById(R.id.divide);

        final EditText num1 = (EditText)findViewById(R.id.number1);
        final EditText num2 = (EditText)findViewById(R.id.number2);
        final EditText res = (EditText) findViewById(R.id.res);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x,y;
                x = Integer.parseInt(num1.getText().toString());
                y = Integer.parseInt(num2.getText().toString());
                int ans = x+y;

                res.setText(Integer.toString(ans));
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x,y;
                x = Integer.parseInt(num1.getText().toString());
                y = Integer.parseInt(num2.getText().toString());
                int ans = x-y;

                res.setText(Integer.toString(ans));
            }
        });

        product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x,y;
                x = Integer.parseInt(num1.getText().toString());
                y = Integer.parseInt(num2.getText().toString());
                int ans = x*y;

                res.setText(Integer.toString(ans));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x,y;
                x = Integer.parseInt(num1.getText().toString());
                y = Integer.parseInt(num2.getText().toString());
                int ans = x/y;

                res.setText(Integer.toString(ans));
            }
        });
    }
}
