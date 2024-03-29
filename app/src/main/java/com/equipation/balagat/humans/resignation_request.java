package com.equipation.balagat.humans;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.app.DatePickerDialog;
import android.widget.EditText;

import com.equipation.balagat.R;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.textfield.TextInputLayout;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class resignation_request extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    DatePickerDialog.OnDateSetListener dateSetListener;
//    EditText date1 ;
    private Date checkindate;


    TextInputLayout date1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resignation_request);

        Casting();
        Calendar calendar = Calendar.getInstance();

        if(calendar != null){
            checkindate = calendar.getTime();
            SimpleDateFormat df = new SimpleDateFormat("EE,d,MMMM,yyyy");
            String curent_date = df.format(checkindate);
            date1.getEditText().setText(curent_date);
        }

        // انشاء حقول جلب التواريخ
        // تاريخ الوصول
        date1.getEditText().setOnClickListener(view -> {
            Calendar calendar13 = Calendar.getInstance();
            if (calendar13 != null) {
                int year = calendar13.get(Calendar.YEAR);
                int month = calendar13.get(Calendar.MONTH);
                int day = calendar13.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(resignation_request.this, R.style.Theme_Balagat, dateSetListener, year, month, day);
                datePickerDialog.setTitle(" تاريخ ترك العمل : ");
                datePickerDialog.show();
            }
        });
        dateSetListener = (datePicker, year, month, dayOfMonth) -> {

            //وضع تاريخ اليوم فى شاشة البحث في تاريخ الوصول
            Calendar calendar1 = Calendar.getInstance();
            if (calendar1 != null) {
                Date ct = calendar1.getTime();
                SimpleDateFormat df1 = new SimpleDateFormat("EE,d,MMMM,yyyy");
                String curent_date1 = df1.format(ct);
                date1.getEditText().setText(curent_date1);
            }
        };


    }

    private void Casting() {
        //date1 = findViewById(R.id.date1);
        date1 = findViewById(R.id.date1);
    }

    public void fun_back(View view) {
        super.onBackPressed();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}