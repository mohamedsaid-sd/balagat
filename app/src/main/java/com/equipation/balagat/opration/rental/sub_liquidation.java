package com.equipation.balagat.opration.rental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.equipation.balagat.R;
import com.equipation.balagat.contract_time_sheet;
import com.equipation.balagat.opration.production.pro_liq_pro_update_order;
import com.equipation.balagat.opration.production.pro_liq_pro_weekly_liquidation;

public class sub_liquidation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_liquidation);
    }

    public void fun_weekly(View view) {
        startActivity(new Intent( this , weekly_liquidation.class ));
    }

    public void fun_updateorder(View view) {
        startActivity(new Intent( this , rental_updateOrder.class ));

    }

    public void fun_back(View view) {
        super.getOnBackPressedDispatcher().onBackPressed();
    }

    public void fun_pro_weekly(View view) {
        startActivity(new Intent(this, rental_liq_pro_weekly_liquidation.class));
    }

    public void fun_pro_updateorder(View view) {
        startActivity(new Intent(this, rental_liq_pro_update_order.class));
    }
}