package com.example.labprogram2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText name = (EditText)findViewById(R.id.edit1);
        final EditText usn = (EditText)findViewById(R.id.edit2);
        final EditText branch = (EditText)findViewById(R.id.edit3);

        Button submit = (Button)findViewById(R.id.button1);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = name.getText().toString();
                String u = usn.getText().toString();
                String b = branch.getText().toString();

                Intent i = new Intent(MainActivity.this, Details.class);
                i.putExtra("NAME", n);
                i.putExtra("USN", u);
                i.putExtra("BRANCH", b);
                MainActivity.this.startActivity(i);
            }
        });
    }
}
