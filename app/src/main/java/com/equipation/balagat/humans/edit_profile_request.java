package com.equipation.balagat.humans;

import androidx.appcompat.app.AppCompatActivity;
import com.equipation.balagat.R;
import android.os.Bundle;
import android.view.View;

public class edit_profile_request extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile_request);
    }

    public void fun_back(View view) {
        super.onBackPressed();
    }
}