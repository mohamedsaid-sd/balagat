package com.equipation.balagat.maintenances;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.equipation.balagat.R;

public class asper_deportation_request extends AppCompatActivity {

    Integer Counter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asper_deportation_request);

        Counter = 2 ;

    }

    @SuppressLint("SetTextI18n")
    public void fun_add_asper(View view) {

        LinearLayout ll_view = findViewById(R.id.ll_view);

        CardView card = new CardView(this);
        card.setLayoutParams(new ViewGroup.LayoutParams( ViewGroup.LayoutParams.MATCH_PARENT , ViewGroup.LayoutParams.WRAP_CONTENT ));

        LinearLayout Layout = new LinearLayout(this);
        Layout.setOrientation(LinearLayout.VERTICAL);
        Layout.setLayoutParams(new ViewGroup.LayoutParams( ViewGroup.LayoutParams.MATCH_PARENT , ViewGroup.LayoutParams.MATCH_PARENT ));

        TextView title = new TextView(this);
        title.setLayoutParams(new ViewGroup.LayoutParams( ViewGroup.LayoutParams.MATCH_PARENT , ViewGroup.LayoutParams.WRAP_CONTENT ));
        title.setText(" بيانات القطعة " + Counter);

        EditText eq_name = new EditText(this);
        eq_name.setLayoutParams(new ViewGroup.LayoutParams( ViewGroup.LayoutParams.MATCH_PARENT , ViewGroup.LayoutParams.WRAP_CONTENT ));
        eq_name.setHint("إسم القطعة");

        EditText eq_num = new EditText(this);
        eq_num.setLayoutParams(new ViewGroup.LayoutParams( ViewGroup.LayoutParams.MATCH_PARENT , ViewGroup.LayoutParams.WRAP_CONTENT ));
        eq_num.setHint("رقم القطعة");

        EditText eq_qty = new EditText(this);
        eq_qty.setLayoutParams(new ViewGroup.LayoutParams( ViewGroup.LayoutParams.MATCH_PARENT , ViewGroup.LayoutParams.WRAP_CONTENT ));
        eq_qty.setHint(" الكمية ");

        EditText eq_unit = new EditText(this);
        eq_unit.setLayoutParams(new ViewGroup.LayoutParams( ViewGroup.LayoutParams.MATCH_PARENT , ViewGroup.LayoutParams.WRAP_CONTENT ));
        eq_unit.setHint(" الوحدة ");

        EditText eq_spesifications = new EditText(this);
        eq_spesifications.setLayoutParams(new ViewGroup.LayoutParams( ViewGroup.LayoutParams.MATCH_PARENT , ViewGroup.LayoutParams.WRAP_CONTENT ));
        eq_spesifications.setHint(" المواصفات ");

        EditText eq_purpose = new EditText(this);
        eq_purpose.setLayoutParams(new ViewGroup.LayoutParams( ViewGroup.LayoutParams.MATCH_PARENT , ViewGroup.LayoutParams.WRAP_CONTENT ));
        eq_purpose.setHint(" الغرض ");



        Layout.addView(title);
        Layout.addView(eq_name);
        Layout.addView(eq_num);
        Layout.addView(eq_qty);
        Layout.addView(eq_unit);
        Layout.addView(eq_spesifications);
        Layout.addView(eq_purpose);
        card.addView(Layout);
        ll_view.addView(card );


        Counter ++;

    }

    public void fun_back(View view) {
        super.onBackPressed();
    }
}