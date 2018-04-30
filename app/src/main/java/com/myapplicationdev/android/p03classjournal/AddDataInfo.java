package com.myapplicationdev.android.p03classjournal;

import android.content.Intent;
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




        btnAdd = (Button)findViewById(R.id.buttonSubmit);

        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                // Create intent & pass in String data
                Intent i = new Intent();
                i.putExtra("like", "like");
                // Set result to RESULT_OK to indicate normal			// response and pass in the intent containing the 		// like
                setResult(RESULT_OK, i);
                finish();
            }
        });
    }
    });
}
}
