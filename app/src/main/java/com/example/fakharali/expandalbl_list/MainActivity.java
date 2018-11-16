package com.example.fakharali.expandalbl_list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ExpandableListView list;
  //  TextView txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list=findViewById(R.id.list);
       // txt=findViewById(R.id.txt);

        expandable_adapter adapter=new expandable_adapter(MainActivity.this);
        list.setAdapter(adapter);
    }
}
