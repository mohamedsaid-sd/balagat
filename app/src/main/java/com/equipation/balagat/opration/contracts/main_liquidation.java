package com.equipation.balagat.opration.contracts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.equipation.balagat.R;

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
        startActivity(new Intent(this, con_liq_weekly_liquidation.class));
    }

    public void fun_updateorder(View view) {
        startActivity(new Intent(this, con_liq_update_order.class));
    }

    public void fun_pro_weekly(View view) {
        startActivity(new Intent(this, com_liq_pro_weekly_liquidation.class));
    }

    public void fun_pro_updateorder(View view) {
        startActivity(new Intent(this, com_liq_pro_update_order.class));
    }
}


