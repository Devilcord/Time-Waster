package com.potato.timewaster;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create a root layout with a black background
        FrameLayout rootLayout = new FrameLayout(this);
        rootLayout.setBackgroundColor(Color.BLACK);

        // Create the text view
        TextView textView = new TextView(this);
        textView.setText("i wasted your time");
        textView.setTextColor(Color.WHITE);
        textView.setTextSize(24);
        textView.setTypeface(null, android.graphics.Typeface.BOLD);

        // Center the text inside the layout
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT
        );
        params.gravity = Gravity.CENTER;
        textView.setLayoutParams(params);

        // Add text to the layout and set it as the content view
        rootLayout.addView(textView);
        setContentView(rootLayout);
    }
}