package com.equipation.balagat.opration.constraction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.equipation.balagat.R;
import com.equipation.balagat.opration.rental.rental_updateOrder;
import com.equipation.balagat.opration.rental.weekly_liquidation;

public class main_liquidation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_liquidation);
    }


    public void fun_back(View view) {
        super.getOnBackPressedDispatcher().onBackPressed();
    }

    public void fun_weekly(View view) {
        startActivity(new Intent( this , con_liq_weekly_liquidation.class ));
    }

    public void fun_updateorder(View view) {
        startActivity(new Intent( this , con_liq_update_order.class ));
    }
}