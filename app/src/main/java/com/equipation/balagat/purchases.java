package com.equipation.balagat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.equipation.balagat.folderpurchases.purchase_order;
import com.equipation.balagat.folderpurchases.refund_request;
import com.equipation.balagat.folderpurchases.surplus_order;
import com.equipation.balagat.opration.Production_contract;

public class purchases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchases);
    }

    public void fun_back(View view) {
        super.getOnBackPressedDispatcher().onBackPressed();
    }

    public void fun_purchasesorder(View view) {
        startActivity(new Intent( this , purchase_order.class ) );

    }

    public void fun_refund(View view) {
        startActivity(new Intent( this , refund_request.class ) );

    }

    public void fun_surplus_order(View view) {
        startActivity(new Intent( this , surplus_order.class ) );


    }
}