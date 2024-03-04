package com.equipation.balagat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

public class profile extends AppCompatActivity {

    ProgressBar progressBar ;
    LinearLayout linearLayout2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        progressBar = findViewById(R.id.progressBar);
        linearLayout2 = findViewById(R.id.linearLayout2);
        linearLayout2.setVisibility(View.GONE);

        new Handler(Looper.getMainLooper()).postDelayed(()->{
                    // دالة فتح الصفحة الجديدة
                    progressBar.setVisibility(View.GONE);
                    linearLayout2.setVisibility(View.VISIBLE);
                }
                // الزمن المطلوب تاخيره وهو 5 ثوان
                , 3000 );

    }



    public void fun_back(View view) {
        super.onBackPressed();
    }



    public void fun_exite(View view) {
        startActivity(new Intent( this , login.class ).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
        finish();
        Toast.makeText(this, "تم تسجيل الخروج", Toast.LENGTH_SHORT).show();
    }

    public void fun_my_requests(View view) {
        startActivity(new Intent( this , my_requests.class ));
    }
}