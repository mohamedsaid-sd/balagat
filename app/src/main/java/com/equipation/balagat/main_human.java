package com.equipation.balagat;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

//import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

//import com.equipation.balagat.humans.cat_employee;

public class main_human extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_human);
    }

    public void fun_back(View view) {
        super.onBackPressed();
    }

    public void fun_cat_employee(View view) {
        Bundle b =  ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        startActivity(new Intent( this , human.class ).putExtra( "FLAG" , "employee" ) , b);
    }

    public void fun_cat_borrow(View view) {
        Bundle b =  ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        startActivity(new Intent( this , human.class ).putExtra( "FLAG" , "borrow" ) , b  );
    }

    public void fun_cat_prose(View view) {
        Bundle b =  ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        startActivity(new Intent( this , human.class ).putExtra( "FLAG" , "prose" ) , b);
    }

    public void fun_cat_trainig(View view) {
        Bundle b =  ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        startActivity(new Intent( this , human.class ).putExtra( "FLAG" , "trainig" ) , b);
    }

    public void fun_cat_development(View view) {
        Bundle b =  ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        startActivity(new Intent( this , human.class ).putExtra( "FLAG" , "development" ) , b);
    }

}