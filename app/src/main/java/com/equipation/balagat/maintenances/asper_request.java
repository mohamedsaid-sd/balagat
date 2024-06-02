package com.equipation.balagat.maintenances;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class asper_request extends AppCompatActivity {


    Spinner sp_machine_type ,sp_perpose,sp_condition;
    ArrayList ar_machine_type,ar_perpose,ar_condition ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asper_request);

        ar_machine_type = new ArrayList<>();
        ar_perpose = new ArrayList<>();
        ar_condition = new ArrayList<>();

        ar_machine_type.add("جردل");
        ar_machine_type.add("جردل+جاك همر");
        ar_machine_type.add("جاك همر");
        ar_machine_type.add("نقل");
        ar_machine_type.add("تشوين");


        ar_perpose.add("   اسبير   ");
        ar_perpose.add("   تبديل بقطعه تالفه   ");



        ar_condition.add("عادي");
        ar_condition.add("عاجل");
        ar_condition.add("عاجل جدا");


        Casting();

        ArrayAdapter adapter_machine_type = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , ar_machine_type);
        sp_machine_type.setAdapter(adapter_machine_type);

        ArrayAdapter adapter_machine_type1 = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , ar_perpose);
        sp_perpose.setAdapter(adapter_machine_type1);

        ArrayAdapter adapter_machine_type2 = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , ar_condition);
        sp_condition.setAdapter(adapter_machine_type2);

    }

    private void Casting() {
        sp_machine_type = findViewById(R.id.sp_machine_type);
        sp_perpose = findViewById(R.id.sp_perpose);
        sp_condition = findViewById(R.id.sp_condition);


    }

    public void fun_back(View view) {
        super.onBackPressed();
    }
}