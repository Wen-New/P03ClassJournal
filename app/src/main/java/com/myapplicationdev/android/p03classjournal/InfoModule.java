package com.myapplicationdev.android.p03classjournal;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.util.ArrayList;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class InfoModule extends AppCompatActivity {
    Button btnAdd, btnInfo, btnEmail;
    Info mydb;
    int requestCodeAdd = 1;
    ArrayList<Info>infoArray;
    ArrayAdapter<Info> infoAdapter;
    ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_module);

        btnAdd = (Button)findViewById(R.id.buttonAdd);
        btnInfo = (Button)findViewById(R.id.buttonInfo);
        btnEmail = (Button)findViewById(R.id.buttonEmail);
        lv = (ListView) this.findViewById(R.id.lv);

        infoArray = new ArrayList<Info>();
        infoAdapter = new ModulesAdapter(this,R.layout.row,infoArray);
        lv.setAdapter(infoAdapter);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InfoModule.this, AddDataInfo.class);
                startActivityForResult(intent, requestCodeAdd);
            }
        });

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to display data
                Intent rpIntent = new Intent(Intent.ACTION_VIEW);
                // Set the URL to be used.
                rpIntent.setData(Uri.parse("http://www.rp.edu.sg"));
                startActivity(rpIntent);
            }
        });

        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // The action you want this intent to do;
                // ACTION_SEND is used to indicate sending text
                Intent email = new Intent(Intent.ACTION_SEND);
                // Put essentials like email address, subject & body text
                email.putExtra(Intent.EXTRA_EMAIL,
                        new String[]{"jason_lim@rp.edu.sg"});
                email.putExtra(Intent.EXTRA_SUBJECT,
                        "Daily Grades");
                //email.putExtra(Intent.EXTRA_TEXT, mydb.getDailyGrade().toString());
                // This MIME type indicates email
                email.setType("message/rfc822");
                // createChooser shows user a list of app that can handle
                // this MIME type, which is, email
                startActivity(Intent.createChooser(email,
                        "Choose an Email client :"));

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
//array LISt

//End


        // Only handle when 2nd activity closed normally
        //  and data contains something
        if(requestCode == 1) {
        if(resultCode == RESULT_OK){
            if (data != null) {
                // Get data passed back from 2nd activity
                String like = data.getStringExtra("add");
                String statement = "";
                // If it is activity started by clicking 				//  Superman, create corresponding String
                if(requestCode == requestCodeAdd){
                    statement = "Your grade is " + like;
                  infoArray.add(new Info(like,1));
                  infoAdapter.notifyDataSetChanged();

                }

                Toast.makeText(InfoModule.this, statement,
                        Toast.LENGTH_LONG).show();
            }
        }
        }
    }
}
