package com.example.mfahad.login_layouts;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    private ImageButton login;
    private ImageButton facebook;
    private ImageButton google;
    private ImageButton twitter;

    private EditText email;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Login page with Linear Linear Layout... For Relative Layout uncomment the Line below and comment the Linear Layout
//        setContentView(R.layout.relative_layout);
        setContentView(R.layout.linear_layout);

        email = (EditText) findViewById(R.id.etEmail);
        password = (EditText) findViewById(R.id.etPass);
        login = (ImageButton) findViewById(R.id.login);
        facebook = (ImageButton) findViewById(R.id.fb);
        google = (ImageButton) findViewById(R.id.google);
        twitter = (ImageButton) findViewById(R.id.twitter);


        // ****  Start Of Click Listeners ****
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Paste Your Desired Code Here When Click On Facebook Image Button
                Toast.makeText(MainActivity.this, "Facebook", Toast.LENGTH_SHORT).show();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Paste Your Desired Code Here When Click On Login Image Button
                Toast.makeText(MainActivity.this, "Login", Toast.LENGTH_SHORT).show();
            }
        });

        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Paste Your Desired Code Here When Click On Google Image Button
                Toast.makeText(MainActivity.this, "Google", Toast.LENGTH_SHORT).show();
            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Paste Your Desired Code Here When Click On Twitter Image Button
                Toast.makeText(MainActivity.this, "Twitter", Toast.LENGTH_SHORT).show();
            }
        });
        // **** End Of Click Listeners ****


        // focus listener for email
        email.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus)
                {
                    email.setBackgroundResource(R.drawable.textfeild);
                }
                if(!hasFocus)
                {
                    email.setBackgroundResource(R.drawable.unselect);
                }
            }
        });
        // focus Listener for Password TextFeild
        password.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus)
                {
                    password.setBackgroundResource(R.drawable.textfeild);
                }
                if(!hasFocus)
                {
                    password.setBackgroundResource(R.drawable.unselect);
                }
            }
        });
    }
}
