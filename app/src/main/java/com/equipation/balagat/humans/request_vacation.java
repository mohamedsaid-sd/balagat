package com.equipation.balagat.humans;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class request_vacation extends AppCompatActivity {

    Spinner sp_vacation_type ;
    ArrayList<String> ar_vication_type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_vacation);

        ar_vication_type = new ArrayList<>();
        ar_vication_type.add(" إجازة طارئة ");
        ar_vication_type.add(" إجازة مرضية ");
        ar_vication_type.add(" إجازة سنوية ");
        ar_vication_type.add("  إجازة خاصة (أمومة-ولادة-زواج-وفاة-يوم صحي) ");
        ar_vication_type.add(" إجازة من غير مرتب ");
        ar_vication_type.add("أخرى ");

        Casing();

        ArrayAdapter<String> adapter_spinner_borrow_type = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , ar_vication_type);
        sp_vacation_type.setAdapter(adapter_spinner_borrow_type);

    }

    private void Casing() {
        sp_vacation_type = findViewById(R.id.sp_vacation_type);
    }

    public void fun_back(View view) {
        super.onBackPressed();
    }

}