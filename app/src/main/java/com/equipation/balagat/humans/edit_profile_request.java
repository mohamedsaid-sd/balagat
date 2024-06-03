package com.equipation.balagat.humans;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.equipation.balagat.R;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class edit_profile_request extends AppCompatActivity {

    AutoCompleteTextView at_profile , at_opration ;
    ArrayList<String> ar_profile , ar_opration ;
    TextInputLayout ti_profile ;
    LinearLayout layout_attach , layout_toggle ;
    TextView txt_visable , txt_gone ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile_request);
        ar_profile = new ArrayList<>();
        ar_opration = new ArrayList<>();

        ar_profile.add("الاسم");
        ar_profile.add("رقم الهوية");
        ar_profile.add("الحالة الاجتماعية");
        ar_profile.add("تاريخ الميلاد");
        ar_profile.add("العنوان");
        ar_profile.add("رقم الهاتف");
        ar_profile.add("الحساب البنكى");
        ar_profile.add("رخصة القيادة");

        ar_opration.add("إضافة");
        ar_opration.add("تعديل");

        casting();

        ArrayAdapter<String> adapter_profile = new ArrayAdapter<>(this,
                R.layout.nice_select_item , ar_profile);
        at_profile.setAdapter(adapter_profile);

        at_profile.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                layout_attach.setVisibility(View.INVISIBLE);
                ti_profile.setHint(ar_profile.get(i));
                if(ar_profile.get(i).equals("الاسم") || ar_profile.get(i).equals("رقم الهوية") ||
                        ar_profile.get(i).equals("تاريخ الميلاد") || ar_profile.get(i).equals("رخصة القيادة")){
                    layout_attach.setVisibility(View.VISIBLE);
                }
            }
        });

        at_profile.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayAdapter<String> adapter_opration = new ArrayAdapter<>(this,
                R.layout.nice_select_item , ar_opration);
        at_opration.setAdapter(adapter_opration);

    }

    private void casting() {
        at_profile = findViewById(R.id.at_profile);
        at_opration = findViewById(R.id.at_opration);
        ti_profile = findViewById(R.id.ti_profile);
        layout_attach = findViewById(R.id.layout_attach);
        layout_toggle = findViewById(R.id.layout_toggle);
        txt_visable = findViewById(R.id.txt_visable);
        txt_gone = findViewById(R.id.txt_gone);
    }

    public void fun_back(View view) {
        super.onBackPressed();
    }

    public void fun_toggle(View view) {
        txt_visable.setVisibility(View.GONE);
        txt_gone.setVisibility(View.GONE);
        if(layout_toggle.getVisibility() == View.GONE){
            layout_toggle.setVisibility(View.VISIBLE);
            txt_gone.setVisibility(View.VISIBLE);
        }else {
            layout_toggle.setVisibility(View.GONE);
            txt_visable.setVisibility(View.VISIBLE);
        }
    }
}