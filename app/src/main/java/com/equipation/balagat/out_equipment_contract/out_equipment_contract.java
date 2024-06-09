package com.equipation.balagat.out_equipment_contract;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.equipation.balagat.R;
import java.util.ArrayList;

public class out_equipment_contract extends AppCompatActivity {


    LinearLayout lay_step1 , lay_step2 , lay_step3 ;
    TextView txt_step1 , txt_step2 , txt_step3 ;
    SeekBar seekBar ;
    AutoCompleteTextView at_adjective , at_equipment_cat , at_equipment_tye , at_equipment_brand  , at_equipment_size,
            at_equipment_model , at_equipment_year , at_rental_value , at_equipment_evaluation;

    AutoCompleteTextView at_cotract_place , at_per_money , at_business_side , at_contracts , at_clearances ,
            at_maintenances;

    ArrayList<String> ar_adjective , ar_equipment_cat , ar_equipment_type  , ar_equipment_brand , ar_equipment_size ,
            ar_equipment_model , ar_equipment_year , ar_rental_value , ar_equipment_evaluation ;

    ArrayList<String> ar_cotract_place , ar_per_money , ar_business_side , ar_contracts , ar_clearances ,
            ar_maintenances;

    LinearLayout lay_direct_owner , lay_agent , lay_company , lay_owner_hand ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_out_equipment_contract);
        // الشاشة الاولي :
        // االصفة
        ar_adjective = new ArrayList<>();
        ar_adjective.add("المالك المباشر");
        ar_adjective.add("وكيل / وسيط");
        ar_adjective.add("مكتب تأجير");
        ar_adjective.add("شركة");
        ar_adjective.add("مغترب");
        ar_adjective.add("ادخال يدوي");

        ar_equipment_cat = new ArrayList<>();
        ar_equipment_cat.add("كمبروسرات هواء");
        ar_equipment_cat.add("مولدات طلقة وتر لايتس");
        ar_equipment_cat.add("مكنات لحام");
        ar_equipment_cat.add("كرينات والروافع");
        ar_equipment_cat.add("شاحنات ثقيلة");
        ar_equipment_cat.add("آليات الطرق والحفر");
        ar_equipment_cat.add("آليات خطوط البترول");
        ar_equipment_cat.add("آليات المقاولات المدنية");
        ar_equipment_cat.add("آليات التعدين");
        ar_equipment_cat.add("آليات زراعية");
        ar_equipment_cat.add("مساكن واصول متحركة");
        ar_equipment_cat.add("مركبات متوسطة وخفيفة");
        ar_equipment_cat.add("تصنيف جديد");

        ar_equipment_type = new ArrayList<>();
        ar_equipment_type.add("كمبروسرات الهواء");
        ar_equipment_type.add("مولدات كهرباء وتور لايتس");
        ar_equipment_type.add("مكينات لحام");
        ar_equipment_type.add("آليات الطرق والحفر");

        ar_equipment_brand = new ArrayList<>();
        ar_equipment_brand.add("كات");
        ar_equipment_brand.add("JCB");
        ar_equipment_brand.add("Atlas Capco");
        ar_equipment_brand.add("HYUNDAI");
        ar_equipment_brand.add("DOOSAN");
        ar_equipment_brand.add("ماركة جديدة");

        ar_equipment_size = new ArrayList<>();
        ar_equipment_size.add("(كمبروسسر) CFM 250");
        ar_equipment_size.add("(مولد) KVA 2000");
        ar_equipment_size.add("(حفار) 220");
        ar_equipment_size.add("D9R (دوزر)");
        ar_equipment_size.add("(قريدر) H160");
        ar_equipment_size.add("إدخال مقاس جديد");

        ar_equipment_model = new ArrayList<>();
        ar_equipment_model.add("HX225");
        ar_equipment_model.add("SD25");
        ar_equipment_model.add("إدخال موديل جديد");

        ar_equipment_year = new ArrayList<>();
        ar_equipment_year.add("2022");
        ar_equipment_year.add("223");
        ar_equipment_year.add("إدخال سنة صنع جديدة");

        ar_rental_value = new ArrayList<>();
        ar_rental_value.add("جنية سوداني");
        ar_rental_value.add("دولار امريكي");

        ar_equipment_evaluation = new ArrayList<>();
        ar_equipment_evaluation.add("( جديدة ) لم تتجاوز 500 ساعة أو 1500 كلم");
        ar_equipment_evaluation.add("( شبه جديدة ) مابين 501 ساعة حتى 1000 ساعة");
        ar_equipment_evaluation.add("( متوسطة ) مابين 1001 ساعة حتى 2500 ساعة");
        ar_equipment_evaluation.add("( مستهلكة ) فوق ال 2501 ساعة");
        ar_equipment_evaluation.add("إدخال قيد جديد");

        ar_cotract_place = new ArrayList<>();
        ar_cotract_place.add("ل يوجد قيود");
        ar_cotract_place.add("داخل السودان فقط");
        ar_cotract_place.add("كل ولايات السودان عدا ...");
        ar_cotract_place.add("ولاية محددة ......");
        ar_cotract_place.add("إضافة قيد مكان جديد");

        ar_per_money = new ArrayList<>();
        ar_per_money.add("لا يشترط");
        ar_per_money.add("يشترط (نسبة xx% من قيمة العقد)");
        ar_per_money.add("يشترط كامل اإليجار");
        ar_per_money.add("مؤخر (لا مانع بعد إستالم الدفعيات)");
        ar_per_money.add("إضافة شرط جديد");

        ar_business_side = new ArrayList<>();
        ar_business_side.add("لا يوجد قيد");
        ar_business_side.add("شركات فقط");
        ar_business_side.add("مقاولات فقط");
        ar_business_side.add("إضافة قيد جديد");

        ar_contracts = new ArrayList<>();
        ar_contracts.add("لا يوجد قيد");
        ar_contracts.add("عقود طويلة فقط (لا تقل عن 12 شهر)");
        ar_contracts.add("عقود متوسطة (لا تقل عن 3 شهور)");
        ar_contracts.add("عقود قصيرة (لا تذيد عن شهر)");
        ar_contracts.add("إضافة قيد جديد");

        ar_clearances = new ArrayList<>();
        ar_clearances.add("بالدولار");
        ar_clearances.add("بالجنيه السودانى");
        ar_clearances.add("إضافة قيد جديد");

        ar_maintenances = new ArrayList<>();
        ar_maintenances.add("دون اي قيد");
        ar_maintenances.add("بواسطتي");
        ar_maintenances.add("بواسطة إيكوبيشن مع خصم التكلفة كاملة");
        ar_maintenances.add("بواسطة ايكوبيشن مع تحمل نسبة xx% فقط");
        ar_maintenances.add("بواسطة إيكوبيشن دون خصم أي تكاليف");
        ar_maintenances.add("إضافة قيد جديد");


        casting();

        ArrayAdapter<String> adapter_adjective = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_adjective);
        at_adjective.setAdapter(adapter_adjective);
        at_adjective.setOnItemClickListener((adapterView, view, i, l) -> {
            lay_direct_owner.setVisibility(View.GONE);
            lay_agent.setVisibility(View.GONE);
            lay_company.setVisibility(View.GONE);
            lay_owner_hand.setVisibility(View.GONE);
            if(ar_adjective.get(i).equals("المالك المباشر")){
                lay_direct_owner.setVisibility(View.VISIBLE);
            }
            if(ar_adjective.get(i).equals("وكيل / وسيط")){
                lay_agent.setVisibility(View.VISIBLE);
            }
            if(ar_adjective.get(i).equals("شركة")){
                lay_company.setVisibility(View.VISIBLE);
            }
            if(ar_adjective.get(i).equals("ادخال يدوي")){
                lay_owner_hand.setVisibility(View.VISIBLE);
            }
        });

        ArrayAdapter<String> adapter_equipment_cat = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_equipment_cat);
        at_equipment_cat.setAdapter(adapter_equipment_cat);

        ArrayAdapter<String> adapter_equipment_tye = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_equipment_type);
        at_equipment_tye.setAdapter(adapter_equipment_tye);

        ArrayAdapter<String> adapter_equipment_brand = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_equipment_brand);
        at_equipment_brand.setAdapter(adapter_equipment_brand);

        ArrayAdapter<String> adapter_equipment_size = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_equipment_size);
        at_equipment_size.setAdapter(adapter_equipment_size);

        ArrayAdapter<String> adapter_equipment_model = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_equipment_model);
        at_equipment_model.setAdapter(adapter_equipment_model);

        ArrayAdapter<String> adapter_equipment_year = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_equipment_year);
        at_equipment_year.setAdapter(adapter_equipment_year);

        ArrayAdapter<String> adapter_rental_value = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_rental_value);
        at_rental_value.setAdapter(adapter_rental_value);

        ArrayAdapter<String> adapter_equipment_evaluation = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_equipment_evaluation);
        at_equipment_evaluation.setAdapter(adapter_equipment_evaluation);

        ArrayAdapter<String> adapter_cotract_place = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_cotract_place);
        at_cotract_place.setAdapter(adapter_cotract_place);

        ArrayAdapter<String> adapter_per_money = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_per_money);
        at_per_money.setAdapter(adapter_per_money);

        ArrayAdapter<String> adapter_business_side = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_business_side);
        at_business_side.setAdapter(adapter_business_side);

        ArrayAdapter<String> adapter_contracts = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_contracts);
        at_contracts.setAdapter(adapter_contracts);

        ArrayAdapter<String> adapter_clearances = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_clearances);
        at_clearances.setAdapter(adapter_clearances);

        ArrayAdapter<String> adapter_maintenances = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_maintenances);
        at_maintenances.setAdapter(adapter_maintenances);

    }

    private void casting() {
        lay_step1 = findViewById(R.id.lay_step1);
        lay_step2 = findViewById(R.id.lay_step2);
        lay_step3 = findViewById(R.id.lay_step3);
        txt_step1 = findViewById(R.id.txt_step1);
        txt_step2 = findViewById(R.id.txt_step2);
        txt_step3 = findViewById(R.id.txt_step3);
        seekBar = findViewById(R.id.seekBar);

        at_adjective = findViewById(R.id.at_adjective);
        at_equipment_cat = findViewById(R.id.at_equipment_cat);
        at_equipment_tye = findViewById(R.id.at_equipment_type);
        at_equipment_brand = findViewById(R.id.at_equipment_brand);
        at_equipment_size = findViewById(R.id.at_equipment_size);
        at_equipment_model = findViewById(R.id.at_equipment_model);
        at_equipment_year = findViewById(R.id.at_equipment_year);
        at_rental_value = findViewById(R.id.at_rental_value);
        at_equipment_evaluation = findViewById(R.id.at_equipment_evaluation);
        at_cotract_place = findViewById(R.id.at_cotract_place);
        at_per_money = findViewById(R.id.at_per_money);
        at_business_side = findViewById(R.id.at_business_side);
        at_contracts = findViewById(R.id.at_contracts);
        at_clearances = findViewById(R.id.at_clearances);
        at_maintenances = findViewById(R.id.at_maintenances);

        lay_direct_owner = findViewById(R.id.lay_direct_owner);
        lay_agent = findViewById(R.id.lay_agent);
        lay_company = findViewById(R.id.lay_company);
        lay_owner_hand = findViewById(R.id.lay_owner_hand);
    }

    public void fun_back(View view) {
        super.getOnBackPressedDispatcher().onBackPressed();
    }

    public void fun_second_step(View view) {

        lay_step1.setVisibility(View.GONE);
        lay_step2.setVisibility(View.VISIBLE);
        lay_step3.setVisibility(View.GONE);

        txt_step1.setTextColor(Color.WHITE);
        txt_step2.setTextColor(Color.parseColor("#EFB403"));
        txt_step3.setTextColor(Color.WHITE);

        seekBar.setProgress(1);

    }

    public void fun_third_step(View view) {

        lay_step1.setVisibility(View.GONE);
        lay_step2.setVisibility(View.GONE);
        lay_step3.setVisibility(View.VISIBLE);

        txt_step1.setTextColor(Color.WHITE);
        txt_step2.setTextColor(Color.WHITE);
        txt_step3.setTextColor(Color.parseColor("#EFB403"));

        seekBar.setProgress(2);

    }
}