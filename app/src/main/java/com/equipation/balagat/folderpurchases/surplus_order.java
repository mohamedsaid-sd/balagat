package com.equipation.balagat.folderpurchases;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class surplus_order extends AppCompatActivity {

    AutoCompleteTextView sp_surplustype;
    ArrayList<String> ar_surplustype;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surplus_order);
        ar_surplustype = new ArrayList<>();


        ar_surplustype.add("   بيع   ");
        ar_surplustype.add("   استبدال   ");
        ar_surplustype.add("  تخلص بدون فائدة  ");

        Casting();

        ArrayAdapter<String> adapter_machine_type = new ArrayAdapter<>(this,
                R.layout.nice_select_item , ar_surplustype);
        sp_surplustype.setAdapter(adapter_machine_type);
    }
    private void Casting() {
        sp_surplustype = findViewById(R.id.sp_surplustype);

    }

    public void fun_back(View view) {
    }
}