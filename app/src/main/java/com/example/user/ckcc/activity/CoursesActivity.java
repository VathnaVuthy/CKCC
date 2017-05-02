package com.example.user.ckcc.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.ckcc.R;
import com.example.user.ckcc.dataset.Courses;

public class CoursesActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_couses);

        recyclerView = (RecyclerView) findViewById(R.id.couse_recylerview);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        Courses[] courses = loadCourse();
        CourseAdapter adapter = new CourseAdapter(courses);
        recyclerView.setAdapter(adapter);

    }

    private Courses[] loadCourse() {
        Courses course1 = new Courses("Android Developement", "12 April 2017");
        Courses course2 = new Courses("IOS Development", "12 April 2017");
        Courses course3 = new Courses("Java Developement", "12 April 2017");
        Courses course4 = new Courses("C++ Developement", "12 April 2017");
        Courses course5 = new Courses("C# Developement", "12 April 2017");
        Courses course6 = new Courses("Web Developement", "12 April 2017");
        Courses course7 = new Courses("Mobile Developement", "12 April 2017");
        Courses course8 = new Courses("JS Developement", "12 April 2017");

        Courses[] courses = {course1, course2, course3, course4, course5, course6, course7, course8};
        return courses;
    }

    /**
     * Created by User on 4/27/2017.
     */

    class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder> {

        Courses[] courses;

        public CourseAdapter(Courses[] courses) {
            this.courses = courses;
        }

        @Override
        public CourseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.article_list, parent, false);
            CourseViewHolder courseViewHolder = new CourseViewHolder(view);
            return courseViewHolder;
        }

        @Override
        public void onBindViewHolder(CourseViewHolder holder, int position) {
            Courses course = courses[position];
            holder.txtTitle.setText(course.getTitle());
            holder.txtdDate.setText(course.getDate());
        }

        @Override
        public int getItemCount() {
            return courses.length;
        }

        class CourseViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
            ImageView img_thumnail;
            TextView txtTitle;
            TextView txtdDate;

            public CourseViewHolder(View itemView) {
                super(itemView);
                img_thumnail = (ImageView) itemView.findViewById(R.id.img_thumnail);
                txtTitle = (TextView) itemView.findViewById(R.id.txt_title);
                txtdDate = (TextView) itemView.findViewById(R.id.txt_date);

                itemView.setOnClickListener(this);
            }

            @Override
            public void onClick(View v) {
                int position = getAdapterPosition();
                Courses course = courses[position];
                Intent intent = new Intent(CoursesActivity.this, CourseDetail.class);
                intent.putExtra("title",course.getTitle());
                intent.putExtra("date",course.getDate());
                startActivity(intent);

            }
        }
    }
}
