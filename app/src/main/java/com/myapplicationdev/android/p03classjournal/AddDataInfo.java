package com.myapplicationdev.android.p03classjournal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Button;
import android.view.View;

public class AddDataInfo extends AppCompatActivity {
  RadioGroup rg;
  Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_data_info);
        btn = (Button)findViewById(R.id.buttonSubmit);
        rg = (RadioGroup)findViewById(R.id.rg);

        btn.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(View v) {

                

    }
    });
}
}
