package com.equipation.balagat.humans;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class shift_request extends AppCompatActivity {

    Spinner sp_shift  ;
    ArrayList<String> ar_shift;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shift_request);

        ar_shift = new ArrayList<>();

        ar_shift.add("صباح");
        ar_shift.add("مساء");


        Casting();

        ArrayAdapter<String> adapter_spinner_shift = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , ar_shift);
        sp_shift.setAdapter(adapter_spinner_shift);



    }

    private void Casting() {
        sp_shift = findViewById(R.id.sp_shift);

    }

    public void fun_back(View view) {
        super.onBackPressed();
    }
}