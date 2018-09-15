package com.example.dell.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox bd, usa, uk;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initFunctionality();
    }

    private void initFunctionality() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Your Fav Country is \n");

                int checker = 0;

                if (bd.isChecked()) {
                    String country = bd.getText().toString();
                    stringBuilder.append(country + "\n");
                    checker++;
                }
                if (usa.isChecked()) {
                    String country = usa.getText().toString();
                    stringBuilder.append(country + "\n");
                    checker++;
                }
                if (uk.isChecked()) {
                    String country = uk.getText().toString();
                    stringBuilder.append(country + "\n");
                    checker++;
                }

                if (checker > 0) {
                    textView.setText(stringBuilder);

                } else {
                    textView.setText("Plz select a country");
                }
            }
        });
    }

    private void initView() {
        bd = findViewById(R.id.bd);
        usa = findViewById(R.id.usa);
        uk = findViewById(R.id.uk);
        button = findViewById(R.id.selectButton);
        textView = findViewById(R.id.resultId);
    }
}
