package com.equipation.balagat.stocks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.equipation.balagat.R;

public class add_items_request extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_items_request);
    }



    public void fun_back(View view) {
        super.onBackPressed();
    }


    public void fun_add_item(View view) {
        Toast.makeText(this, "ready", Toast.LENGTH_SHORT).show();
    }
}