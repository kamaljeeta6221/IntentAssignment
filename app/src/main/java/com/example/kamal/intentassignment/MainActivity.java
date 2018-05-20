package com.example.kamal.intentassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText e1,e2;
RadioButton r1,r2;
CheckBox c1;
Button b1;
String s1,s3;
String s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.editIs);
        e2=findViewById(R.id.editAre);
        r1=findViewById(R.id.radio1);
        r2=findViewById(R.id.radio2);
        c1=findViewById(R.id.checkbox);
        b1=findViewById(R.id.button);
        e1=findViewById(R.id.editIs);


        b1.setEnabled(false);

        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(c1.isChecked()){
                    b1.setEnabled(true);
                }
                else{
                    b1.setEnabled(false);
                }
            }
        });
b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        s1 = e1.getText().toString();
        s2 = e2.getText().toString();

        if (r1.isChecked()) {
            s3 = "Mr.";
        } else {
            s3 = "Miss.";
        }
        if (s1.equals("")) {
            e1.setError("enter first name");
        } else if (s2.equals("")) {
            e2.setError("enter first no.");
        } else {

            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            intent.putExtra("name", s1);
            intent.putExtra("number", s2);
            intent.putExtra("gender", s3);
            startActivity(intent);
        }
    }
});
    }
}
