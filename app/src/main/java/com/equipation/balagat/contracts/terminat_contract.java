package com.equipation.balagat.contracts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;






































































































import com.equipation.balagat.R;

import java.util.ArrayList;

public class terminat_contract extends AppCompatActivity {
//,,;


    AutoCompleteTextView sp_terminat_type,sp_ready_type,sp_timeorder_type;
    ArrayList<String> ar_terminat_typ,ar_ready_type,ar_timeorder_type ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terminat_contract);

        Casting();
        ar_terminat_typ = new ArrayList<>();
        ar_ready_type= new ArrayList<>();
        ar_timeorder_type= new ArrayList<>();



        ar_terminat_typ.add("أنتهاء العمل في الموقع");
        ar_terminat_typ.add("ضعف الانتاج");
        ar_terminat_typ.add("مشاكل الية");
        ar_terminat_typ.add("مشاكل مشغلين");


        ar_ready_type.add("متوفر");
        ar_ready_type.add("غير متوفر");
        ar_ready_type.add("علي الشركه");

        ar_timeorder_type.add("بعد يوم معين");
        ar_timeorder_type.add("مباشرة بعد الطلب");




        ArrayAdapter<String> adapter_spinner_borrow_type = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_terminat_typ);
        sp_terminat_type.setAdapter(adapter_spinner_borrow_type);


        ArrayAdapter<String> adapter_spinner_borrow_type1 = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_ready_type);
        sp_ready_type.setAdapter(adapter_spinner_borrow_type1);


        ArrayAdapter<String> adapter_spinner_borrow_type2 = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_timeorder_type);
        sp_timeorder_type.setAdapter(adapter_spinner_borrow_type2);


    }
    private void Casting() {
        sp_terminat_type = findViewById(R.id.sp_terminat_type);
        sp_ready_type = findViewById(R.id.sp_ready_type);
        sp_timeorder_type = findViewById(R.id.sp_timeorder_type);






    }

    public void fun_back(View view) {
        super.onBackPressed();
    }


}