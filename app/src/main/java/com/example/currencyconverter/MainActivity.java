package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        String str = myTextField.getText().toString();

        goToActivity2(convert(Double.parseDouble(str)));
    }

    public String convert(Double dollars) {
        Double pounds = dollars*0.77;
        return pounds.toString();
    }

    public void goToActivity2(String s) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
