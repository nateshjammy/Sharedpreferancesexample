package com.example.admin.sharedpreferances.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.admin.sharedpreferances.R;
import com.example.admin.sharedpreferances.Utility.Constants;
import com.example.admin.sharedpreferances.Utility.SharedPrefsUtils;

import static com.example.admin.sharedpreferances.Utility.Constants.EMAIL_ID;

public class MainActivity extends AppCompatActivity {

    SharedPrefsUtils sharedPrefsUtils;

    TextView addd,remove,checkk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPrefsUtils = new SharedPrefsUtils(MainActivity.this);

        addd = (TextView) findViewById(R.id.add);
        remove = (TextView) findViewById(R.id.remove);
        checkk = (TextView) findViewById(R.id.check);

        addd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sharedPrefsUtils.setValue(EMAIL_ID,"jammy");
            }
        });

        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sharedPrefsUtils.removeKey(EMAIL_ID);
            }
        });

        checkk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 String dataaa = sharedPrefsUtils.getStringValue(EMAIL_ID,"");
                Toast.makeText(MainActivity.this, dataaa.toString(), Toast.LENGTH_SHORT).show();

            }
        });
    }



}
