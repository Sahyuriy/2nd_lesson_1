package com.example.sah.a2nd_less_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        String text = getIntent().getStringExtra("Text");
        TextView textView = (TextView)findViewById(R.id.outputText);
        textView.setText(text);
    }
}
