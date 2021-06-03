package com.charsample.jnidemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.charsample.mylibrarycmake.JniDemo;
import com.charsample.mylibraryndkdemo.JniNdkDemo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mTextView = findViewById(R.id.textview);
        mTextView.setText(JniDemo.testJniDemoCmake() + "  " + JniNdkDemo.ndkDemoX());
    }
}