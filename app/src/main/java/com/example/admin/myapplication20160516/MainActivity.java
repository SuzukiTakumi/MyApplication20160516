package com.example.admin.myapplication20160516;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.buttonIntent);
        button.setOnClickListener(this);
    }

    public void onClick(View view){
        Intent intent = new Intent();
        intent.setClassName("com.example.admin.myapplication20160516","com.example.admin.myapplication20160516.AnotherActivity");
        intent.putExtra("com.example.admin.myapplication20160516.intentText","Yeah!");

        startActivity(intent);
    }
}
