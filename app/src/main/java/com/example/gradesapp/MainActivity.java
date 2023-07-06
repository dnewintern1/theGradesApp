package com.example.gradesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtview = (TextView) findViewById(R.id.txtview);
        EditText edtview = findViewById(R.id.edtview);
        TextView txtresult = findViewById(R.id.txtresult);
        Button btnresult = findViewById(R.id.btnresult);


        btnresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtfield = edtview.getText().toString();

                int intvalue = Integer.parseInt(txtfield);

                String result= " ";

                if( intvalue >= 90){
                    result= "Your grade is A ,And marks is  " + txtfield;
                }
                 else if( intvalue >= 80){
                    result= "Your grade is B ,And marks is   " + txtfield;
                }
                else if( intvalue >= 70){
                    result= "Your grade is C , And marks is   " + txtfield;
                }
                else  if( intvalue >= 60){
                    result= "Your grade is D ,And marks is   " + txtfield;
                }
                else{
                    result= "Best of luck next time ,And marks is   " + txtfield;}

                txtresult.setText(result);

            }
        });

    }
}