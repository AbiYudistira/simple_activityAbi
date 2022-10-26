package com.example.simple_activityabi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Mendeklarasi atribut dengan nama nameInput dengan tipe EditText
    private EditText tahunInput;
    // Mendeklarasi atribut dengan nama outputText dengan tipe TextView
    private TextView outputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tahunInput = findViewById(R.id.input_tahun);
        outputText = findViewById(R.id.text_output);
    }

    public void handleSubmit(View view) {
        int Tahun = Integer.parseInt(tahunInput.getText().toString());
        if (Tahun >= 1946 && Tahun <= 1964){
            outputText.setText("Generasi Baby Boomers");
        }else if (Tahun >= 1965 && Tahun <= 1980){
            outputText.setText("Generasi X");
        }else if (Tahun >= 1981 && Tahun <= 1994){
            outputText.setText("Generasi Y/Milineal");
        }else if (Tahun >= 1995 && Tahun <= 2010){
            outputText.setText("Generasi Z");
        }else if (Tahun >= 2011 && Tahun <= 2025){
            outputText.setText("Generasi Alpha");
        }else{
            outputText.setText("Out of range");
        }
    }
}