package com.equipation.balagat.maintenances;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;

import com.equipation.balagat.R;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class malfunction_maintenace extends AppCompatActivity {

    LinearLayout sp_switch_layout  ;


    AutoCompleteTextView sp_change_type,sp_machine_type,sp_malfunction_type,sp_asper_type;
    ArrayList<String> ar_renew_type,ar_machine_type,ar_malfunction_type,ar_asper_type ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malfunction_maintenace);

        Casting();
        ar_renew_type = new ArrayList<>();
        ar_machine_type= new ArrayList<>();
        ar_malfunction_type= new ArrayList<>();
        ar_asper_type= new ArrayList<>();



        ar_machine_type.add("جردل");
        ar_machine_type.add("جردل+جاك همر");
        ar_machine_type.add("جاك همر");
        ar_machine_type.add("نقل");
        ar_machine_type.add("تشوين");


        ar_renew_type.add("نعم");
        ar_renew_type.add("لا");


        ar_asper_type.add(" متوفر");
        ar_asper_type.add(" غير متوفر");







        ar_malfunction_type.add("ماكينة   ");
        ar_malfunction_type.add("هيدروليك   ");
        ar_malfunction_type.add("  حركة  ");
        ar_malfunction_type.add("  كهرباء  ");
        ar_malfunction_type.add("فرامل    ");
        ar_malfunction_type.add("   الأطارات ");
        ar_malfunction_type.add("  الهيكل العام  ");


        ArrayAdapter<String> adapter_spinner_borrow_type = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_renew_type);
        sp_change_type.setAdapter(adapter_spinner_borrow_type);


        ArrayAdapter<String> adapter_spinner_borrow_type2 = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_asper_type);
        sp_asper_type.setAdapter(adapter_spinner_borrow_type2);

        ArrayAdapter<String> adapter_spinner_borrow_type3 = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_machine_type);
        sp_machine_type.setAdapter(adapter_spinner_borrow_type3);


        ArrayAdapter<String> adapter_spinner_borrow_type4 = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_malfunction_type);
        sp_malfunction_type.setAdapter(adapter_spinner_borrow_type4);


        sp_change_type.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(ar_renew_type.get(i).equals("نعم")){
                    sp_switch_layout.setVisibility(View.VISIBLE);

                }else{
                    sp_switch_layout.setVisibility(View.GONE);
                }
            }
        });


    }
    private void Casting() {
        sp_change_type = findViewById(R.id.sp_change_type);
        sp_asper_type = findViewById(R.id.sp_asper_type);
        sp_machine_type = findViewById(R.id.sp_machine_type);
        sp_malfunction_type = findViewById(R.id.sp_malfunction_type);
        sp_switch_layout = findViewById(R.id.sp_switch_layout);



    }

    public void fun_back(View view) {
        super.onBackPressed();
    }
}