package com.equipation.balagat.fleet.spare;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.app.AppCompatActivity;
import com.equipation.balagat.R;
import java.util.ArrayList;

public class available_spare_fleet extends AppCompatActivity {

    AutoCompleteTextView at_quantity_status ;
    ArrayList<String> ar_quantity_status ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available_spare_fleet);
        initialize();
        casting();
        fill_quantity_status();
        link_quantity_status();
    }

    private void initialize() {
        ar_quantity_status = new ArrayList<>();
    }

    private void casting() {
        at_quantity_status = findViewById(R.id.at_quantity_status);
    }

    private void fill_quantity_status() {
        ar_quantity_status.add("جديدة");
        ar_quantity_status.add("مستخدمة");
        ar_quantity_status.add("تالفة");
    }

    private void link_quantity_status() {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this , R.layout.nice_select_item , ar_quantity_status);
        at_quantity_status.setAdapter(adapter);
    }

    public void fun_back(View view) {
        super.getOnBackPressedDispatcher().onBackPressed();
    }
}