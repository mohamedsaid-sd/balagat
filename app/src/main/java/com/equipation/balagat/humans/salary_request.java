package com.equipation.balagat.humans;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class salary_request extends AppCompatActivity {

    ArrayList<String> ar_request_type  , ar_request_time;
    TextView txt_salaries , txt_month , txt_days ;
    SeekBar seek_salaries , seek_month , seek_days ;

    LinearLayout full_layout , part_layout ;

    AutoCompleteTextView at_request_type , at_request_time ;

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

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this ,
                R.layout.nice_select_item ,
                ar_request_type
        );
        at_request_type.setAdapter(adapter);
        at_request_type.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(ar_request_type.get(i).equals("راتب كامل")){
                    part_layout.setVisibility(View.GONE);
                    full_layout.setVisibility(View.VISIBLE);
                }else{
                    part_layout.setVisibility(View.VISIBLE);
                    full_layout.setVisibility(View.GONE);
                }
            }
        });

        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(
                this ,
                R.layout.nice_select_item ,
                ar_request_time
        );
        at_request_time.setAdapter(adapter2);
        at_request_time.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });



    }

    private void Casting() {
        txt_days = findViewById(R.id.txt_days);
        seek_days = findViewById(R.id.seek_days);
        txt_month = findViewById(R.id.txt_month);
        seek_month = findViewById(R.id.seek_month);
        txt_salaries = findViewById(R.id.txt_salaries);
        seek_salaries = findViewById(R.id.seek_salaries);
        full_layout = findViewById(R.id.full_layout);
        part_layout = findViewById(R.id.part_layout);
        at_request_type = findViewById(R.id.at_request_type);
        at_request_time = findViewById(R.id.at_request_time);
    }

    public void fun_back(View view) {
        super.onBackPressed();
    }
}