package com.equipation.balagat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText ed_user , ed_pass ;
    LinearLayout lay_login ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // cast the view with the screen
        Casting();

       // lay_login.startAnimation(AnimationUtils.loadAnimation(this , R.anim.fade_in));

    }

    private void Casting() {
        ed_user = findViewById(R.id.user);
        ed_pass = findViewById(R.id.pass);
        lay_login = findViewById(R.id.lay_login);
    }

    public void fun_login(View view) {

        startActivity(new Intent(this, home.class));

//        if(ed_user.getText().toString().equals("admin")) {
//            startActivity(new Intent(this, home.class));
//            finish();
//        }
//        else
//            Toast.makeText(this, "خطا في تسجيل الدخول", Toast.LENGTH_SHORT).show();

    }
}