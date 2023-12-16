package com.deeksha.unitconveter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button btn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        btn= findViewById(R.id.btn);
        textView=findViewById(R.id.textview);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // getting input from user in kilos
            String inputText = editText.getText().toString();

            // converting a string into double
                double kilos = Double.parseDouble(inputText);
               double pounds = makeConversion(kilos);
               textView.setText(" " +pounds);

            }

        });

    }

    public double makeConversion(double kilos){

        return kilos * 2.20462;

    }
}