package com.fast.safhackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread t =new Thread(){
            public void run(){
                try{
                    sleep(3500);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent i =new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(i);
                }
            }
        };


        t.start();
    }
}
