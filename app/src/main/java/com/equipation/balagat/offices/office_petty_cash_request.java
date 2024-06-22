package com.equipation.balagat.offices;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import com.equipation.balagat.R;

import java.util.ArrayList;

public class office_petty_cash_request extends AppCompatActivity {

    LinearLayout lay_feed , lay_travel ;

    AutoCompleteTextView at_petty_cash_type  , at_prose_feed_type  , at_prose_reasone ;
    ArrayList<String> ar_petty_cash_type , ar_prose_feed_type , ar_prose_reason ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office_petty_cash_request);

        ar_petty_cash_type = new ArrayList<>();
        ar_prose_feed_type = new ArrayList<>();
        ar_prose_reason = new ArrayList<>();

        ar_petty_cash_type.add("نثرية سفر");
        ar_petty_cash_type.add("نثرية إعاشة");

        ar_prose_feed_type.add("نثرية لسفر");
        ar_prose_feed_type.add("نثرية موقع");
        ar_prose_feed_type.add("زيادة نثرية");

        ar_prose_reason.add("غلاء الاسعار");
        ar_prose_reason.add("زيادة فريق العمل");
        ar_prose_reason.add("اخري (يدوي)");

        casting();

        ArrayAdapter<String> adapter_petty_cash_type = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_petty_cash_type
        );
        at_petty_cash_type.setAdapter(adapter_petty_cash_type);
        at_petty_cash_type.setOnItemClickListener((adapterView, view, i, l) -> {
            lay_travel.setVisibility(View.GONE);
            lay_feed.setVisibility(View.GONE);
            if(ar_petty_cash_type.get(i).equals("نثرية سفر")){
                lay_travel.setVisibility(View.VISIBLE);
            }

            if(ar_petty_cash_type.get(i).equals("نثرية إعاشة")){
                lay_feed.setVisibility(View.VISIBLE);
            }
        });

        ArrayAdapter<String> adapter_prose_feed_type = new ArrayAdapter<>(this ,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item ,
                ar_prose_feed_type);
        at_prose_feed_type.setAdapter(adapter_prose_feed_type);

        ArrayAdapter<String> adapter_prose_reasone = new ArrayAdapter<>(this ,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item ,
                ar_prose_reason);
        at_prose_reasone.setAdapter(adapter_prose_reasone);


    }

    private void casting() {
        lay_feed = findViewById(R.id.layout_feed);
        lay_travel = findViewById(R.id.layout_travel);
        at_petty_cash_type = findViewById(R.id.at_petty_cash_type);
        at_prose_feed_type = findViewById(R.id.at_prose_feed_type);
        at_prose_reasone = findViewById(R.id.at_prose_reasone);
    }

    public void fun_back(View view) {
        super.getOnBackPressedDispatcher().onBackPressed();
    }
}