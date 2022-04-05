package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_second);

                Intent intent = getIntent();
                int mCount = intent.getIntExtra(MainActivity.EXTRA_MESSAGE, 0);
                TextView mCountTextView = findViewById(R.id.showCount);
                mCountTextView.setText(String.valueOf(mCount));
        }
}