package com.dgmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        String firsName = "Sertac Yılmaz";
//        String lastName = "Demiray";
//        int age = 27 ;
//        String comName = "DgPays";
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                User user = new User("Sertac Yilmaz","Demiray",27,"DgPays");
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
//                intent.putExtra("firsName",firsName);
//                intent.putExtra("lastName",lastName);
//                intent.putExtra("age",age);
//                intent.putExtra("comName",comName);
                intent.putExtra("nesne",user);
                startActivity(intent);
            }
        });
    }

}