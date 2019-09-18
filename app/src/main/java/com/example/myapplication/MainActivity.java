package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.CharacterPickerDialog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText editTextNo1,editTextNo2;
Button buttonop;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNo1=findViewById(R.id.editText);
        editTextNo2=findViewById(R.id.editText2);
        buttonop=findViewById(R.id.button);
        textView = findViewById(R.id.res);
        buttonop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(MainActivity.this, "Lets have Taste", Toast.LENGTH_SHORT).show();
                String s1= String.valueOf(editTextNo1.getText());
                String s2= String.valueOf((editTextNo2.getText()));
                int sum= Integer.parseInt(s1)+Integer.parseInt(s2) ;
               // Toast.makeText(MainActivity.this, "sum "  +sum, Toast.LENGTH_SHORT).show();
                textView.setText(String.valueOf(sum));





            }
        });


    }
}
