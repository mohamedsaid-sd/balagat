package com.equipation.balagat.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.equipation.balagat.databinding.FragmentHomeBinding;
import com.equipation.balagat.main_sub_catagory;
import com.equipation.balagat.opration.main_contract;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        // الموارد البشرية
        TextView card1 = binding.card1;
        // العقودات
        TextView card2 = binding.card2;
        // المشتريات
        TextView card3 = binding.card3;
        // ساعات العمل
        TextView card4 = binding.card4;

        TextView card5 = binding.card5;
        // المخزن
        TextView card6 = binding.card6;


        // الضغط علي الموارد البشرية
        card1.setOnClickListener(view -> startActivity( new Intent( getActivity() , main_sub_catagory.class ).putExtra("FLAG" , "الموارد البشرية") ));
        // الضغط علي التشغيل
        card2.setOnClickListener(view -> startActivity( new Intent( getActivity() , main_contract.class ).putExtra("FLAG" , "العقودات")));
        // الضغط علي الاسطول
        card3.setOnClickListener(view -> startActivity( new Intent( getActivity() , main_sub_catagory.class ).putExtra("FLAG" , "الاسطول") ));
        // الضغط علي سلاسل الإمداد
        card4.setOnClickListener(view -> startActivity( new Intent( getActivity() , main_sub_catagory.class ).putExtra("FLAG" , "الدعم اللوجيستي")  ));
        // الضغط علي المكاتب والمواقع
        card5.setOnClickListener(view -> startActivity( new Intent( getActivity() , main_sub_catagory.class ).putExtra("FLAG" , "المكاتب والمعسكرات")  ));
        // الضغط علي إدارة العملاء والموردين
        card6.setOnClickListener(view -> startActivity( new Intent( getActivity() , main_sub_catagory.class ).putExtra("FLAG" , "البلاغات")  ));

        // Add zoom in animation to cards ***************
        //card1.startAnimation(AnimationUtils.loadAnimation(getActivity() , R.anim.zoom_in));
        //card2.startAnimation(AnimationUtils.loadAnimation(getActivity() , R.anim.zoom_in));
        //card3.startAnimation(AnimationUtils.loadAnimation(getActivity() , R.anim.zoom_in));
        //card4.startAnimation(AnimationUtils.loadAnimation(getActivity() , R.anim.zoom_in));
        //card5.startAnimation(AnimationUtils.loadAnimation(getActivity() , R.anim.zoom_in));
        //card6.startAnimation(AnimationUtils.loadAnimation(getActivity() , R.anim.zoom_in));

        CardView presonal_info = binding.presonalInfo;

        //presonal_info.startAnimation(AnimationUtils.loadAnimation(getActivity() , R.anim.move_up));

        ImageView imageView11 = binding.imageView11;
        //imageView11.startAnimation(AnimationUtils.loadAnimation(getActivity() , R.anim.zoom_in));

        TextView maintitle = binding.maintitle;
        //maintitle.startAnimation(AnimationUtils.loadAnimation(getActivity() , R.anim.zoom_in));

        TextView copyright = binding.copyright;
        //copyright.startAnimation(AnimationUtils.loadAnimation(getActivity() , R.anim.zoom_in));

        final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onPause() {

        super.onPause();
    }
}