package com.equipation.balagat.contracts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class machin_need extends AppCompatActivity {


    AutoCompleteTextView sp_request_need ;
    ArrayList<String> ar_request_need;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machin_need);

        ar_request_need = new ArrayList<>();

        ar_request_need.add("  اسنان جردل ");
        ar_request_need.add(" سن جاكهمر  ");
        ar_request_need.add("  جردل شحم ");
        ar_request_need.add(" بنوزة جردل  ");
        ar_request_need.add("  بنوزة جاك همر ");
        ar_request_need.add(" كمبرسون  ");
        ar_request_need.add("  عفريتة(رافعة) ");
        ar_request_need.add(" شنطة عدة  ");
        ar_request_need.add("  خراطيش جاكهمر ");
        ar_request_need.add("  تايم شيت ");
        ar_request_need.add(" مشحمة يدوية  ");

        Casting();

        ArrayAdapter<String> adapter_spinner_borrow_type = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_request_need);
        sp_request_need.setAdapter(adapter_spinner_borrow_type);
    }

    private void Casting() {
        //date1 = findViewById(R.id.date1);

        sp_request_need = findViewById(R.id.sp_request_need);
    }

    public void fun_back(View view) {
        super.onBackPressed();
    }
}