package com.luisro00005513.labo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //==============codigo==================
        TextView first = (TextView)findViewById(R.id.txtViewFirst);
        first.setText("holi perritos!!!!!!!!!!!!!!");
        ///texto nuevo de pruebaaaaa
    }
}
