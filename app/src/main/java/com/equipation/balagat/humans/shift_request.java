package com.equipation.balagat.humans;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class shift_request extends AppCompatActivity {

    ArrayList<String> ar_shift;
    AutoCompleteTextView at_shift ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shift_request);

        ar_shift = new ArrayList<>();

        ar_shift.add("صباح");
        ar_shift.add("مساء");

        Casting();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this ,
                R.layout.nice_select_item ,
                ar_shift
        );
        at_shift.setAdapter(adapter);
        at_shift.setOnItemClickListener((adapterView, view, i, l) -> {
        });
    }

    private void Casting() {
        at_shift = findViewById(R.id.at_shift);
    }

    public void fun_back(View view) {
        super.onBackPressed();
    }
}