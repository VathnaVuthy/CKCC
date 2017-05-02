package com.example.user.ckcc.activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.user.ckcc.R;
import com.example.user.ckcc.fragment.ContactUsFragment;
import com.example.user.ckcc.fragment.NewsFragment;
import com.example.user.ckcc.fragment.ProfileFragment;

/**
 * Created by User on 3/23/2017.
 */

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }


    /*    public void setViewClick(View view){
            switch (view.getId()){
                case R.id.img_news:
                    onNewsClick();
                    break;
                case R.id.img_trainingCourse:
                    onTraningCourseClick();
                    break;
                case R.id.img_profile:
                    onProfileClick();
                    break;
                case R.id.img_feedback:
                    break;
                case R.id.img_contact:
                    onContactClick();
                    break;
            }
        } */
    public void onNewsClick(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        NewsFragment newsFragment = new NewsFragment();
        fragmentTransaction.replace(R.id.lyt_content,newsFragment);
        fragmentTransaction.commit();
//        Intent intent = new Intent(this,ActivityNews.class);
//        startActivity(intent);
    }
    public void onTraningCourseClick(){
//        FragmentManager fragmentManager = getFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        TraningCourseFragment traningCourseFragment = new TraningCourseFragment();
//        fragmentTransaction.replace(R.id.lyt_content,traningCourseFragment);
//        fragmentTransaction.commit();
        Intent intent = new Intent(this,CoursesActivity.class);
        startActivity(intent);
    }
    public void onContactClick(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        ContactUsFragment contactUsFragment = new ContactUsFragment();
        fragmentTransaction.replace(R.id.lyt_content,contactUsFragment);
        fragmentTransaction.commit();
    }
    public void onProfileClick(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        ProfileFragment profileFragment = new ProfileFragment();
        fragmentTransaction.replace(R.id.lyt_content,profileFragment);
        fragmentTransaction.commit();
    }


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menu_news:
                onNewsClick();
                break;
            case R.id.menu_traning_course:
                onTraningCourseClick();
                break;
            case R.id.menu_profile:
                onProfileClick();
                break;
            case R.id.menu_feedback:
                break;
            case R.id.menu_contact:
                onContactClick();
                break;
        }
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

}
