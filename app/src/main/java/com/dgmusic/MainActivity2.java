package com.dgmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {
    private TextView textView1,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView1 = findViewById(R.id.textView1);
       // Informations getInf = (Informations) getIntent().getSerializableExtra("nesne");

        String gelenMesaj = "Name : "+getIntent().getStringExtra("firsName") +" "
                + getIntent().getStringExtra("lastName")
                +"\nAge : "+String.valueOf(getIntent().getIntExtra("age",0)+"\nCompany Name: : " + getIntent().getStringExtra("comName"));

        textView1.setText(gelenMesaj);

        Intent i = getIntent();
         User user = (User) i.getSerializableExtra("nesne");
         String nest = user.getFirsName();
        Log.e("İSİM : ",user.getComName());
        System.out.println(nest);


    }
}