package com.equipation.balagat.opration.production;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.equipation.balagat.R;

public class production_sub_liquidation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_production_sub_liquidation);
    }
    public void fun_weekly(View view) {
        startActivity(new Intent( this , production_weekly_liquidation.class ));
    }

    public void fun_updateorder(View view) {
        startActivity(new Intent( this ,production_updateOrder.class ));

    }


    public void fun_pro_weekly(View view) {
        startActivity(new Intent(this, pro_liq_pro_weekly_liquidation.class));
    }

    public void fun_pro_updateorder(View view) {
        startActivity(new Intent(this, pro_liq_pro_update_order.class));
    }

    public void fun_back(View view) {
        super.getOnBackPressedDispatcher().onBackPressed();
    }
}