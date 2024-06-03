package com.equipation.balagat.contracts;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;


import androidx.appcompat.app.AppCompatActivity;
import com.equipation.balagat.R;
import java.util.ArrayList;

public class increase_time extends AppCompatActivity {

    AutoCompleteTextView sp_hour_type , sp_work_way , sp_shift ;
    ArrayList<String> ar_hour_type , ar_work_way , ar_shift ;
    LinearLayout layout_shift;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_increase_time);

        ar_hour_type = new ArrayList<>();
        ar_work_way = new ArrayList<>();
        ar_shift = new ArrayList<>();

        ar_hour_type.add("جردل");
        ar_hour_type.add("جاك همر");
        ar_hour_type.add("ساعات عمل عادية");

        ar_work_way.add("بنظام الورديات السابق");
        ar_work_way.add("تعديل الورديات");

        ar_shift.add("وردية واحدة");
        ar_shift.add("ورديتين");

        Casting();

        ArrayAdapter<String> adapter_hour_type = new ArrayAdapter<>(
                this , R.layout.nice_select_item
                , ar_hour_type);sp_hour_type.setAdapter(adapter_hour_type);

        ArrayAdapter<String> adapter_work_way = new ArrayAdapter<>(
                this , R.layout.nice_select_item
                , ar_work_way);sp_work_way.setAdapter(adapter_work_way);

                sp_work_way.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        if(ar_work_way.get(i).equals("تعديل الورديات")){
                            layout_shift.setVisibility(View.VISIBLE);
                        }else{
                            layout_shift.setVisibility(View.GONE);
                        }
                    }

                });

        ArrayAdapter<String> adapter_shift =new ArrayAdapter<>(
                this ,  R.layout.nice_select_item
                , ar_shift);sp_shift.setAdapter(adapter_shift);



    }

    private void Casting() {
        sp_hour_type = findViewById(R.id.sp_hour_type);
        sp_work_way = findViewById(R.id.sp_work_way);
        sp_shift = findViewById(R.id.sp_shift);
        layout_shift = findViewById(R.id.layout_shift);
    }

    public void fun_back(View view) {
        super.onBackPressed();
    }
}