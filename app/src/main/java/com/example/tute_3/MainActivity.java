package com.example.tute_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_n1;
    EditText et_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_n1 = findViewById(R.id.et_n1);
        et_2  = findViewById(R.id.et_2);
    }

    public void openSecond(View view){

        Intent intent = new Intent(this, SecondActivity.class);

        String num1 = et_n1.getText().toString();
        String num2 = et_2.getText().toString();

        intent.putExtra("n1", num1);
        intent.putExtra("n2", num2);

        LayoutInflater li = getLayoutInflater();
        View layout = li.inflate(R.layout.custom_toast, findViewById(R.id.tv_toast));

        Toast toast= new Toast(this);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM, 0, 0);
        toast.setView(layout);
        toast.show();

        startActivity(intent);

    }
}