package com.example.admin.myapplication20160516;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by admin on 2016/05/16.
 */
public class AnotherActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        TextView textView = (TextView)findViewById(R.id.buttonBack);
        setContentView(textView);

        Button button = (Button)findViewById(R.id.buttonBack);
        button.setOnClickListener(this);

        Intent intent = getIntent();
        if(intent != null){
            String str = intent.getStringExtra("com.example.admin.myapplication20160516.intentText");
            Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
        }
    }

    public void onClick(View view){
        finish();
    }
}
