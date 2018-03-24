package com.example.luca.gift4wedding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import java.util.Arrays;

public class Gift4Wedding extends AppCompatActivity {

    private ExpandableListView elvParents;
    private ArrayAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gift4_wedding);

        elvParents=(ExpandableListView)findViewById(R.id.elvParents);


        String[] parentsCoeff=new String[] {"Fratello","Genitore","Cugino","Amico"};

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, R.layout.activity_gift4_wedding,parentsCoeff);
        elvParents.setAdapter(adapter);


        final ArrayList listaAutori=new ArrayList();
        listaAutori.addAll(Arrays.asList(parentsCoeff));
        listAdapter=new ArrayAdapter(this,R.layout.activity_gift4_wedding,listaAutori);
        elvParents.setAdapter(listAdapter);
    }
}
