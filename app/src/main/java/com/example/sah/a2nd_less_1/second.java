package com.example.sah.a2nd_less_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class second extends AppCompatActivity {

    private EditText textField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textField = (EditText) findViewById(R.id.textField);
    }



    public void thirdActivity (View v) {
        if (textField.getText().toString().equals("")) {
            Toast.makeText(this, "Текстове поле пусте", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent in = new Intent(second.this, third.class);
            in.putExtra("Text", textField.getText().toString());
            startActivity(in);
        }
    }
}
