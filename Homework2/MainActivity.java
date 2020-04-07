package com.example.hm2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.calculation);

        findViewById(R.id.mult_button).setOnClickListener(this);
        findViewById(R.id.div_button).setOnClickListener(this);
        findViewById(R.id.plus_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
    float num = 0.0f;
    try {
        num = Float.parseFloat(editText.getText().toString());
    }
    catch (NumberFormatException nfe)
    {
     System.out.println("Could not parse " + nfe);
    }

    switch (v.getId())
    {
        case R.id.mult_button:
            num = num * 2;
            textView.setText(String.valueOf(num));
            break;
        case R.id.div_button:
            num = num / 2;
            textView.setText(String.valueOf(num));
            break;
        case R.id.plus_button:
            num = num + 2;
            textView.setText(String.valueOf(num));
            break;
    }
    }
}
