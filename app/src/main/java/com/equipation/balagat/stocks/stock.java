package com.equipation.balagat.stocks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.equipation.balagat.R;
import com.equipation.balagat.stocks.add_items_request;
import com.equipation.balagat.stocks.return_bill_request;
import com.equipation.balagat.stocks.withdraw_bill_request;

public class stock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock);

    }

    public void fun_back(View view) {
        super.getOnBackPressedDispatcher().onBackPressed();
    }

    public void fun_add_items(View view) {
        //
       // startActivity(new Intent(this , add_items_request.class));
    }

    public void fun_return_bill(View view) {
        //
     //   startActivity(new Intent(this , return_bill_request.class));
    }

    public void fun_withdraw_bill(View view) {
        //
      //  startActivity(new Intent(this , withdraw_bill_request.class));
    }

}