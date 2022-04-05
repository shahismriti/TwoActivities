package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private final static String LOG_TAG=MainActivity.class.getSimpleName();
    private final static String EXTRA_MESSAGE ="com.example.android.twoactivitiescodingchallenge.extra.MESSAGE";
    private  View paragraph;
    private View article_heading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void LaunchParaTwo(View view) {
        Log.d(LOG_TAG,"Paragraph Two");
        Intent intent = new Intent(this, SecondActivity.class);
        paragraph =findViewById(R.id.article_text);
        intent.putExtra(EXTRA_MESSAGE, (Parcelable) paragraph);
        startActivity(intent);
    }

    public void LaunchParaOne(View view){
        Log.d(LOG_TAG, "Paragraph One");
        Intent intent = new Intent(this, SecondActivity.class);
        paragraph =findViewById(R.id.article_text);
        intent.putExtra(EXTRA_MESSAGE, (Parcelable) paragraph);
        startActivity(intent);
    }

    public void LaunchParaThree(View view){
        Log.d(LOG_TAG, "Paragraph Three");
        Intent intent = new Intent(this, SecondActivity.class);
        paragraph =findViewById(R.id.article_text);
        intent.putExtra(EXTRA_MESSAGE,(Parcelable) paragraph);
        startActivity(intent);
    }
}