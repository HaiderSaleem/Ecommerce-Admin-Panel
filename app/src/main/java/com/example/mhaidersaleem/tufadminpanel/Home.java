package com.example.mhaidersaleem.tufadminpanel;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by M.HAiDER Saleem on 17/08/2018.
 */

public class Home extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);

        Button add= findViewById(R.id.add_article);
        Button add_key = findViewById(R.id.add_key);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Home.this,MainActivity.class);
                startActivity(i);
            }
        });
        add_key.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences.Editor editor = getSharedPreferences("img_data", MODE_PRIVATE).edit();
                editor.putInt("key",14);
                editor.apply();
                Toast.makeText(getApplicationContext(),"done",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
