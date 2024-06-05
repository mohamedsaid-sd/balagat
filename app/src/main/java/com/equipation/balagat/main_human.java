package com.equipation.balagat;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.equipation.balagat.opration.Production_contract;
import com.equipation.balagat.opration.constraction_contract;
import com.equipation.balagat.opration.rental_contract;

import java.util.Objects;

//import com.equipation.balagat.humans.cat_employee;

public class main_human extends AppCompatActivity {

    LinearLayout lay_human , lay_opration , lay_fleet , lay_supply  , lay_office, lay_clients ;

    TextView txt_name ;
    String FLAG = "" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_human);

        casting();

        // Hide All Layouts
        lay_human.setVisibility(View.GONE);
        lay_opration.setVisibility(View.GONE);
        lay_fleet.setVisibility(View.GONE);
        lay_supply.setVisibility(View.GONE);
        lay_office.setVisibility(View.GONE);
        lay_clients.setVisibility(View.GONE);

        FLAG = Objects.requireNonNull(getIntent().getExtras()).getString("FLAG");

        assert FLAG != null;
        if(FLAG.equals("الموارد البشرية")){txt_name.setText(FLAG);lay_human.setVisibility(View.VISIBLE);}
        if(FLAG.equals("التشغيل")){txt_name.setText(FLAG); lay_opration.setVisibility(View.VISIBLE);}
        if(FLAG.equals("الاسطول")){txt_name.setText(FLAG);lay_fleet.setVisibility(View.VISIBLE);}
        if(FLAG.equals("سلاسل الإمداد")){txt_name.setText(FLAG);lay_supply.setVisibility(View.VISIBLE);}
        if(FLAG.equals("المكاتب والمواقع")){txt_name.setText(FLAG);lay_office.setVisibility(View.VISIBLE);}
        if(FLAG.equals("إدارة العملاء والموردين")){txt_name.setText(FLAG);lay_clients.setVisibility(View.VISIBLE);}

    }

    private void casting() {
        txt_name = findViewById(R.id.txt_name);

        //
        lay_human = findViewById(R.id.lay_human);
        lay_opration = findViewById(R.id.lay_opration);
        lay_fleet = findViewById(R.id.lay_fleet);
        lay_supply = findViewById(R.id.lay_supply);
        lay_office = findViewById(R.id.lay_office);
        lay_clients = findViewById(R.id.lay_clients);
    }

    public void fun_back(View view) {
        super.getOnBackPressedDispatcher().onBackPressed();
    }

    public void fun_cat_employee(View view) {
        startActivity(new Intent( this , human.class ).putExtra( "FLAG" , "employee" ));
    }

    public void fun_contract(View view) {
        startActivity(new Intent( this , home_sub1.class ).putExtra( "FLAG" , "employee" ));
    }

    public void fiun_stock(View view) {
        startActivity(new Intent( this , stock.class ).putExtra( "FLAG" , "employee" ));
    }
    public void fun_purchases(View view) {
        startActivity(new Intent( this , purchases.class ).putExtra( "FLAG" , "employee" ));
    }


    public void fun_maintenance(View view) {
        startActivity(new Intent( this , maintenance.class ).putExtra( "FLAG" , "employee" ));
    }




    public void fun_cat_borrow(View view) {
        startActivity(new Intent( this , human.class ).putExtra( "FLAG" , "borrow" ));
    }

    public void fun_cat_prose(View view) {
        startActivity(new Intent( this , human.class ).putExtra( "FLAG" , "prose" ));
    }

    public void fun_cat_trainig(View view) {
        startActivity(new Intent( this , human.class ).putExtra( "FLAG" , "trainig" ) );
    }

    public void fun_cat_development(View view) {
        startActivity(new Intent( this , human.class ).putExtra( "FLAG" , "development" ) );
    }

    public void fun_rental(View view) {
        startActivity(new Intent( this , rental_contract.class ).putExtra( "FLAG" , "" ) );

    }

    public void fun_production(View view) {
        startActivity(new Intent( this , Production_contract.class ).putExtra( "FLAG" , "" ) );

    }


    public void fun_constraction(View view) {
        startActivity(new Intent( this , constraction_contract.class ).putExtra( "FLAG" , "" ) );

    }
}