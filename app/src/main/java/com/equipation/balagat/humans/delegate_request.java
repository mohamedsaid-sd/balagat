package com.equipation.balagat.humans;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class delegate_request extends AppCompatActivity {

    Spinner sp_delegate_type, sp_delegateinfo ;
    ArrayList<String> ar_delegate_type, ar_delegateinfo_type;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delegate_request);

        ar_delegate_type = new ArrayList<>();
        ar_delegateinfo_type = new ArrayList<>();

        ar_delegate_type.add("   استلام راتب ");
        ar_delegate_type.add("    استلام حافز  ");



        ar_delegateinfo_type.add("جواز سفر");
        ar_delegateinfo_type.add("   بطاقة قومية ");
        ar_delegateinfo_type.add(" رقم وطني  ");
        ar_delegateinfo_type.add(" رخصة   ");




        Casing();
        ArrayAdapter<String> adapter_spinner_borrow_type = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , ar_delegate_type);
        sp_delegate_type.setAdapter(adapter_spinner_borrow_type);

        ArrayAdapter<String> adapter_spinner_borrow_type2 = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , ar_delegateinfo_type);
        sp_delegateinfo.setAdapter(adapter_spinner_borrow_type2);

    }
    private void Casing() {
        sp_delegate_type = findViewById(R.id.sp_delegate_type);
        sp_delegateinfo = findViewById(R.id.sp_delegateinfo);
    }

    public void fun_back(View view) {
        super.onBackPressed();

    }
}