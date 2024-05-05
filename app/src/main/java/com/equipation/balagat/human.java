package com.equipation.balagat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.equipation.balagat.contracts.PPE_request;
import com.equipation.balagat.contracts.evaluation_request;
import com.equipation.balagat.contracts.prose_request;
import com.equipation.balagat.contracts.shift_request;
import com.equipation.balagat.humans.salary_request;
import com.equipation.balagat.humans.borrow_request;
import com.equipation.balagat.humans.resignation_request;
import com.equipation.balagat.humans.request_vacation;

public class human extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void go(View view) {
        startActivity( new Intent( this , home.class ) );
    }

    public void fun_open_resignation_request(View view) {
        startActivity( new Intent( this , resignation_request.class ) );
        overridePendingTransition(androidx.transition.R.anim.abc_popup_enter, androidx.transition.R.anim.abc_fade_out);
    }

    public void fun_back(View view) {
        super.onBackPressed();
    }

    public void fun_profile(View view) {
        Toast.makeText(this, "الملف الشخصى", Toast.LENGTH_SHORT).show();
    }

    public void fun_cat(View view) {
        Toast.makeText(this, " الاقسام ", Toast.LENGTH_SHORT).show();
    }

    public void fun_home(View view) {
        Toast.makeText(this, "الرئيسية", Toast.LENGTH_SHORT).show();
    }

    public void fun_salary_request(View view) {
        startActivity(new Intent( this , salary_request.class ));
    }

    public void fun_borrow_request(View view) {
        startActivity(new Intent( this , borrow_request.class ));
    }


    public void fun_vacation_request(View view) {
        startActivity(new Intent( this , request_vacation.class ));
    }

    public void fun_PPE_request(View view) {
        Toast.makeText(this, "طلب معدات سلامة", Toast.LENGTH_SHORT).show();
        startActivity(new Intent( this , PPE_request.class ));
    }

    public void fun_shift_request(View view) {
        Toast.makeText(this, "طلب  وردية ", Toast.LENGTH_SHORT).show();
        startActivity(new Intent( this , shift_request.class ));
    }

    public void fun_prose_request(View view) {
        Toast.makeText(this, "طلب نثرية ", Toast.LENGTH_SHORT).show();
        startActivity(new Intent( this , prose_request.class ));
    }

    public void fun_evaluation_request(View view) {
        startActivity(new Intent( this , evaluation_request.class ));

    }
}