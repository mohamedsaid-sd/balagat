package com.equipation.balagat.humans;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class borrow_request extends AppCompatActivity {

    Spinner sp_borrow_type , sp_request_time;
    ArrayList<String> ar_borrow_type , ar_request_time;
    SeekBar seek_long , seek_short ;
    TextView txt_period_long , txt_period_short;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_borrow_request);
        Casting();

        ar_borrow_type = new ArrayList<>();
        ar_request_time = new ArrayList<>();

        ar_request_time.add("عادي");
        ar_request_time.add("عاجل");
        ar_request_time.add("عاجل جدا");

        ar_borrow_type.add("طويلة الاجل");
        ar_borrow_type.add("قصيرة الاجل");

        ArrayAdapter<String> adapter_spinner_borrow_type = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , ar_borrow_type);
        sp_borrow_type.setAdapter(adapter_spinner_borrow_type);
        sp_borrow_type.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(ar_borrow_type.get(i).equals("طويلة الاجل")){
                    seek_long.setVisibility(View.VISIBLE);
                    txt_period_long.setVisibility(View.VISIBLE);
                    seek_short.setVisibility(View.GONE);
                    txt_period_short.setVisibility(View.GONE);
                }else {
                    seek_long.setVisibility(View.GONE);
                    txt_period_long.setVisibility(View.GONE);
                    seek_short.setVisibility(View.VISIBLE);
                    txt_period_short.setVisibility(View.VISIBLE);
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

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}});

        seek_long.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if ( i == 11 || i== 12)
                    txt_period_long.setText(i + " شهر ");
                else
                    txt_period_long.setText(i + " شهور ");

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seek_short.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if(i == 3)
                txt_period_short.setText(i+" شهور ");
                else txt_period_short.setText(i+" شهر ");
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
        sp_borrow_type = findViewById(R.id.sp_borrow_type);
        sp_request_time = findViewById(R.id.sp_request_time);
        seek_long = findViewById(R.id.seek_long);
        seek_short = findViewById(R.id.seek_short);
        txt_period_long = findViewById(R.id.txt_period_long);
        txt_period_short = findViewById(R.id.txt_period_short);
    }

    public void fun_back(View view) {
        super.onBackPressed();
    }
}