package com.equipation.balagat.ui.home;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.equipation.balagat.home_sub1;
import com.equipation.balagat.home_sub2;
import com.equipation.balagat.human;
import com.equipation.balagat.contract;
import com.equipation.balagat.main_contract;
import com.equipation.balagat.main_human;
import com.equipation.balagat.time;
import com.equipation.balagat.stock;
import com.equipation.balagat.location;
import com.equipation.balagat.fleet;
import com.equipation.balagat.maintenance;
import com.equipation.balagat.purchases;
import com.equipation.balagat.expenses;
import com.equipation.balagat.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        // الموارد البشرية
        CardView card1 = binding.card1;
        // العقودات
        CardView card2 = binding.card2;
        // المشتريات
        CardView card3 = binding.card3;
        // ساعات العمل
        CardView card4 = binding.card4;

        CardView card5 = binding.card5;
        // المخزن
        CardView card6 = binding.card6;

        CardView ly_personal_info = binding.presonalInfo;
//        ly_personal_info.setVisibility(View.INVISIBLE);

        TextView tv_maintitle = binding.maintitle ;

        // الضغط علي الموارد البشرية
        card1.setOnClickListener(view -> {
            Bundle b = ActivityOptions.makeSceneTransitionAnimation(getActivity()).toBundle();
            startActivity( new Intent( getActivity() , main_human.class ).putExtra("FLAG" , "الموارد البشرية") , b );});
        // الضغط علي التشغيل
        card2.setOnClickListener(view -> {
            Bundle b = ActivityOptions.makeSceneTransitionAnimation(getActivity()).toBundle();
            startActivity( new Intent( getActivity() , main_human.class ).putExtra("FLAG" , "التشغيل") , b ); });
        // الضغط علي الاسطول
        card3.setOnClickListener(view -> {
            Bundle b = ActivityOptions.makeSceneTransitionAnimation(getActivity()).toBundle();
            startActivity( new Intent( getActivity() , main_human.class ).putExtra("FLAG" , "الاسطول") , b ); });
        // الضغط علي سلاسل الإمداد
        card4.setOnClickListener(view -> {
            Bundle b = ActivityOptions.makeSceneTransitionAnimation(getActivity()).toBundle();
            startActivity( new Intent( getActivity() , main_human.class ).putExtra("FLAG" , "سلاسل الإمداد") , b ); });
        // الضغط علي المكاتب والمواقع
        card5.setOnClickListener(view -> {
            Bundle b = ActivityOptions.makeSceneTransitionAnimation(getActivity()).toBundle();
            startActivity( new Intent( getActivity() , main_human.class ).putExtra("FLAG" , "المكاتب والمواقع") , b ); });
        // الضغط علي إدارة العملاء والموردين
        card6.setOnClickListener(view -> {
            Bundle b = ActivityOptions.makeSceneTransitionAnimation(getActivity()).toBundle();
            startActivity( new Intent( getActivity() , main_human.class ).putExtra("FLAG" , "إدارة العملاء والموردين") , b ); });

//        // الضغط علي الموارد البشرية
//        card1.setOnClickListener(view -> {
//                    Bundle b = ActivityOptions.makeSceneTransitionAnimation(getActivity()).toBundle();
//                    startActivity(new Intent(getActivity(), main_human.class) , b);
//                }
//        );
//
//        // الضغط علي العقودات
//        card2.setOnClickListener(view ->{
//            Bundle b = ActivityOptions.makeSceneTransitionAnimation(getActivity()).toBundle();
//            startActivity(new Intent(getActivity() , home_sub1.class) , b);
//        });
//
//        // الضغط علي المشتريات
//        card3.setOnClickListener(view ->
//        {
//            Bundle b = ActivityOptions.makeSceneTransitionAnimation(getActivity()).toBundle();
//            startActivity(new Intent(getActivity(), purchases.class) , b);
//        });
//
//        // الضغط علي ساعات العمل
//        card4.setOnClickListener(view ->{
//            Bundle b = ActivityOptions.makeSceneTransitionAnimation(getActivity()).toBundle();
//            startActivity(new Intent(getActivity() , time.class) , b );
//        });
//
//        // الضغط علي المنصرفات الادارية
//        card8.setOnClickListener(view -> {
//            Bundle b = ActivityOptions.makeSceneTransitionAnimation(getActivity()).toBundle();
//            startActivity(new Intent(getActivity(), expenses.class) , b);
//        });
//
//        // الضغط علي المخزن
//        card9.setOnClickListener(view -> {
//            Bundle b = ActivityOptions.makeSceneTransitionAnimation(getActivity()).toBundle();
//            startActivity(new Intent(getActivity(), home_sub2.class), b);
//        });

        final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}