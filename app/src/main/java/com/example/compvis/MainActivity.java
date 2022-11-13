package com.example.compvis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button camera_button;
    private Button pro_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    pro_button = findViewById(R.id.pro_button);
    pro_button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openActivity();
        }
    });
}
    public void openActivity(){
        Intent intent_2 = new Intent(this, ProActivity.class);
        startActivity(intent_2);
    }
}