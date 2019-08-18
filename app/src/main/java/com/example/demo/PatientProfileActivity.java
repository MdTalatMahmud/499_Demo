package com.example.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class PatientProfileActivity extends AppCompatActivity {

    private LinearLayout linearLayoutAccount, linearLayoutDoctorSearch,bmiID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_profile);

        linearLayoutAccount = findViewById(R.id.accountId);
        linearLayoutDoctorSearch = findViewById(R.id.searchId);
        bmiID=findViewById(R.id.bmiId);

        linearLayoutAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PatientProfileActivity.this,AccountActivity.class);
                startActivity(intent);
            }
        });

        linearLayoutDoctorSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PatientProfileActivity.this,SearchDoctorActivity.class);
                startActivity(intent);
            }
        });
        bmiID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bmi();
            }
        });

    }
    public void bmi(){
        Intent intent=new Intent(this,bmi.class);
        startActivity(intent);

    }
}
