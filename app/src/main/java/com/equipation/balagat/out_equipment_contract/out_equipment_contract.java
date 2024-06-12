package com.equipation.balagat.out_equipment_contract;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.equipation.balagat.R;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class out_equipment_contract extends AppCompatActivity {


    LinearLayout lay_step1 , lay_step2 , lay_step3 ;
    TextView txt_step1 , txt_step2 , txt_step3 ;
    SeekBar seekBar ;
    AutoCompleteTextView at_adjective , at_equipment_cat , at_equipment_tye , at_equipment_brand  , at_equipment_size,
            at_equipment_model , at_equipment_year , at_rental_value , at_equipment_evaluation;

    AutoCompleteTextView at_cotract_place , at_per_money , at_business_side , at_contracts , at_clearances ,
            at_maintenances , at_operator , at_other , at_transportation , at_work_hours , at_availabilty ,
            at_static_move , at_fule_electric , at_silent_open , at_select_digger , at_select_digger_type ;

    ArrayList<String> ar_adjective , ar_equipment_cat , ar_equipment_type  , ar_equipment_brand , ar_equipment_size ,
            ar_equipment_model , ar_equipment_year , ar_rental_value , ar_equipment_evaluation , ar_operator , ar_other ,
            ar_transportation , ar_work_hours , ar_availabilty ;

    ArrayList<String> ar_cotract_place , ar_per_money , ar_business_side , ar_contracts , ar_clearances ,
            ar_maintenances , ar_static_move , ar_fule_electric , ar_silent_open , ar_select_digger , ar_select_digger_type;

    LinearLayout lay_direct_owner , lay_agent , lay_company , lay_owner_hand , lay_select_type  , lay_select_electic ,
            lay_select_equipment;

    TextInputLayout manual_equipment_cat , manual_equipment_brand , manual_equipment_size , manual_equipment_model ,
            manual_equipment_year , manual_equipment_evaluation , manual_transportation , manual_work_hours , ti_select_digger_type ;

    TextInputLayout manual_contract_place , manual_pre_money , manual_business_side , manual_contracts , manual_clearances ,
            manual_maintenances , manual_operator , manual_other , manual_availabilty , manual_rental_value ;

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

        ar_operator = new ArrayList<>();
        ar_operator.add("تعيين بواسطة إيكوبيشن");
        ar_operator.add("تعيين بواسطتي");
        ar_operator.add("إضافة قيد جديد");

        ar_availabilty = new ArrayList<>();
        ar_availabilty.add("عند الطلب مباشرة");
        ar_availabilty.add("عند الطلب قبل xx يوم علي الاقل");
        ar_availabilty.add("إضافة قيد جديد");

        ar_other = new ArrayList<>();
        ar_other.add("دون اي قيد");
        ar_other.add("بواسطتي");
        ar_other.add("بواسطة إيكوبيشن مع خصم التكلفة كاملة");
        ar_other.add("بواسطة ايكوبيشن مع تحمل نسبة xx% فقط");
        ar_other.add("بواسطة إيكوبيشن دون خصم أي تكاليف");
        ar_other.add("إضافة قيد جديد");

        ar_transportation = new ArrayList<>();
        ar_transportation.add("دون اي قيد");
        ar_transportation.add("بواسطتي");
        ar_transportation.add("بواسطة إيكوبيشن مع خصم التكلفة كاملة");
        ar_transportation.add("بواسطة ايكوبيشن مع تحمل نسبة xx% فقط");
        ar_transportation.add("بواسطة إيكوبيشن دون خصم أي تكاليف");
        ar_transportation.add("إضافة قيد جديد");


        ar_work_hours = new ArrayList<>();
        ar_work_hours.add("دون اي قيد");
        ar_work_hours.add("لا تتجاوز xx% ساعة في اليوم");
        ar_work_hours.add("إضافة قيد جديد");

        ar_static_move = new ArrayList<>();
        ar_static_move.add("ثابت");
        ar_static_move.add("متحرك");

        ar_fule_electric = new ArrayList<>();
        ar_fule_electric.add("جاز");
        ar_fule_electric.add("كهرباء");

        ar_silent_open = new ArrayList<>();
        ar_silent_open.add("كاتم");
        ar_silent_open.add("مفتوح");

        ar_select_digger = new ArrayList<>();
        ar_select_digger.add("حفار");
        ar_select_digger.add("دوزر");
        ar_select_digger.add("قريدل");

        ar_select_digger_type = new ArrayList<>();
        ar_select_digger_type.add("مجنزر");
        ar_select_digger_type.add("عجلات");


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
        at_equipment_cat.setOnItemClickListener((adapterView, view, i, l) -> {
            if(ar_equipment_cat.get(i).equals("تصنيف جديد")){
                manual_equipment_cat.setVisibility(View.VISIBLE);
            }else{
                manual_equipment_cat.setVisibility(View.GONE);
            }
        });

        ArrayAdapter<String> adapter_equipment_tye = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_equipment_type);
        at_equipment_tye.setAdapter(adapter_equipment_tye);
        at_equipment_tye.setOnItemClickListener((adapterView, view, i, l) -> {

            lay_select_type.setVisibility(View.GONE);
            lay_select_electic.setVisibility(View.GONE);
            lay_select_equipment.setVisibility(View.GONE);
            ti_select_digger_type.setVisibility(View.GONE);

            if(ar_equipment_type.get(i).equals("كمبروسرات الهواء") ||
                    ar_equipment_type.get(i).equals("مكينات لحام")){
                lay_select_type.setVisibility(View.VISIBLE);
            }

            if(ar_equipment_type.get(i).equals("مولدات كهرباء وتور لايتس")){
                lay_select_electic.setVisibility(View.VISIBLE);
            }

            if(ar_equipment_type.get(i).equals("آليات الطرق والحفر")){
                lay_select_equipment.setVisibility(View.VISIBLE);
            }

        });

        ArrayAdapter<String> adapter_equipment_brand = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_equipment_brand);
        at_equipment_brand.setAdapter(adapter_equipment_brand);
        at_equipment_brand.setOnItemClickListener((adapterView, view, i, l) -> {
            if(ar_equipment_brand.get(i).equals("ماركة جديدة")){
                manual_equipment_brand.setVisibility(View.VISIBLE);
            }else{
                manual_equipment_brand.setVisibility(View.GONE);
            }
        });

        ArrayAdapter<String> adapter_equipment_size = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_equipment_size);
        at_equipment_size.setAdapter(adapter_equipment_size);
        at_equipment_size.setOnItemClickListener((adapterView, view, i, l) -> {
            if(ar_equipment_size.get(i).equals("إدخال مقاس جديد")){
                manual_equipment_size.setVisibility(View.VISIBLE);
            }else{
                manual_equipment_size.setVisibility(View.GONE);
            }
        });

        ArrayAdapter<String> adapter_equipment_model = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_equipment_model);
        at_equipment_model.setAdapter(adapter_equipment_model);
        at_equipment_model.setOnItemClickListener((adapterView, view, i, l) -> {
            if(ar_equipment_model.get(i).equals("إدخال موديل جديد")){
                manual_equipment_model.setVisibility(View.VISIBLE);
            }else{
                manual_equipment_model.setVisibility(View.GONE);
            }
        });

        ArrayAdapter<String> adapter_equipment_year = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_equipment_year);
        at_equipment_year.setAdapter(adapter_equipment_year);
        at_equipment_year.setOnItemClickListener((adapterView, view, i, l) -> {
            if(ar_equipment_year.get(i).equals("إدخال سنة صنع جديدة")){
                manual_equipment_year.setVisibility(View.VISIBLE);
            }else{
                manual_equipment_year.setVisibility(View.GONE);
            }
        });

        ArrayAdapter<String> adapter_rental_value = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_rental_value);
        at_rental_value.setAdapter(adapter_rental_value);
        at_rental_value.setOnItemClickListener((adapterView, view, i, l) -> {
            manual_rental_value.setVisibility(View.VISIBLE);
        });

        ArrayAdapter<String> adapter_equipment_evaluation = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_equipment_evaluation);
        at_equipment_evaluation.setAdapter(adapter_equipment_evaluation);
        at_equipment_evaluation.setOnItemClickListener((adapterView, view, i, l) -> {
            if(ar_equipment_evaluation.get(i).equals("إدخال قيد جديد")){
                manual_equipment_evaluation.setVisibility(View.VISIBLE);
            }else{
                manual_equipment_evaluation.setVisibility(View.GONE);
            }
        });

        ArrayAdapter<String> adapter_cotract_place = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_cotract_place);
        at_cotract_place.setAdapter(adapter_cotract_place);
        at_cotract_place.setOnItemClickListener((adapterView, view, i, l) -> {
            if(ar_cotract_place.get(i).equals("إضافة قيد مكان جديد") ||
                    ar_cotract_place.get(i).equals("كل ولايات السودان عدا ...") ||
                    ar_cotract_place.get(i).equals("ولاية محددة ......") ){
                manual_contract_place.setVisibility(View.VISIBLE);
            }else{
                manual_contract_place.setVisibility(View.GONE);
            }
        });

        ArrayAdapter<String> adapter_per_money = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_per_money);
        at_per_money.setAdapter(adapter_per_money);
        at_per_money.setOnItemClickListener((adapterView, view, i, l) -> {
            if(ar_per_money.get(i).equals("إضافة شرط جديد") ||
                    ar_per_money.get(i).equals("يشترط (نسبة xx% من قيمة العقد)") ){
                manual_pre_money.setVisibility(View.VISIBLE);
            }else{
                manual_pre_money.setVisibility(View.GONE);
            }
        });

        ArrayAdapter<String> adapter_business_side = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_business_side);
        at_business_side.setAdapter(adapter_business_side);
        at_business_side.setOnItemClickListener((adapterView, view, i, l) -> {
            if(ar_business_side.get(i).equals("إضافة قيد جديد")){
                manual_business_side.setVisibility(View.VISIBLE);
            }else{
                manual_business_side.setVisibility(View.GONE);
            }
        });

        ArrayAdapter<String> adapter_contracts = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_contracts);
        at_contracts.setAdapter(adapter_contracts);
        at_contracts.setOnItemClickListener((adapterView, view, i, l) -> {
            if(ar_contracts.get(i).equals("إضافة قيد جديد")){
                manual_contracts.setVisibility(View.VISIBLE);
            }else{
                manual_contracts.setVisibility(View.GONE);
            }
        });

        ArrayAdapter<String> adapter_clearances = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_clearances);
        at_clearances.setAdapter(adapter_clearances);
        at_clearances.setOnItemClickListener((adapterView, view, i, l) -> {
            if(ar_clearances.get(i).equals("إضافة قيد جديد")){
                manual_clearances.setVisibility(View.VISIBLE);
            }else{
                manual_clearances.setVisibility(View.GONE);
            }
        });

        ArrayAdapter<String> adapter_maintenances = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_maintenances);
        at_maintenances.setAdapter(adapter_maintenances);
        at_maintenances.setOnItemClickListener((adapterView, view, i, l) -> {
            if(ar_maintenances.get(i).equals("إضافة قيد جديد") ||
                    ar_maintenances.get(i).equals("بواسطة ايكوبيشن مع تحمل نسبة xx% فقط")){
                manual_maintenances.setVisibility(View.VISIBLE);
            }else{
                manual_maintenances.setVisibility(View.GONE);
            }
        });

        ArrayAdapter<String> adapter_operator = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_operator);
        at_operator.setAdapter(adapter_operator);
        at_operator.setOnItemClickListener((adapterView, view, i, l) -> {
            if(ar_operator.get(i).equals("إضافة قيد جديد")){
                manual_operator.setVisibility(View.VISIBLE);
            }else{
                manual_operator.setVisibility(View.GONE );
            }
        });

        ArrayAdapter<String> adapter_availabilty = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_availabilty);
        at_availabilty.setAdapter(adapter_availabilty);
        at_availabilty.setOnItemClickListener((adapterView, view, i, l) -> {
            if(ar_availabilty.get(i).equals("إضافة قيد جديد") ||
                    ar_availabilty.get(i).equals("عند الطلب قبل xx يوم علي الاقل")){
                manual_availabilty.setVisibility(View.VISIBLE);
            }else{
                manual_availabilty.setVisibility(View.GONE );
            }
        });

        ArrayAdapter<String> adapter_other = new ArrayAdapter<>(
                this , R.layout.nice_select_item, ar_other);
        at_other.setAdapter(adapter_other);
        at_other.setOnItemClickListener((adapterView, view, i, l) -> {
            if(ar_other.get(i).equals("إضافة قيد جديد") ||
                    ar_other.get(i).equals("بواسطة ايكوبيشن مع تحمل نسبة xx% فقط")){
                manual_other.setVisibility(View.VISIBLE);
            }else {
                manual_other.setVisibility(View.GONE);
            }
        });

        ArrayAdapter<String> adapter_transportation = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_transportation);
        at_transportation.setAdapter(adapter_transportation);
        at_transportation.setOnItemClickListener((adapterView, view, i, l) -> {
            if(ar_transportation.get(i).equals("إضافة قيد جديد") ||
                    ar_transportation.get(i).equals("بواسطة ايكوبيشن مع تحمل نسبة xx% فقط")){
                manual_transportation.setVisibility(View.VISIBLE);
            }else {
                manual_transportation.setVisibility(View.GONE);
            }
        });

        ArrayAdapter<String> adapter_work_hours = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_work_hours);
        at_work_hours.setAdapter(adapter_work_hours);
        at_work_hours.setOnItemClickListener((adapterView, view, i, l) -> {
            if(ar_work_hours.get(i).equals("إضافة قيد جديد") ||
                    ar_work_hours.get(i).equals("لا تتجاوز xx% ساعة في اليوم")){
                manual_work_hours.setVisibility(View.VISIBLE);
            }else {
                manual_work_hours.setVisibility(View.GONE);
            }
        });

        ArrayAdapter<String> adapter_static_move = new ArrayAdapter<>(
                this  , R.layout.nice_select_item , ar_static_move);
        at_static_move.setAdapter(adapter_static_move);

        ArrayAdapter<String> adapter_fule_electric = new ArrayAdapter<>(
                this  , R.layout.nice_select_item , ar_fule_electric);
        at_fule_electric.setAdapter(adapter_fule_electric);

        ArrayAdapter<String> adapter_silent_open = new ArrayAdapter<>(
                this  , R.layout.nice_select_item , ar_silent_open);
        at_silent_open.setAdapter(adapter_silent_open);

        ArrayAdapter<String> adapter_select_digger = new ArrayAdapter<>(
                this  , R.layout.nice_select_item , ar_select_digger);
        at_select_digger.setAdapter(adapter_select_digger);
        at_select_digger.setOnItemClickListener((adapterView, view, i, l) -> {
            if(ar_select_digger.get(i).equals("حفار")){
                ti_select_digger_type.setVisibility(View.VISIBLE);
            }else {
                ti_select_digger_type.setVisibility(View.GONE);
            }
        });

        ArrayAdapter<String> adapter_select_digger_type = new ArrayAdapter<>(
                this  , R.layout.nice_select_item , ar_select_digger_type);
        at_select_digger_type.setAdapter(adapter_select_digger_type);


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
        at_operator     = findViewById(R.id.at_operator);
        at_other = findViewById(R.id.at_other);
        at_transportation = findViewById(R.id.at_transportation);
        at_work_hours = findViewById(R.id.at_work_hours);
        at_availabilty  = findViewById(R.id.at_availabilty);
        at_static_move = findViewById(R.id.at_static_move);
        at_fule_electric = findViewById(R.id.at_fule_electric);
        at_silent_open = findViewById(R.id.at_silent_open);
        at_select_digger = findViewById(R.id.at_select_digger);
        at_select_digger_type = findViewById(R.id.at_select_digger_type);


        manual_equipment_cat = findViewById(R.id.manual_equipment_cat);
        manual_equipment_brand = findViewById(R.id.manual_equipment_brand);
        manual_equipment_size = findViewById(R.id.manual_equipment_size);
        manual_equipment_model = findViewById(R.id.manual_equipment_model);
        manual_equipment_year = findViewById(R.id.manual_equipment_year);
        manual_equipment_evaluation = findViewById(R.id.manual_equipment_evaluation);
        manual_contract_place = findViewById(R.id.manual_contract_place);
        manual_pre_money = findViewById(R.id.manual_pre_money);
        manual_business_side = findViewById(R.id.manual_business_side);
        manual_contracts = findViewById(R.id.manual_contracts);
        manual_clearances = findViewById(R.id.manual_clearances);
        manual_maintenances = findViewById(R.id.manual_maintenances);
        manual_operator = findViewById(R.id.manual_operator);
        manual_other = findViewById(R.id.manual_other);
        manual_transportation = findViewById(R.id.manual_transportation);
        manual_work_hours = findViewById(R.id.manual_work_hours);
        manual_availabilty = findViewById(R.id.manual_availabilty);
        manual_rental_value = findViewById(R.id.manual_rental_value);
        ti_select_digger_type = findViewById(R.id.ti_select_digger_type);

        lay_direct_owner = findViewById(R.id.lay_direct_owner);
        lay_agent = findViewById(R.id.lay_agent);
        lay_company = findViewById(R.id.lay_company);
        lay_owner_hand = findViewById(R.id.lay_owner_hand);
        lay_select_type = findViewById(R.id.lay_select_type);
        lay_select_electic = findViewById(R.id.lay_select_electic);
        lay_select_equipment = findViewById(R.id.lay_select_equipment);

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