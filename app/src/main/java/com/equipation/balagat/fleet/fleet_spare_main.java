package com.equipation.balagat.fleet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.equipation.balagat.R;
import com.equipation.balagat.fleet.spare.available_spare_fleet;
import com.equipation.balagat.fleet.spare.update_spare_fleet;

public class fleet_spare_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fleet_spare_main);
    }

    public void fun_available_spare_fleet(View view) {
        startActivity(new Intent(this , available_spare_fleet.class));
    }

    public void fun_update_spare_fleet(View view) {
        startActivity(new Intent(this , update_spare_fleet.class));
    }

    public void fun_back(View view) {
        super.getOnBackPressedDispatcher().onBackPressed();
    }

}