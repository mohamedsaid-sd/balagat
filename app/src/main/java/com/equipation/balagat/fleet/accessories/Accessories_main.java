package com.equipation.balagat.fleet.accessories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.equipation.balagat.R;
import com.equipation.balagat.fleet.spare.asper_request;

public class Accessories_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accessories_main);
    }

    public void fun_Jack_Hammer(View view) {
        startActivity(new Intent(this , Jack_Hammer.class ));

    }

    public void fun_Bucket(View view) {
        startActivity(new Intent(this , Bucket.class ));
    }

    public void fun_Cumberson(View view) {
        startActivity(new Intent(this , Cumberson.class ));


    }

    public void fun_Lubricated(View view) {
        startActivity(new Intent(this , Lubricated.class ));


    }
}