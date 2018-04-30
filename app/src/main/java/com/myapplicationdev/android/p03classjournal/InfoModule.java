package com.myapplicationdev.android.p03classjournal;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InfoModule extends AppCompatActivity {

    Button btnInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_module);

        btnInfo = (Button) findViewById(R.id.buttonInfo);
        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // Intent to display data
                Intent rpIntent = new Intent(Intent.ACTION_VIEW);
                // Set the URL to be used.
                rpIntent.setData(Uri.parse("http://www.rp.edu.sg"));
                startActivity(rpIntent);
            }
        });

    }
}
