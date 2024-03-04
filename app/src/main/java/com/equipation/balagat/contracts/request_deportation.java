package com.equipation.balagat.contracts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class request_deportation extends AppCompatActivity {

    Spinner sp_renew_type;
    ArrayList<String> ar_renew_type ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_deportation);
        Casting();
        ar_renew_type = new ArrayList<>();
        ar_renew_type.add(" جديد ");
        ar_renew_type.add(" نهاية عقد ");
        ar_renew_type.add(" فسخ عقد ");

        ArrayAdapter<String> adapter_spinner_borrow_type = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, ar_renew_type);
        sp_renew_type.setAdapter(adapter_spinner_borrow_type);
    }

    private void Casting() {
        sp_renew_type = findViewById(R.id.sp_renew_type);
    }

    public void fun_back(View view) {
        super.onBackPressed();
    }

}