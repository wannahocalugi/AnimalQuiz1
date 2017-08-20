package com.deitel.flagquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Button startButton = (Button) findViewById(R.id.startButton);

        startButton.setOnClickListener(startButton_OnClickListener);
    }

    final View.OnClickListener startButton_OnClickListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(start.this, MainActivity.class);
            startActivity(i);
        }
    };
}