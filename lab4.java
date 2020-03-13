package com.example.labprogram4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bitmap b = Bitmap.createBitmap(720, 1280, Bitmap.Config.ARGB_8888);

        ImageView i = (ImageView)findViewById(R.id.img1);
        i.setBackgroundDrawable(new BitmapDrawable((b)));

        Canvas c = new Canvas(b);
        Paint p = new Paint();
        p.setColor(Color.BLUE);
        p.setTextSize(50);

        c.drawText("Rectangle", 420, 150, p);
        c.drawRect(400, 200, 650, 700, p);

        c.drawText("Circle", 120, 150, p);
        c.drawCircle(200, 350, 150, p);

        c.drawText("Square", 120, 800, p);
        c.drawRect(50, 850, 350, 1150, p);

        c.drawText("Line", 480, 800, p);
        c.drawLine(520, 850, 520, 1150, p);
    }
}
