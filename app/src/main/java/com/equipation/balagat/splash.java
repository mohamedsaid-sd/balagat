package com.equipation.balagat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        new Handler(Looper.getMainLooper()).postDelayed(()->{
                    // دالة فتح الصفحة الجديدة
                    startActivity(new Intent(this , login.class));
                    finish();
                }
                // الزمن المطلوب تاخيره وهو 5 ثوان
                , 6000 );

    }
}