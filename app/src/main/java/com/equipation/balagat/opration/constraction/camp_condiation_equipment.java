package com.equipation.balagat.opration.constraction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class camp_condiation_equipment extends AppCompatActivity {

    AutoCompleteTextView sp_nameequipment;
    ArrayList<String> ar_nameequipment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camp_condiation_equipment);

        ar_nameequipment = new ArrayList<>();


        ar_nameequipment.add(" دوزر  ");
        ar_nameequipment.add(" لودر  ");
        ar_nameequipment.add("حفار   ");

        Casting();

        ArrayAdapter<String> adapter_sp_nameequipment = new ArrayAdapter<>(this,
                R.layout.nice_select_item , ar_nameequipment);
        sp_nameequipment.setAdapter(adapter_sp_nameequipment);
    }

    private void Casting() {
        sp_nameequipment = findViewById(R.id.sp_nameequipment);

    }


    public void fun_back(View view) {
    }
}