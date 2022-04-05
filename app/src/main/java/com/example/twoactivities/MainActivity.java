package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mCount=0;
    private TextView sendCount;
    private TextView mShowCount;

    public static final String EXTRA_MESSAGE="com.example.android.hellotoast.extra.Message";
    public static final int TEXT_REQUEST =1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount=(TextView)findViewById(R.id.show_count);
    }

    public void showToast(View view) {
//        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
//        toast.show();

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_MESSAGE,mCount);
        startActivity(intent);


    }

    public void countUp(View view) {
        mCount++;
        if(mShowCount!= null){
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}