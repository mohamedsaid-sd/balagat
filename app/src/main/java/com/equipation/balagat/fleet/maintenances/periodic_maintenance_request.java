package com.equipation.balagat.fleet.maintenances;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.app.AppCompatActivity;
import com.equipation.balagat.R;
import java.util.ArrayList;

public class periodic_maintenance_request extends AppCompatActivity {


    AutoCompleteTextView sp_machine_type ;
    ArrayList<String> ar_machine_type ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_periodic_maintenance_request);



        ar_machine_type = new ArrayList<>();

        ar_machine_type.add("جردل");
        ar_machine_type.add("جردل+جاك همر");
        ar_machine_type.add("جاك همر");
        ar_machine_type.add("نقل");
        ar_machine_type.add("تشوين");

        Casting();

        ArrayAdapter<String> adapter_machine_type;
        adapter_machine_type = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , ar_machine_type);
        sp_machine_type.setAdapter(adapter_machine_type);

    }
    private void Casting() {
        sp_machine_type = findViewById(R.id.sp_machine_type);


    }


    public void fun_back(View view) {
        super.getOnBackPressedDispatcher().onBackPressed();
    }
}