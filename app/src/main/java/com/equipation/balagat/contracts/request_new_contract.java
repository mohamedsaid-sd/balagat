package com.equipation.balagat.contracts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class request_new_contract extends AppCompatActivity {

    Spinner sp_requirement ;
    ArrayList<String> ar_requirement ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_new_contract);

        ar_requirement = new ArrayList<>();

        ar_requirement.add(" طقم أسنان جردل ");
        ar_requirement.add(" جردل شحم ");
        ar_requirement.add("  سن جك همر ");
        ar_requirement.add(" خراطيش جردل همر إضافية ");
        ar_requirement.add(" مشحمة يدوية ");
        ar_requirement.add(" كمبروسسر هواء ");
        ar_requirement.add(" بنوزة جك همر ");
        ar_requirement.add(" بنوزة جردل ");

        Casting();

        ArrayAdapter<String> adapter_spinner_borrow_type = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , ar_requirement);
        sp_requirement.setAdapter(adapter_spinner_borrow_type);

    }

    private void Casting() {
        sp_requirement = findViewById(R.id.sp_requirement);
    }

    public void fun_back(View view) {
        super.onBackPressed();
    }
}