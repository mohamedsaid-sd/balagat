package com.equipation.balagat.offices;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import com.equipation.balagat.R;

public class main_offices extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_offices);
    }

    public void fun_back(View view) {
        super.getOnBackPressedDispatcher().onBackPressed();
    }

    // المكاتب الحالية
    public void fun_current_office(View view) {

    }

    // اضافة مكتب
    public void fun_add_office(View view) {

    }

    // طلب ادوات مكتبية
    public void fun_request_tools(View view) {

    }

    // طلب فواتير
    public void fun_request_bills(View view) {

    }

    // طلب سداد ايجار
    public void fun_request_rental(View view) {

    }

    // طلب نثرية
    public void fun_petty_cash_request(View view) {

    }

    // طلب منصرفات اخرى
    public void fun_request_expense(View view) {

    }

    // طلب ضيافة
    public void fun_request_hospitality(View view) {

    }
}