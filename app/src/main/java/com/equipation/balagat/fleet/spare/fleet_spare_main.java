package com.equipation.balagat.fleet.spare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.equipation.balagat.R;
import com.equipation.balagat.fleet.maintenances.pay_parts;

public class fleet_spare_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fleet_spare_main);
    }



    public void fun_asper_request(View view) {
        startActivity(new Intent(this , asper_request.class ));
    }

    public void fun_outlay_request(View view) {
        startActivity(new Intent(this , part_maintenance.class ));
    }

    public void fun_back(View view) {
        super.getOnBackPressedDispatcher().onBackPressed();
    }

    public void fun_pay_parts(View view) {
        startActivity(new Intent(this , pay_parts.class ));
    }
}