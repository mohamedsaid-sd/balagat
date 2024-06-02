package com.equipation.balagat;

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
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_human);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
    }

    public void fun_back(View view) {
        super.onBackPressed();
    }

    public void fun_cat_employee(View view) {
        startActivity(new Intent( this , human.class ).putExtra( "FLAG" , "employee" ));
    }

    public void fun_cat_borrow(View view) {
        startActivity(new Intent( this , human.class ).putExtra( "FLAG" , "borrow" ));
    }

    public void fun_cat_prose(View view) {
        startActivity(new Intent( this , human.class ).putExtra( "FLAG" , "prose" ));
    }

    public void fun_cat_trainig(View view) {
        startActivity(new Intent( this , human.class ).putExtra( "FLAG" , "trainig" ));
    }

    public void fun_cat_development(View view) {
        startActivity(new Intent( this , human.class ).putExtra( "FLAG" , "development" ));
    }

}