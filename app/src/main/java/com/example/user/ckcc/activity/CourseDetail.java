package com.example.user.ckcc.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.user.ckcc.R;

public class CourseDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_detail);
        String CourseTitle = getIntent().getStringExtra("title");
        String CourseDate = getIntent().getStringExtra("date");


        TextView txtTitle = (TextView) findViewById(R.id.course_title);
        txtTitle.setText(CourseTitle);
        TextView txtDate = (TextView)findViewById(R.id.course_date);
        txtDate.setText(CourseDate);
    }
}
