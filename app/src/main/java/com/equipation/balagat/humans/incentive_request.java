package com.equipation.balagat.humans;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class incentive_request extends AppCompatActivity {


    AutoCompleteTextView sp_incentive_type ,sp_typeofinsentive_type ;

    ArrayList<String> ar_incentive_type,ar_typeofinsentive_type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incentive_request);

        ar_incentive_type = new ArrayList<>();

        ar_typeofinsentive_type = new ArrayList<>();

        ar_incentive_type.add("   اداء ممتاز   ");
        ar_incentive_type.add("   مسؤوليات اضافية   ");
        ar_incentive_type.add("  زيادة متوسط الاجور في السوق  ");
        ar_incentive_type.add("  قمت بتقديم قيمه اضافيه  ");




        ar_typeofinsentive_type.add("    مكافأة مالية   ");
        ar_typeofinsentive_type.add("    اجازة اضافية   ");
        ar_typeofinsentive_type.add("      ترقية  ");

        Casing();
        ArrayAdapter<String> adapter_spinner_borrow_type = new ArrayAdapter<>(this,
                R.layout.nice_select_item , ar_incentive_type);
        sp_incentive_type.setAdapter(adapter_spinner_borrow_type);



        ArrayAdapter<String> adapter_spinner_borrow_type2 = new ArrayAdapter<>(this,
                R.layout.nice_select_item  , ar_typeofinsentive_type);
        sp_typeofinsentive_type.setAdapter(adapter_spinner_borrow_type2);
    }



    private void Casing() {
        sp_incentive_type = findViewById(R.id.sp_incentive_type);
        sp_typeofinsentive_type = findViewById(R.id.sp_typeofinsentive_type);
    }

    public void fun_back(View view) {
        super.onBackPressed();

    }
}