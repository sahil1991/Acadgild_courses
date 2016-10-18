package com.example.lenovo.android_courses3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] mobileArray = {"Android development","Digital marketing","Front-end development","Big data"};
    String sessionId;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.list_view, mobileArray);
        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               switch (position){
                   case 0:
                        intent = new Intent(getBaseContext(), Main2Activity.class);
                        intent.putExtra("sessionId", "Krishna");
                        startActivity(intent);
                       break;
                   case 1:
                       intent = new Intent(getBaseContext(), Main2Activity.class);
                       intent.putExtra("sessionId", "Abhinandan");
                       startActivity(intent);
                       break;
                   case 2:
                       intent = new Intent(getBaseContext(), Main2Activity.class);
                       intent.putExtra("sessionId", "Rahul");
                       startActivity(intent);
                       break;
                   case 3:
                       intent = new Intent(getBaseContext(), Main2Activity.class);
                       intent.putExtra("sessionId", "Rakesh");
                       startActivity(intent);
                       break;



            }
        }


    });
    }}