package com.example.teacher.db031104;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ArticleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);
        Intent it = getIntent();
        String data = it.getStringExtra("data");
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(data);
    }
}
