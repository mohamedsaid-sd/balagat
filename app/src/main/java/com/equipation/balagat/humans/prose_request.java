package com.equipation.balagat.humans;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.Spinner;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class prose_request extends AppCompatActivity {

    LinearLayout layout_travel , layout_feed ;

    AutoCompleteTextView sp_prose_type , sp_prose_feed_type  , sp_prose_reasone ;

    ArrayList<String>  ar_prose_type , ar_prose_feed_type , ar_prose_reason ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prose_request);

        ar_prose_type = new ArrayList<>();
        ar_prose_feed_type = new ArrayList<>();
        ar_prose_reason = new ArrayList<>();

        ar_prose_type.add("نثرية سفر");
        ar_prose_type.add("نثرية إعاشة");

        ar_prose_feed_type.add("نثرية لسفر");
        ar_prose_feed_type.add("نثرية موقع");
        ar_prose_feed_type.add("زيادة نثرية");

        ar_prose_reason.add("غلاء الاسعار");
        ar_prose_reason.add("زيادة فريق العمل");
        ar_prose_reason.add("اخري (يدوي)");


        Casting();

        ArrayAdapter<String> adapter_prose_type = new ArrayAdapter<>(this ,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item ,
                ar_prose_type);
        sp_prose_type.setAdapter(adapter_prose_type);

        ArrayAdapter<String> adapter_prose_feed_type = new ArrayAdapter<>(this ,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item ,
                ar_prose_feed_type);
        sp_prose_feed_type.setAdapter(adapter_prose_feed_type);

        ArrayAdapter<String> adapter_prose_reasone = new ArrayAdapter<>(this ,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item ,
                ar_prose_reason);
        sp_prose_reasone.setAdapter(adapter_prose_reasone);

        // hide the feed layout when lunch activity
        layout_feed.setVisibility(View.GONE);

        sp_prose_type.setOnItemClickListener((adapterView, view, i, l) -> {
            if(ar_prose_type.get(i).equals("نثرية إعاشة")){
                layout_feed.setVisibility(View.VISIBLE);
                layout_travel.setVisibility(View.GONE);
            }else{
                layout_feed.setVisibility(View.GONE);
                layout_travel.setVisibility(View.VISIBLE);
            }
        });

    }

    private void Casting() {
        sp_prose_type = findViewById(R.id.sp_prose_type);
        sp_prose_feed_type = findViewById(R.id.sp_prose_feed_type);
        sp_prose_reasone = findViewById(R.id.sp_prose_reasone);
        layout_travel = findViewById(R.id.layout_travel);
        layout_feed = findViewById(R.id.layout_feed);
    }


    public void fun_back(View view) {
        super.onBackPressed();


    }
}