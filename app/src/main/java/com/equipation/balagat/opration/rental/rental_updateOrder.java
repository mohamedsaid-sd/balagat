package com.equipation.balagat.opration.rental;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class rental_updateOrder extends AppCompatActivity {



    AutoCompleteTextView sp_updatetype;
    ArrayList<String> ar_updatetype;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rental_update_order);

        ar_updatetype = new ArrayList<>();


        ar_updatetype.add("تعديل في ساعات العمل");
        ar_updatetype.add("تعديل في ساعات الاستعداد");


        Casting();

        ArrayAdapter<String> adapter_machine_type = new ArrayAdapter<>(this,
                R.layout.nice_select_item , ar_updatetype);
        sp_updatetype.setAdapter(adapter_machine_type);
    }

    private void Casting() {
        sp_updatetype = findViewById(R.id.sp_updatetype);

    }
}