package com.example.hm1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView myText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myText = findViewById(R.id.numText);
        findViewById(R.id.multBt).setOnClickListener(this);
        findViewById(R.id.divBt).setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        float num = Float.parseFloat(myText.getText().toString());

        switch (v.getId())
        {
            case R.id.multBt:
                num = num * 2;
                myText.setText(String.valueOf(num));
                break;
            case R.id.divBt:
                num = num / 2;
                myText.setText(String.valueOf(num));
                break;
        }
    }
}
