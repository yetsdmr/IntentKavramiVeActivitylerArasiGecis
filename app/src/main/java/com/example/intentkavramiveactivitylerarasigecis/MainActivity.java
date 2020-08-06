package com.example.intentkavramiveactivitylerarasigecis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        islevVer();

    }
    private void tanimla(){
        button = findViewById(R.id.btn);
    }
    private void gecisYap(){
        Intent intent = new Intent(this,Activity2.class);
        startActivity(intent);
    }
    private void islevVer(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gecisYap();
            }
        });
    }
}