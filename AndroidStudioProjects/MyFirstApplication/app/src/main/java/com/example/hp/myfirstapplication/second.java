package com.example.hp.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by HP on 28/10/2015.
 */
public class second extends AppCompatActivity {
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        TextView tv= (TextView) findViewById(R.id.textView);
        tv.setText("Hello, "+ getIntent().getExtras().getString("t"));

}
}
