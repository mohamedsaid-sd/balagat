
package com.equipation.balagat.humans;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class evaluation_request extends AppCompatActivity {


    Spinner sp_evaluation_type, sp_evaluationtime_type ;
    ArrayList<String> ar_evaluation_type, ar_evaluationtime_type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluation_request);

        ar_evaluation_type = new ArrayList<>();
        ar_evaluationtime_type = new ArrayList<>();

        ar_evaluation_type.add("  تحدبد نقاط القوه والضعف ");
        ar_evaluation_type.add("  تحديد فرص التحسين والتطوير ");
        ar_evaluation_type.add(" اخري  ");


        ar_evaluationtime_type.add("شهري");
        ar_evaluationtime_type.add("  نصف سنوي ");
        ar_evaluationtime_type.add(" سنوي  ");


        // ar_vication_type.add(" إجازة طارئة ");
        // ar_vication_type.add("  إجازة خاصة (أمومة-ولادة-زواج-وفاة-يوم صحي) ");
        // ar_vication_type.add(" إجازة من غير مرتب ");
        // ar_vication_type.add("أخرى ");


          Casing();
        ArrayAdapter<String> adapter_spinner_borrow_type = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , ar_evaluation_type);
        sp_evaluation_type.setAdapter(adapter_spinner_borrow_type);

        ArrayAdapter<String> adapter_spinner_borrow_type2 = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , ar_evaluationtime_type);
        sp_evaluationtime_type.setAdapter(adapter_spinner_borrow_type2);

    }
    private void Casing() {
        sp_evaluation_type = findViewById(R.id.sp_evaluation_type);
        sp_evaluationtime_type = findViewById(R.id.sp_evaluationtime_type);
    }

    public void fun_back(View view) {
        super.onBackPressed();

    }
}