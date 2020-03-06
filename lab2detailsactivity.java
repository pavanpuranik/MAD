package com.example.labprogram2;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent in = getIntent();
        String n = in.getStringExtra("NAME");
        String u = in.getStringExtra("USN");
        String b = in.getStringExtra("BRANCH");

        TextView name = (TextView)findViewById(R.id.text1);
        TextView usn = (TextView)findViewById(R.id.text2);
        TextView branch = (TextView)findViewById(R.id.text3);

        name.setText(n);
        usn.setText(u);
        branch.setText(b);
    }

}
