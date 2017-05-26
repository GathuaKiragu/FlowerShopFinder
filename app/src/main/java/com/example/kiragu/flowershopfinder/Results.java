package com.example.kiragu.flowershopfinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Results extends AppCompatActivity {
    private ListView mListView;
    private String[] flowershops = new String[] {"Westlands Florist Center", "The red Petal florist", "Dessert Rose Florist", "Sendflowers", "Kenya Flower Council",
            "Mirriams Flowers", "Gathua flowers", "Flower Bliss", "GateWay florists", "Floral Boutique", "Sixth Sense"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        mListView = (ListView) findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, flowershops);
        mListView.setAdapter(adapter);
    }
}
