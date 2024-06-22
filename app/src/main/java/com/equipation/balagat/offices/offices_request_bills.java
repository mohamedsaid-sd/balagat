package com.equipation.balagat.offices;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class offices_request_bills extends AppCompatActivity {


    AutoCompleteTextView sp_bill_type , sp_internet_type   ;
    ArrayList<String> ar_bill_type,ar_internet_type;


    LinearLayout layout_electricity , layout_network,layout_internet ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offices_request_bills);

        ar_bill_type = new ArrayList<>();
        ar_internet_type = new ArrayList<>();


        ar_bill_type.add("كهرباء");
        ar_bill_type.add("اتصالات");
        ar_bill_type.add("انترنت");

        ar_internet_type.add("واي فاي");
        ar_internet_type.add("هاتف");




        Casting();
        ArrayAdapter<String> adapter_sp_bill_type = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_bill_type);
        sp_bill_type.setAdapter(adapter_sp_bill_type);

        sp_bill_type.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(ar_bill_type.get(i).equals("اتصالات")){
                    layout_electricity.setVisibility(View.GONE);
                    layout_network.setVisibility(View.VISIBLE);
                    layout_internet.setVisibility(View.GONE);
                }else if(ar_bill_type.get(i).equals("انترنت")) {
                    layout_electricity.setVisibility(View.GONE);
                    layout_network.setVisibility(View.GONE);
                    layout_internet.setVisibility(View.VISIBLE);
                }else {
                    layout_electricity.setVisibility(View.VISIBLE);
                    layout_network.setVisibility(View.GONE);
                    layout_internet.setVisibility(View.GONE);

                }
            }

        });


        ArrayAdapter<String> adapter_sp_internet_type= new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_internet_type);
        sp_internet_type.setAdapter(adapter_sp_internet_type);

    }
    private void Casting() {
        sp_bill_type = findViewById(R.id.sp_bill_type);
       sp_internet_type = findViewById(R.id.sp_internet_type);

          layout_electricity = findViewById(R.id.layout_electricity);
          layout_network = findViewById(R.id.layout_network);
          layout_internet = findViewById(R.id.layout_internet);

    }

    public void fun_back(View view) {
    }
}