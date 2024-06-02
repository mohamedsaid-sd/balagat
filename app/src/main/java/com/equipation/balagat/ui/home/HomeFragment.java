package com.equipation.balagat.ui.home;

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

        CardView card8 = binding.card8;
        // المخزن
        CardView card9 = binding.card9;

        CardView ly_personal_info = binding.presonalInfo;
//        ly_personal_info.setVisibility(View.INVISIBLE);

        TextView tv_maintitle = binding.maintitle ;

        // الضغط علي الموارد البشرية
        card1.setOnClickListener(view ->
                startActivity(new Intent(getActivity() , human.class)));

        // الضغط علي العقودات
        card2.setOnClickListener(view ->
                startActivity(new Intent(getActivity() , home_sub1.class)));

        // الضغط علي المشتريات
        card3.setOnClickListener(view ->
                startActivity(new Intent(getActivity() , purchases.class)));

        // الضغط علي ساعات العمل
        card4.setOnClickListener(view ->
                startActivity(new Intent(getActivity() , time.class)));


        // الضغط علي المنصرفات الادارية
        card8.setOnClickListener(view ->
                startActivity(new Intent(getActivity() , expenses.class)));

        // الضغط علي المخزن
        card9.setOnClickListener(view ->
                startActivity(new Intent(getActivity() , home_sub2.class)));

        final TextView textView = binding.textHome;

//        tv_maintitle.setOnClickListener(view -> {
//            if(ly_personal_info.getVisibility() == View.VISIBLE){
//                ly_personal_info.setVisibility(View.INVISIBLE);
//            }else {
//                ly_personal_info.setVisibility(View.VISIBLE);
//            }
//        });

        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}