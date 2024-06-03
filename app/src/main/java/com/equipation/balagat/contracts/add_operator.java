package com.equipation.balagat.contracts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.Spinner;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class add_operator extends AppCompatActivity {


    LinearLayout sp_updateoperator_layout ,sp_addoperator_layout ;
    AutoCompleteTextView sp_complant_contract, sp_operator_type,sp_whyupdateoperator_type ,sp_timeaddoperator_type;
    ArrayList<String> ar_complant_contract, ar_operator_type,ar_whyupdateoperator_type,ar_timeaddoperator_type ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_operator);


        ar_complant_contract = new ArrayList<>();
        ar_operator_type = new ArrayList<>();
        ar_whyupdateoperator_type = new ArrayList<>();
        ar_timeaddoperator_type = new ArrayList<>();


        ar_complant_contract.add("  اضافة مشغل  ");
        ar_complant_contract.add("تعديل مشغل");


        ar_operator_type.add("حفار   ");
        ar_operator_type.add("قلاب   ");
        ar_operator_type.add("لودر   ");
        ar_operator_type.add("دوزر   ");
        ar_operator_type.add("قريدر   ");
        ar_operator_type.add("اخري   ");



        ar_whyupdateoperator_type.add("ضعف اداء   ");
        ar_whyupdateoperator_type.add("مشاكل في الموقع   ");
        ar_whyupdateoperator_type.add(" غير مناسب لعمل الموقع   ");
        ar_whyupdateoperator_type.add("اخري   ");




        ar_timeaddoperator_type.add("عادي   ");
        ar_timeaddoperator_type.add("عاجل   ");
        ar_timeaddoperator_type.add("عاجل جدا   ");



        Casing();

        ArrayAdapter<String> adapter_spinner_borrow_type = new ArrayAdapter<>(this,
                R.layout.nice_select_item , ar_complant_contract);
        sp_complant_contract.setAdapter(adapter_spinner_borrow_type);


        ArrayAdapter<String> adapter_spinner_borrow_type2 = new ArrayAdapter<>(this,
                R.layout.nice_select_item , ar_operator_type);
        sp_operator_type.setAdapter(adapter_spinner_borrow_type2);



        ArrayAdapter<String> adapter_spinner_borrow_type3 = new ArrayAdapter<>(this,
                R.layout.nice_select_item , ar_whyupdateoperator_type);
        sp_whyupdateoperator_type.setAdapter(adapter_spinner_borrow_type3);



        ArrayAdapter<String> adapter_spinner_borrow_type4 = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_timeaddoperator_type);
        sp_timeaddoperator_type.setAdapter(adapter_spinner_borrow_type4);





        sp_complant_contract.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(ar_complant_contract.get(i).equals("تعديل مشغل")){
                    sp_updateoperator_layout.setVisibility(View.VISIBLE);
                    sp_addoperator_layout.setVisibility(View.GONE);

                }else{
                    sp_addoperator_layout.setVisibility(View.VISIBLE);
                    sp_updateoperator_layout.setVisibility(View.GONE);

                }
            }


        });

    }

    private void Casing() {
        sp_complant_contract = findViewById(R.id.sp_complant_contract);
        sp_operator_type = findViewById(R.id.sp_operator_type);
        sp_whyupdateoperator_type = findViewById(R.id.sp_whyupdateoperator_type);
        sp_timeaddoperator_type = findViewById(R.id.sp_timeaddoperator_type);


        sp_addoperator_layout = findViewById(R.id.sp_addoperator_layout);

        sp_updateoperator_layout = findViewById(R.id.sp_updateoperator_layout);
    }

    public void fun_back(View view) {
        super.onBackPressed();

    }
}