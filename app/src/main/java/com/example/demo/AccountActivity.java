package com.example.demo;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AccountActivity extends AppCompatActivity {

    private TextView textView;
    private Typeface typeface;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        //text font changing
        textView = findViewById(R.id.textViewId);
        typeface = Typeface.createFromAsset(getAssets(),"font/text_font.ttf");
        textView.setTypeface(typeface);

        button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AccountActivity.this , PatientProfileActivity.class);
                startActivity(intent);
            }
        });


    }
}
