package com.example.regapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button textbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textbutton= (Button) findViewById(R.id.textbutton);
        textbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openregisterbutton();

            }
        });

    }
    public void openregisterbutton(){
        Intent intent=new Intent(this, registerbutton.class);
        startActivity(intent);
    }
}
