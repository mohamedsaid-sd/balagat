package com.equipation.balagat.humans;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class PPE_request extends AppCompatActivity {

    Spinner sp_machine_type ,sp_machinework_type;
    ArrayList ar_machine_type,ar_machinework_type ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppe_request);

        ar_machine_type = new ArrayList<>();

        ar_machine_type.add("خوذة");
        ar_machine_type.add("حذاء سلامة");
        ar_machine_type.add("ابرول");
        ar_machine_type.add("نظارات واقية");
        ar_machine_type.add("قفازات");
        ar_machine_type.add("عاكس");
        ar_machine_type.add("كمامة");
        ar_machine_type.add("سدادات أذن");



        ar_machinework_type = new ArrayList<>();

        ar_machinework_type.add("مصنع");
        ar_machinework_type.add("منجم");
        ar_machinework_type.add("طريق");
        ar_machinework_type.add("اخري");





        Casting();

        ArrayAdapter adapter_machine_type = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , ar_machine_type);
        sp_machine_type.setAdapter(adapter_machine_type);

        ArrayAdapter adapter_machine_type2 = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , ar_machinework_type);
        sp_machinework_type.setAdapter(adapter_machine_type2);

    }

    private void Casting() {
        sp_machine_type = findViewById(R.id.sp_machine_type);

        sp_machinework_type = findViewById(R.id.sp_machinework_type);
    }

    public void fun_back(View view) {
        super.onBackPressed();
    }
}