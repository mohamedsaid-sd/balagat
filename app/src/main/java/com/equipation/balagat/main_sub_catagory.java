package com.equipation.balagat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.equipation.balagat.deportation.deportation_main;
import com.equipation.balagat.deportation.order_deportation;
import com.equipation.balagat.fleet.Monthly_inspection.Monthly_inspection;
import com.equipation.balagat.fleet.accessories.Accessories_main;
import com.equipation.balagat.fleet.spare.fleet_spare_main;
import com.equipation.balagat.fleet.maintenances.fleet_maintanance_main;
import com.equipation.balagat.folderpurchases.purchases;
import com.equipation.balagat.offices.main_offices;
import com.equipation.balagat.opration.Production_contract;
import com.equipation.balagat.opration.constraction.main_camp;
import com.equipation.balagat.opration.constraction_contract;
import com.equipation.balagat.opration.rental_contract;
import com.equipation.balagat.stocks.stock;

import java.util.Objects;

//import com.equipation.balagat.humans.cat_employee;

public class main_sub_catagory extends AppCompatActivity {

    LinearLayout lay_main ;

    LinearLayout lay_human , lay_opration , lay_fleet , lay_supply  , lay_office, lay_reports , layout_default ;

    TextView txt_name ;
    String FLAG = "" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sub_catagory);

        casting();

        // Hide All Layouts
        lay_human.setVisibility(View.GONE);
        lay_opration.setVisibility(View.GONE);
        lay_fleet.setVisibility(View.GONE);
        lay_supply.setVisibility(View.GONE);
        lay_office.setVisibility(View.GONE);
        lay_reports.setVisibility(View.GONE);

        FLAG = Objects.requireNonNull(getIntent().getExtras()).getString("FLAG");

        assert FLAG != null;
        if(FLAG.equals("الموارد البشرية")){txt_name.setText(FLAG);lay_human.setVisibility(View.VISIBLE);}
        if(FLAG.equals("الخدمات-التشغيل")){txt_name.setText(FLAG); lay_opration.setVisibility(View.VISIBLE);}
        if(FLAG.equals("الاسطول")){txt_name.setText(FLAG);lay_fleet.setVisibility(View.VISIBLE);}
        if(FLAG.equals("الدعم اللوجيستي")){txt_name.setText(FLAG);lay_supply.setVisibility(View.VISIBLE);}
        if(FLAG.equals("المكاتب والمعسكرات")){txt_name.setText(FLAG);lay_office.setVisibility(View.VISIBLE);}
        if(FLAG.equals("البلاغات")){txt_name.setText(FLAG);lay_reports.setVisibility(View.VISIBLE);}

        //lay_main.startAnimation(AnimationUtils.loadAnimation(this , R.anim.move_up));

    }

    private void casting() {
        txt_name = findViewById(R.id.txt_name);

        //
        lay_human = findViewById(R.id.lay_human);
        lay_opration = findViewById(R.id.lay_opration);
        lay_fleet = findViewById(R.id.lay_fleet);
        lay_supply = findViewById(R.id.lay_supply);
        lay_office = findViewById(R.id.lay_office);
        lay_reports = findViewById(R.id.lay_reports);
        lay_main    = findViewById(R.id.lay_main);
        layout_default = findViewById(R.id.layout_default);

    }

    public void fun_back(View view) {

        super.getOnBackPressedDispatcher().onBackPressed();

        //lay_main.startAnimation(AnimationUtils.loadAnimation(this , R.anim.move_down));
//        new Handler(Looper.getMainLooper()).postDelayed(()->{
//                    // دالة فتح الصفحة الجديدة
//
//                }
//                // الزمن المطلوب تاخيره وهو 5 ثوان
//                , 700 );
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


    public void fun_fleet_maintenance(View view) {
        startActivity(new Intent( this , fleet_maintanance_main.class ).putExtra( "FLAG" , "employee" ));
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

    public void fun_holiday(View view) {
        startActivity(new Intent( this , human.class ).putExtra( "FLAG" , "holiday" ) );

    }

    public void fun_fun_complainAndsugg(View view) {
        startActivity(new Intent( this , human.class ).putExtra( "FLAG" , "complainAndsugg" ) );
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


    public void fun_order_deportation(View view) {
        startActivity(new Intent( this , deportation_main.class ) );
    }

    @Override
    public void onBackPressed() {
        //lay_main.startAnimation(AnimationUtils.loadAnimation(this , R.anim.move_down));
//        new Handler(Looper.getMainLooper()).postDelayed(()->{
//                    // دالة فتح الصفحة الجديدة
//
//                }
//                // الزمن المطلوب تاخيره وهو 5 ثوان
//                , 700 );

        super.onBackPressed();


    }

    public void fun_offices_atbara(View view) {
        startActivity(new Intent( this , main_offices.class ));
    }

    public void fun_Monthly_inspection(View view) {
        startActivity(new Intent( this , Monthly_inspection.class ));
    }


    public void fun_fleet_spare(View view) {
        startActivity(new Intent( this , fleet_spare_main.class ));
    }

    public void fun_default(View view) {
        if(layout_default.getVisibility() == View.GONE){
            layout_default.setVisibility(View.VISIBLE);
        }else{
            layout_default.setVisibility(View.GONE);
        }
    }


    public void fun_main_camp(View view) {
        startActivity(new Intent( this , main_camp.class ));


    }

    public void fun_Accessories_main(View view) {

        startActivity(new Intent( this , Accessories_main.class ));

    }
}