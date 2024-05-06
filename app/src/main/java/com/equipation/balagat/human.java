package com.equipation.balagat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


import com.equipation.balagat.humans.complaint_request;
import com.equipation.balagat.humans.evaluation_request;


import com.equipation.balagat.humans.PPE_request;
import com.equipation.balagat.humans.incentive_request;
import com.equipation.balagat.humans.moretidy_request;
import com.equipation.balagat.humans.prose_request;
import com.equipation.balagat.humans.salary_request;
import com.equipation.balagat.humans.borrow_request;
import com.equipation.balagat.humans.resignation_request;
import com.equipation.balagat.humans.request_vacation;
import com.equipation.balagat.humans.shift_request;
import com.equipation.balagat.humans.training_request;

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

    public void fun_complant_request(View view) {
        startActivity(new Intent( this , complaint_request.class ));

    }

    public void fun_training_request(View view) {
        startActivity(new Intent( this , training_request.class ));

    }

    public void fun_incentive_request(View view) {
        startActivity(new Intent( this , incentive_request.class ));


    }

    public void fun_moretidy_request(View view) {
        startActivity(new Intent( this , moretidy_request.class ));

    }


    public void fun_profile_request(View view) {
    }
}