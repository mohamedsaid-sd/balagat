package com.equipation.balagat.offices;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import com.equipation.balagat.R;
import com.equipation.balagat.opration.rental.rental_contract_location;

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
        startActivity(new Intent( this , offices_request_information.class ));

    }

    // اضافة مكتب
    public void fun_add_office(View view) {

        startActivity(new Intent( this , offices_request_add.class ));

    }

    // طلب ادوات مكتبية
    public void fun_request_tools(View view) {
        startActivity(new Intent( this , offices_request_Tools.class ));


    }

    // طلب فواتير
    public void fun_request_bills(View view) {
        startActivity(new Intent( this , offices_request_bills.class ));


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