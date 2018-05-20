package com.example.kamal.intentassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
t1=findViewById(R.id.textView);
Bundle b=getIntent().getExtras();
t1.setText("Welcome to DUCAT \n"+b.getString("gender")+b.getString("name")+"\nyour mobile no."+b.getString("number"));
    }
}
