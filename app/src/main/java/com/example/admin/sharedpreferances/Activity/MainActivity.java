package com.example.admin.sharedpreferances.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.admin.sharedpreferances.R;
import com.example.admin.sharedpreferances.Utility.SharedPrefsUtils;

import java.util.ArrayList;

import static com.example.admin.sharedpreferances.Utility.Constants.EMAIL_ID;

public class MainActivity extends AppCompatActivity {

    SharedPrefsUtils sharedPrefsUtils;

    TextView addd,remove,checkk;

    //create arraylist
    ArrayList<String> anotherList = new ArrayList<>();


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

        //add arraylist
        anotherList.add("1");
        anotherList.add("2");
        anotherList.add("3");
        anotherList.add("4");
        anotherList.add("5");

        //get size
       // Toast.makeText(this, ""+anotherList.size(), Toast.LENGTH_SHORT).show();

        //for loop get value
//        for (int i =0;i<anotherList.size();i++){
//
//            Toast.makeText(this, ""+i, Toast.LENGTH_SHORT).show();
//        }


        //for each loop  get value
//        for (String num : anotherList )
//        {
//
//            Toast.makeText(this, ""+num, Toast.LENGTH_SHORT).show();
//        }

    }


    public void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }



    public void changeActivity(Class clz, String pStatus) {
        Intent i = new Intent(this, clz);
        startActivity(i);
    }
}
