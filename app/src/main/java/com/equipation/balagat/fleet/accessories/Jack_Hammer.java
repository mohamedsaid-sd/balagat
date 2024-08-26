package com.equipation.balagat.fleet.accessories;

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

public class Jack_Hammer extends AppCompatActivity {

    LinearLayout sp_new_order,sp_replacement_order  ;

    TextInputLayout number ;

    AutoCompleteTextView sp_order_type,sp_size_type,sp_accessories_type,sp_at_complant_type;
    ArrayList<String> ar_sp_order_type,ar_sp_size_type,ar_sp_accessories_type,ar_complant_type ;
    AutoCompleteTextView sp_purpose_type,sp_accessories_type2,sp_size_type2;
    ArrayList<String> ar_sp_purpose_type,ar_sp_accessories_type2,ar_sp_size_type2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jack_hammer);
        Casting();
        ar_sp_order_type = new ArrayList<>();
        ar_sp_size_type = new ArrayList<>();
        ar_sp_size_type2 = new ArrayList<>();
        ar_complant_type = new ArrayList<>();
        ar_sp_accessories_type = new ArrayList<>();
        ar_sp_accessories_type2 = new ArrayList<>();



        ar_sp_purpose_type = new ArrayList<>();

        ar_sp_purpose_type.add("خلل في الاداء");
        ar_sp_purpose_type.add("  تلف");
        ar_sp_purpose_type.add("  عدم توافق");



        ar_sp_order_type.add("جديد");
        ar_sp_order_type.add("احلال وابدال");


        ar_sp_size_type.add("20G");
        ar_sp_size_type.add("30G");
        ar_sp_size_type.add("اخري");

        ar_sp_size_type2.add("20G");
        ar_sp_size_type2.add("30G");
        ar_sp_size_type2.add("اخري");


        ar_sp_accessories_type.add("ملحقات كاملة");
        ar_sp_accessories_type.add("خراطيش");
        ar_sp_accessories_type.add(" بنوزة");

        ar_sp_accessories_type2.add("ملحقات كاملة");
        ar_sp_accessories_type2.add(" خراطيش");
        ar_sp_accessories_type2.add(" بنوزة");



        ar_complant_type.add("   عاديه   ");
        ar_complant_type.add("   عاجلة   ");
        ar_complant_type.add(" عاجلة جدا  ");


        ArrayAdapter<String> adapter_spinner_borrow_type = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_sp_order_type);
        sp_order_type.setAdapter(adapter_spinner_borrow_type);



        ArrayAdapter<String> adapter_spinner_borrow_type2 = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_sp_size_type);
        sp_size_type.setAdapter(adapter_spinner_borrow_type2);

        ArrayAdapter<String> adapter_spinner_borrow_type22 = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_sp_size_type2);
        sp_size_type2.setAdapter(adapter_spinner_borrow_type22);



        ArrayAdapter<String> adapter_sp_accessories_type = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_sp_accessories_type);
        sp_accessories_type.setAdapter(adapter_sp_accessories_type);

        ArrayAdapter<String> adapter_sp_accessories_type2 = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_sp_accessories_type2);
        sp_accessories_type2.setAdapter(adapter_sp_accessories_type2);


        ArrayAdapter<String> adapter_spinner_borrow_type3 = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_complant_type);
        sp_at_complant_type.setAdapter(adapter_spinner_borrow_type3);




        ArrayAdapter<String> adapter_sp_purpose_type = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_sp_purpose_type);
        sp_purpose_type.setAdapter(adapter_sp_purpose_type);






        sp_order_type.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(ar_sp_order_type.get(i).equals("جديد")){
                    sp_new_order.setVisibility(View.VISIBLE);
                    sp_replacement_order.setVisibility(View.GONE);

                }else{
                    sp_new_order.setVisibility(View.GONE);

                    sp_replacement_order.setVisibility(View.VISIBLE);

                }
            }

        });



        sp_accessories_type.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(ar_sp_accessories_type.get(i).equals("خراطيش")){
                    number.setVisibility(View.VISIBLE);

                }else{
                    number.setVisibility(View.GONE);

                }
            }

        });




    }

    private void Casting() {
        sp_order_type = findViewById(R.id.sp_order_type);
        sp_size_type = findViewById(R.id.sp_size_type);
        sp_size_type2 = findViewById(R.id.sp_size_type2);
        sp_accessories_type = findViewById(R.id.sp_accessories_type);
        sp_accessories_type2 = findViewById(R.id.sp_accessories_type2);
        sp_purpose_type = findViewById(R.id.sp_purpose_type);


        sp_at_complant_type = findViewById(R.id.sp_at_complant_type);
        sp_new_order = findViewById(R.id.sp_new_order);
        sp_replacement_order = findViewById(R.id.sp_replacement_order);

        number = findViewById(R.id.number);

    }

    public void fun_back(View view) {
        super.onBackPressed();
    }
}