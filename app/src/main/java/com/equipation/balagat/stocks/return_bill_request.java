package com.equipation.balagat.stocks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.equipation.balagat.R;

public class return_bill_request extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_return_bill);
    }
    public void fun_back(View view) {
        super.onBackPressed();
    }

    public void fun_add_item(View view) {
        Toast.makeText(this, "ready", Toast.LENGTH_SHORT).show();
    }
}