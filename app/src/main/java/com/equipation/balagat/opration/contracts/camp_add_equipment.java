package com.equipation.balagat.opration.contracts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class camp_add_equipment extends AppCompatActivity {


    AutoCompleteTextView sp_equipmenttype;
    ArrayList<String> ar_equipmenttype;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camp_add_equipment);


        ar_equipmenttype = new ArrayList<>();


        ar_equipmenttype.add("  حفار");
        ar_equipmenttype.add("  قلاب");
        ar_equipmenttype.add("  دوزر");
        ar_equipmenttype.add("  لودر");
        ar_equipmenttype.add("  مولد");

        Casting();

        ArrayAdapter<String> adapter_sp_equipmenttype = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_equipmenttype);
        sp_equipmenttype.setAdapter(adapter_sp_equipmenttype);
    }
    private void Casting() {
        sp_equipmenttype = findViewById(R.id.sp_equipmenttype);

    }
    public void fun_back(View view) {
    }
}