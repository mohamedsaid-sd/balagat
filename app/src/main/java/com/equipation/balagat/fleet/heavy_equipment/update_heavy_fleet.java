package com.equipation.balagat.fleet.heavy_equipment;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class update_heavy_fleet extends AppCompatActivity {

    AutoCompleteTextView at_request_type , at_eq_status ;
    ArrayList<String> ar_eq_type , ar_eq_status ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_heavy_fleet);
        initialize();
        casting();
        fill_eq_type();
        fill_eq_status();
        link_eq_type();
        link_eq_status();
    }


    private void initialize() {
        ar_eq_type = new ArrayList<>();
        ar_eq_status = new ArrayList<>();
    }

    private void casting() {
        at_request_type = findViewById(R.id.at_request_type);
        at_eq_status = findViewById(R.id.at_eq_status);
    }

    private void fill_eq_type(){
        ar_eq_type.add("تحديث");
        ar_eq_type.add("إضافة");
    }

    private  void fill_eq_status(){
        ar_eq_status.add("في العمل");
        ar_eq_status.add("متاح العمل");
        ar_eq_status.add("تحت الصيانة");
        ar_eq_status.add("للبيع");
    }

    private void link_eq_type(){
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_eq_type);
        at_request_type.setAdapter(adapter);
    }

    private void link_eq_status(){
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_eq_status);
        at_eq_status.setAdapter(adapter);
    }

    public void fun_back(View view) {
        super.getOnBackPressedDispatcher().onBackPressed();
    }
}