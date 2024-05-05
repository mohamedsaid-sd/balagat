package com.equipation.balagat.humans;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class salary_request extends AppCompatActivity {

    Spinner sp_request_type , sp_request_time;
    ArrayList<String> ar_request_type  , ar_request_time;
    TextView txt_salaries , txt_month , txt_days ;
    SeekBar seek_salaries , seek_month , seek_days ;

    LinearLayout full_layout , part_layout ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salary_request);

        ar_request_type = new ArrayList<>();
        ar_request_time = new ArrayList<>();

        Casting();

        ar_request_type.add("راتب كامل");
        ar_request_type.add("راتب جزئي");

        ar_request_time.add("عادي");
        ar_request_time.add("عاجل");
        ar_request_time.add("عاجل جدا");


        ArrayAdapter<String> adapter_spinner_request_type = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , ar_request_type);
        sp_request_type.setAdapter(adapter_spinner_request_type);
        sp_request_type.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(salary_request.this, ""+i, Toast.LENGTH_SHORT).show();
                if(ar_request_type.get(i).equals("راتب كامل")){
                    part_layout.setVisibility(View.GONE);
                    full_layout.setVisibility(View.VISIBLE);
                }else{
                    part_layout.setVisibility(View.VISIBLE);
                    full_layout.setVisibility(View.GONE);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}});

        ArrayAdapter<String> adapter_spinner_request_time = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , ar_request_time);
        sp_request_time.setAdapter(adapter_spinner_request_time);
        sp_request_time.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
              //  Toast.makeText(salary_request.this, ""+i, Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}});


        seek_days.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                txt_days.setText(i +" يوم ");
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seek_month.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                txt_month.setText( " شهر " + i);
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seek_salaries.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if(i == 1 || i == 2)
                txt_salaries.setText(i +" مرتب " );
                else
                    txt_salaries.setText(i +" رواتب " );
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }

    private void Casting() {
        sp_request_type = findViewById(R.id.sp_request_type);
        sp_request_time = findViewById(R.id.sp_request_time);
        txt_days = findViewById(R.id.txt_days);
        seek_days = findViewById(R.id.seek_days);
        txt_month = findViewById(R.id.txt_month);
        seek_month = findViewById(R.id.seek_month);
        txt_salaries = findViewById(R.id.txt_salaries);
        seek_salaries = findViewById(R.id.seek_salaries);
        full_layout = findViewById(R.id.full_layout);
        part_layout = findViewById(R.id.part_layout);
    }

    public void fun_back(View view) {
        super.onBackPressed();
    }
}