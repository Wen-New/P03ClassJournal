package com.myapplicationdev.android.p03classjournal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lvModule;
    ArrayList<String> arrayListModule;
    Button btnEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvModule = (ListView)findViewById(R.id.lvModule);

        arrayListModule = new ArrayList<String>();
        arrayListModule.add("C347");

        ArrayAdapter arrayAdapterHoliday = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayListModule);

        lvModule.setAdapter(arrayAdapterHoliday);


        lvModule.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String title = arrayListModule.get(position);

                Intent intent = new Intent(MainActivity.this, InfoModule.class);
                intent.putExtra("title", title);
                startActivity(intent);
            }
        });



    }
}
