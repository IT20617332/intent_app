package com.example.tute_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText et_n1;
    EditText et_2;
    TextView tv_answer;

    String number1;
    String number2;

    int n1;
    int n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        et_n1 = findViewById(R.id.et_n1);
        et_2  = findViewById(R.id.et_2);
        tv_answer = findViewById(R.id.tv_answer);

        Intent intent = getIntent();
        number1 = intent.getStringExtra("n1");
        number2 = intent.getStringExtra("n2");

        et_n1.setText(number1);
        et_2.setText(number2);

        n1 = Integer.parseInt(number1);
        n2 = Integer.parseInt(number2);
    }

    public void add(View view){
        tv_answer.setText(number1 + "+" + number2 + "=" + (n1+n2));
    }

    public void subtract(View view){
        tv_answer.setText(number1 + "-" + number2 + "=" + (n1-n2));
    }

    public void multiply(View view){
        tv_answer.setText(number1 + "*" + number2 + "=" + (n1*n2));
    }

    public void divide(View view){
        tv_answer.setText(number1 + "/" + number2 + "=" + (n1/n2));
    }


}