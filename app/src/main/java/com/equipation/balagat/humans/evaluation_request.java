
package com.equipation.balagat.humans;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class evaluation_request extends AppCompatActivity {


    AutoCompleteTextView at_evaluation_type, at_evaluationtime_type ;
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




          Casing();
        ArrayAdapter<String> adapter_spinner_borrow_type = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , ar_evaluation_type);
        at_evaluation_type.setAdapter(adapter_spinner_borrow_type);

        ArrayAdapter<String> adapter_spinner_borrow_type2 = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , ar_evaluationtime_type);
        at_evaluationtime_type.setAdapter(adapter_spinner_borrow_type2);

    }
    private void Casing() {
        at_evaluation_type = findViewById(R.id.at_evaluation_type);
        at_evaluationtime_type = findViewById(R.id.at_evaluationtime_type);
    }

    public void fun_back(View view) {
        super.onBackPressed();

    }
}