package com.equipation.balagat.opration.contracts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class camp_fuel_store extends AppCompatActivity {


    AutoCompleteTextView sp_fuel;
    ArrayList<String> ar_fuel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camp_fuel_store);



        ar_fuel = new ArrayList<>();


        ar_fuel.add("  بنزين");
        ar_fuel.add("  جازولين");
        ar_fuel.add("  غاز");
        ar_fuel.add("  اخري");

        Casting();

        ArrayAdapter<String> adapter_sp_fuel= new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_fuel);
        sp_fuel.setAdapter(adapter_sp_fuel);
    }
    private void Casting() {
        sp_fuel = findViewById(R.id.sp_fuel);

    }
    public void fun_back(View view) {
    }
}