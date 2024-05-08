package com.equipation.balagat.contracts;

import androidx.appcompat.app.AppCompatActivity;
import com.equipation.balagat.R;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;

import java.util.ArrayList;

public class change_shift extends AppCompatActivity {

    Spinner  sp_work_system , sp_shift ;
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
                this , androidx.appcompat.R.layout.support_simple_spinner_dropdown_item
                , ar_work_system);sp_work_system.setAdapter(adapter_work_system);

        ArrayAdapter<String> adapter_shift = new ArrayAdapter<>(
                this , androidx.appcompat.R.layout.support_simple_spinner_dropdown_item
                , ar_shift);sp_shift.setAdapter(adapter_shift);

        sp_shift.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(ar_shift.get(i).equals("مؤقت")){
                    layout_shift.setVisibility(View.VISIBLE);
                }else{
                    layout_shift.setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

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