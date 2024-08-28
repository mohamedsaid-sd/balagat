package com.equipation.balagat.opration.contracts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class camp_condiation_equipment extends AppCompatActivity {

    AutoCompleteTextView sp_nameequipment,sp_condiation;
    ArrayList<String> ar_nameequipment,ar_sp_condiation;

    LinearLayout layout_condiation1 , layout_condiation2 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camp_condiation_equipment);

        ar_nameequipment = new ArrayList<>();
        ar_sp_condiation = new ArrayList<>();

        ar_sp_condiation.add("تشغيل");
        ar_sp_condiation.add("عطل");


        ar_nameequipment.add(" دوزر  ");
        ar_nameequipment.add(" لودر  ");
        ar_nameequipment.add("حفار   ");

        Casting();

        ArrayAdapter<String> adapter_sp_nameequipment = new ArrayAdapter<>(this,
                R.layout.nice_select_item , ar_nameequipment);
        sp_nameequipment.setAdapter(adapter_sp_nameequipment);


        ArrayAdapter<String> adapter_sp_condiation = new ArrayAdapter<>(this,
                R.layout.nice_select_item , ar_sp_condiation);
        sp_condiation.setAdapter(adapter_sp_condiation);

        sp_condiation.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(ar_sp_condiation.get(i).equals("تشغيل")){
                    layout_condiation2.setVisibility(View.GONE);
                    layout_condiation1.setVisibility(View.VISIBLE);
                }else if(ar_sp_condiation.get(i).equals("عطل")) {
                    layout_condiation2.setVisibility(View.VISIBLE);
                    layout_condiation1.setVisibility(View.GONE);
                }
            }

        });
    }

    private void Casting() {
        sp_nameequipment = findViewById(R.id.sp_nameequipment);
        sp_condiation = findViewById(R.id.sp_condiation);
        layout_condiation1 = findViewById(R.id.layout_condiation1);
        layout_condiation2 = findViewById(R.id.layout_condiation2);


    }


    public void fun_back(View view) {
    }
}