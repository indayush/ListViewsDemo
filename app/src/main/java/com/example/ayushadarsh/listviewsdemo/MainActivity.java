package com.example.ayushadarsh.listviewsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = (ListView)findViewById(R.id.myListView);

        final ArrayList<String> myfamily = new ArrayList<String>();

        myfamily.add("Ajay");
        myfamily.add("Neelam");
        myfamily.add("Ashish");
        myfamily.add("Ayush");
        myfamily.add("Aman");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,myfamily);
        // TO join listView and array, array Adapter is used. (Defining Here)

        myListView.setAdapter(arrayAdapter);
        // (Assembling Here)

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //view.setVisibility(View.GONE);
                // Item will disappear on click.

                Log.i("Tag", myfamily.get(position));

                Toast.makeText(MainActivity.this, "Hello "+myfamily.get(position), Toast.LENGTH_SHORT).show();
            }
        });


    }
}
