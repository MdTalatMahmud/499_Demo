package com.example.demo;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class SearchDoctorActivity extends AppCompatActivity {

    private TextView textView;
    private Typeface typeface;
    private CardView cardViewDoc1, getCardViewDoc2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_doctor);

        //text font changing
        textView = findViewById(R.id.onlineDocText);
        typeface = Typeface.createFromAsset(getAssets(),"font/text_font.ttf");
        textView.setTypeface(typeface);

        CardView cardViewDoc1 = findViewById(R.id.cardViewDoctor1);
        CardView cardViewDoc2 = findViewById(R.id.cardViewDoctor2);

        cardViewDoc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://scaledrone.github.io/webrtc/index.html#5a0cfb"));
                startActivity(intent);
            }
        });

        cardViewDoc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://scaledrone.github.io/webrtc/index.html#6198a8"));
                startActivity(intent);
            }
        });


    }

}
