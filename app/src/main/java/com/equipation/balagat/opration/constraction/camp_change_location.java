package com.equipation.balagat.opration.constraction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class camp_change_location extends AppCompatActivity {

    AutoCompleteTextView sp_changetype;
    ArrayList<String> ar_changetype;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camp_change_location);

        ar_changetype = new ArrayList<>();


        ar_changetype.add("  موقع");
        ar_changetype.add("  مهام");

        Casting();

        ArrayAdapter<String> adapter_sp_changetype = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_changetype);
        sp_changetype.setAdapter(adapter_sp_changetype);
    }

    private void Casting() {
        sp_changetype = findViewById(R.id.sp_changetype);

    }

    public void fun_back(View view) {
        super.getOnBackPressedDispatcher().onBackPressed();
    }
}