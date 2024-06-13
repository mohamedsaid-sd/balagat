package com.equipation.balagat.opration.production;

import androidx.appcompat.app.AppCompatActivity;
import com.equipation.balagat.R;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;


import java.util.ArrayList;

public class production_change_shift extends AppCompatActivity {

    AutoCompleteTextView sp_work_system , sp_shift ;
    ArrayList<String> ar_work_system , ar_shift ;
    LinearLayout  layout_shift ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_shift);

        ar_work_system = new ArrayList<>();
        ar_shift = new ArrayList<>();

        ar_work_system.add("وردية جديدة - جاك همر");
        ar_work_system.add("ورديتين - ساعات عمل عادية");

        ar_shift.add("دائم لنهاية العقد");
        ar_shift.add("مؤقت");

        Casting();

        ArrayAdapter<String> adapter_work_system = new ArrayAdapter<>(
                this ,   R.layout.nice_select_item
                , ar_work_system);sp_work_system.setAdapter(adapter_work_system);

        ArrayAdapter<String> adapter_shift = new ArrayAdapter<>(
                this ,    R.layout.nice_select_item
                , ar_shift);sp_shift.setAdapter(adapter_shift);

        sp_shift.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(ar_shift.get(i).equals("مؤقت")){
                    layout_shift.setVisibility(View.VISIBLE);
                }else{
                    layout_shift.setVisibility(View.GONE);
                }
            }

        });

    }

    private void Casting() {
        sp_work_system = findViewById(R.id.sp_work_system);
        sp_shift = findViewById(R.id.sp_shift);
        layout_shift = findViewById(R.id.layout_shift);
    }

    public void fun_back(View view) {
        super.onBackPressed();
    }
}