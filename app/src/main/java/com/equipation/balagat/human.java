package com.equipation.balagat;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.equipation.balagat.fleet.maintenances.fleet_maintanance_main;
import com.equipation.balagat.folderpurchases.purchases;
import com.equipation.balagat.humans.Attendance;
import com.equipation.balagat.humans.complaint_request;
import com.equipation.balagat.humans.delegate_request;
import com.equipation.balagat.humans.edit_profile_request;
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
import com.equipation.balagat.stocks.stock;

import java.util.Objects;

public class human extends AppCompatActivity {

    String FLAG = "";

    TextView txt_name ;

    // Employee
    TextView txt_resignation , txt_complant , txt_profile ;
    // Borrow
    TextView txt_salary , txt_borrow , txt_moretidy , txt_incentive , txt_delegate ,txt_attendacne,txt_policies,txt_suggestions;
    // Prose
    TextView txt_PPE , txt_prose ;
    // Trainig
    TextView txt_shift , txt_vacation , txt_evaluation ;
    // Development
    TextView txt_training;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        casting();

        FLAG = Objects.requireNonNull(getIntent().getExtras()).getString("FLAG");
        txt_resignation.setVisibility(View.GONE);
        txt_complant.setVisibility(View.GONE);
        txt_profile.setVisibility(View.GONE);
        txt_salary.setVisibility(View.GONE);
        txt_borrow.setVisibility(View.GONE);
        txt_moretidy.setVisibility(View.GONE);
        txt_incentive.setVisibility(View.GONE);
        txt_delegate.setVisibility(View.GONE);
        txt_PPE.setVisibility(View.GONE);
        txt_prose.setVisibility(View.GONE);
        txt_shift.setVisibility(View.GONE);
        txt_vacation.setVisibility(View.GONE);
        txt_evaluation.setVisibility(View.GONE);
        txt_training.setVisibility(View.GONE);
        txt_attendacne.setVisibility(View.GONE);
        txt_policies.setVisibility(View.GONE);
        txt_suggestions.setVisibility(View.GONE);





        if(FLAG.equals("employee")){
            txt_name.setText(" التوظيف ");

            txt_profile.setVisibility(View.VISIBLE);

            txt_delegate.setVisibility(View.VISIBLE);

        }

        if(FLAG.equals("holiday")){
            txt_name.setText(" الاجازات ونهاية الخدمة ");
            txt_vacation.setVisibility(View.VISIBLE);
            txt_resignation.setVisibility(View.VISIBLE);
        }


        if(FLAG.equals("borrow")){
            txt_name.setText(" المستحقات والسلفيات ");
            txt_salary.setVisibility(View.VISIBLE);
            txt_borrow.setVisibility(View.VISIBLE);
            txt_moretidy.setVisibility(View.VISIBLE);
            txt_incentive.setVisibility(View.VISIBLE);

        }

        if(FLAG.equals("prose")){
            txt_name.setText(" العهد والنثريات ");
            txt_PPE.setVisibility(View.VISIBLE);
            txt_prose.setVisibility(View.VISIBLE);
        }

        if(FLAG.equals("complainAndsugg")){
            txt_name.setText(" الشكاوي والمقترحات ");
            txt_complant.setVisibility(View.VISIBLE);
            txt_suggestions.setVisibility(View.VISIBLE);
        }



        if(FLAG.equals("trainig")){
            txt_name.setText(" الحضور والأداء ");
            txt_shift.setVisibility(View.VISIBLE);

            txt_evaluation.setVisibility(View.VISIBLE);
            txt_attendacne.setVisibility(View.VISIBLE);
        }


        if(FLAG.equals("development")){
            txt_name.setText(" التدريب والتطوير ");
            txt_training.setVisibility(View.VISIBLE);
        }




    }

    private void casting() {
        txt_name = findViewById(R.id.txt_name);
        // Employee
        txt_resignation = findViewById(R.id.txt_resignation);
        txt_complant = findViewById(R.id.txt_complant);
        txt_profile = findViewById(R.id.txt_profile);
        // Borrow
        txt_salary = findViewById(R.id.txt_salary);
        txt_borrow = findViewById(R.id.txt_borrow);
        txt_moretidy = findViewById(R.id.txt_moretidy);
        txt_incentive = findViewById(R.id.txt_incentive);
        txt_delegate = findViewById(R.id.txt_delegate);
        // Prose
        txt_PPE = findViewById(R.id.txt_PPE);
        txt_prose = findViewById(R.id.txt_prose);
        // Trainig
        txt_shift = findViewById(R.id.txt_shift);
        txt_vacation = findViewById(R.id.txt_vacation);
        txt_evaluation = findViewById(R.id.txt_evaluation);
        txt_attendacne = findViewById(R.id.txt_attendacne);
        txt_policies = findViewById(R.id.txt_policies);
        txt_suggestions = findViewById(R.id.txt_suggestions);





        // Development
        txt_training = findViewById(R.id.txt_training);
    }

    public void fun_open_resignation_request(View view) {
        Bundle b =  ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        startActivity( new Intent( this , resignation_request.class )  , b );
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
        Bundle b =  ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        startActivity(new Intent( this , salary_request.class ) , b);
    }

    public void fun_borrow_request(View view) {
        Bundle b =  ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        startActivity(new Intent( this , borrow_request.class ) , b);
    }


    public void fun_vacation_request(View view) {

        startActivity(new Intent( this , request_vacation.class ) );
    }

    public void fun_PPE_request(View view) {

        startActivity(new Intent( this , PPE_request.class )  );
    }

    public void fun_shift_request(View view) {

        startActivity(new Intent( this , shift_request.class ) );
    }

    public void fun_prose_request(View view) {

        startActivity(new Intent( this , prose_request.class ) );
    }

    public void fun_evaluation_request(View view) {

        startActivity(new Intent( this , evaluation_request.class ) );

    }

    public void fun_complant_request(View view) {

        startActivity(new Intent( this , complaint_request.class ) );

    }

    public void fun_training_request(View view) {

        startActivity(new Intent( this , training_request.class ) );

    }

    public void fun_incentive_request(View view) {

        startActivity(new Intent( this , incentive_request.class ) );
    }

    public void fun_moretidy_request(View view) {

        startActivity(new Intent( this , moretidy_request.class ) );

    }


    public void fun_profile_request(View view) {

        startActivity(new Intent( this , edit_profile_request.class ) );
    }

    public void fun_delegate_request(View view) {
        startActivity(new Intent( this , delegate_request.class ) );
    }

    public void fun_maintenance(View view) {
       //
        startActivity(new Intent(this , fleet_maintanance_main.class)  );
    }

    public void fun_purchases(View view) {
        Bundle b = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        startActivity(new Intent(this, purchases.class) , b);
    }

    public void fiun_stock(View view) {

        startActivity(new Intent( this , stock.class ) );
    }

    public void fun_contract(View view) {
        startActivity(new Intent(this , contract.class) );
    }


    public void fun_attendance_requeendancest(View view) {
        startActivity(new Intent( this , Attendance.class ) );


    }

    public void fun_policies(View view) {
        // add the link of pdf
        String value="https://equipation.sd/policies/policies.pdf";
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(value));

        // start activity
        startActivity(intent);

    }
}