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

public class camp_change_location extends AppCompatActivity {

    AutoCompleteTextView sp_changetype;
    ArrayList<String> ar_changetype;

    LinearLayout layout_task , layout_location ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camp_change_location);

        ar_changetype = new ArrayList<>();


        ar_changetype.add("موقع");
        ar_changetype.add("مهام");

        Casting();

        ArrayAdapter<String> adapter_sp_changetype = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_changetype);
        sp_changetype.setAdapter(adapter_sp_changetype);

        sp_changetype.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(ar_changetype.get(i).equals("موقع")){
                    layout_task.setVisibility(View.GONE);
                    layout_location.setVisibility(View.VISIBLE);
                }else if(ar_changetype.get(i).equals("مهام")) {
                    layout_task.setVisibility(View.VISIBLE);
                    layout_location.setVisibility(View.GONE);
                }
            }

        });

    }

    private void Casting() {
        sp_changetype = findViewById(R.id.sp_changetype);
        layout_task = findViewById(R.id.layout_task);
        layout_location = findViewById(R.id.layout_location);

    }

    public void fun_back(View view) {
        super.getOnBackPressedDispatcher().onBackPressed();
    }
}