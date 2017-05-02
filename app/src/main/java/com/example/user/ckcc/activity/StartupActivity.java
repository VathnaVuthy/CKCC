package com.example.user.ckcc.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.user.ckcc.R;

public class StartupActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                setLoginActivity();
                finish();
            }
        },2000);

    }
    private void setLoginActivity(){
        Intent loginIntent = new Intent(this,LoginActivity.class);
        startActivity(loginIntent);
    }
}
