package com.myapplicationdev.android.p03classjournal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Button;
import android.view.View;
import android.widget.RadioButton;

public class AddDataInfo extends AppCompatActivity {
  RadioGroup rg;
  Button btnAdd;
    RadioButton rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_data_info);
        btnAdd = (Button)findViewById(R.id.buttonSubmit);
        rg = (RadioGroup)findViewById(R.id.rg);


        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {

                int selectedID = rg.getCheckedRadioButtonId();
                rb = (RadioButton) findViewById(selectedID);

                // Create intent & pass in String data
                Intent i = new Intent(AddDataInfo.this,InfoModule.class);
                i.putExtra("add", rb.getText().toString());
                // Set result to RESULT_OK to indicate normal			// response and pass in the intent containing the 		// like
                setResult(RESULT_OK, i);
                finish();
            }
        });

    }
}
