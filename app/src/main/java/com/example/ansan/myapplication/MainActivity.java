package com.example.ansan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2, e3;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button);
        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText2);
        e3 = (EditText) findViewById(R.id.editText3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = e1.getText().toString();
                String number = e2.getText().toString();
                String subject = e3.getText().toString();

                Toast.makeText(getApplicationContext(),
                        name + "님의 학번은 " + number + "이고, 좋아하는 과목은 " + subject + "입니다.",
                               Toast.LENGTH_SHORT).show();

                e1.setText("");
                e2.setText("");
                e3.setText("");
            }
        });
    }
}
