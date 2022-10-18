package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    public void OnConvertClick(View view){
        EditText editText = findViewById(R.id.editTextNumberDecimal2);
        String inputInString = editText.getText().toString();

        Double inputInDouble = Double.parseDouble(inputInString);
        Double outputInFahrenheit = (inputInDouble*9/5)+32;

        Snackbar.make(view,"Temp in"+ inputInDouble +
                        " celcius is "+ outputInFahrenheit + " in Fahrenheit",
                Snackbar.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}