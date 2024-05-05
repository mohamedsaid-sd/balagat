package com.equipation.balagat.humans;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class shift_request extends AppCompatActivity {

    Spinner sp_shift , sp_shift_time ;
    ArrayList<String> ar_shift , ar_shift_time ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shift_request);

        ar_shift = new ArrayList<>();
        ar_shift_time = new ArrayList<>();

        ar_shift.add("صباح");
        ar_shift.add("مساء");

        ar_shift_time.add("8");
        ar_shift_time.add("10");
        ar_shift_time.add("12");

        Casting();

        ArrayAdapter<String> adapter_spinner_shift = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , ar_shift);
        sp_shift.setAdapter(adapter_spinner_shift);

        ArrayAdapter<String> adapter_spinner_shift_time = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , ar_shift_time);
        sp_shift_time.setAdapter(adapter_spinner_shift_time);

    }

    private void Casting() {
        sp_shift = findViewById(R.id.sp_shift);
        sp_shift_time = findViewById(R.id.sp_shift_time);
    }

    public void fun_back(View view) {
        super.onBackPressed();
    }
}