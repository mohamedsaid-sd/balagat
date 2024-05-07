package com.equipation.balagat.humans;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class training_request extends AppCompatActivity {


    LinearLayout layout_offline  ;

    Spinner sp_training_type  ;

    ArrayList<String> ar_training_type   ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training_request);

        ar_training_type = new ArrayList<>();

        ar_training_type.add("اونلاين");
        ar_training_type.add("حضور");
        Casting();
        ArrayAdapter<String> adapter_training_type = new ArrayAdapter<>(this ,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item ,
                ar_training_type);
        sp_training_type.setAdapter(adapter_training_type);


        sp_training_type.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(ar_training_type.get(i).equals("حضور")){
                    layout_offline.setVisibility(View.VISIBLE);
                }else{
                    layout_offline.setVisibility(View.GONE);

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }


    private void Casting() {
        sp_training_type = findViewById(R.id.sp_training_type);


        layout_offline = findViewById(R.id.layout_offline);
    }



    public void fun_back(View view) {
        super.onBackPressed();

    }
}