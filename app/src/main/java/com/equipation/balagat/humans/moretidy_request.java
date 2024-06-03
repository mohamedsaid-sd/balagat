package com.equipation.balagat.humans;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class moretidy_request extends AppCompatActivity {

    AutoCompleteTextView sp_moretidy_type ;
    ArrayList<String> ar_moretidy_type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moretidy_request);

        ar_moretidy_type = new ArrayList<>();

        ar_moretidy_type.add("   اداء ممتاز   ");
        ar_moretidy_type.add("   مسؤوليات اضافية   ");
        ar_moretidy_type.add("  زيادة متوسط الاجور في السوق  ");
        ar_moretidy_type.add("  قمت بتقديم قيمه اضافيه  ");
        Casing();
        ArrayAdapter<String> adapter_spinner_borrow_type = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , ar_moretidy_type);
        sp_moretidy_type.setAdapter(adapter_spinner_borrow_type);
    }
    private void Casing() {
        sp_moretidy_type = findViewById(R.id.sp_moretidy_type);

    }

    public void fun_back(View view) {
        super.onBackPressed();

    }
}