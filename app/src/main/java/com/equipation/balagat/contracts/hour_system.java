package com.equipation.balagat.contracts;

import androidx.appcompat.app.AppCompatActivity;
import com.equipation.balagat.R;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class hour_system extends AppCompatActivity {

    Spinner sp_shift , sp_shift_num ;
    ArrayList<String> ar_shift , ar_shift_num ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hour_system);

        ar_shift = new ArrayList<>();
        ar_shift_num = new ArrayList<>();

        ar_shift.add("ساعات");
        ar_shift.add("جردل");
        ar_shift.add("جاكهمر");
        ar_shift.add("استعداد");

        ar_shift_num.add("الاولي");
        ar_shift_num.add("التانية");
        ar_shift_num.add("التالتة");
        ar_shift_num.add("الرابعة");

        casting();

        ArrayAdapter<String> adapter_shift = new ArrayAdapter<>(
                this , androidx.appcompat.R.layout.support_simple_spinner_dropdown_item ,
                ar_shift);
        sp_shift.setAdapter(adapter_shift);

        ArrayAdapter<String> adapter_shift_num = new ArrayAdapter<>(
                this , androidx.appcompat.R.layout.support_simple_spinner_dropdown_item ,
                ar_shift_num);
        sp_shift_num.setAdapter(adapter_shift_num);

    }

    public void casting(){
        sp_shift = findViewById(R.id.sp_shift);
        sp_shift_num = findViewById(R.id.sp_shift_num);
    }

    public void fun_back(View view) {
        super.onBackPressed();
    }
}