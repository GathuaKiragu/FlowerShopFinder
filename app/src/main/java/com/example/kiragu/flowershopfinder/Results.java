package com.example.kiragu.flowershopfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class Results extends AppCompatActivity {
@Bind(R.id.listView) ListView mListView;
@Bind(R.id.resultsTextView) TextView mResultsTextView;
//    An array of available shops
    private String[] flowershops = new String[] {"Westlands Florist Center", "The red Petal florist", "Dessert Rose Florist", "Sendflowers", "Kenya Flower Council",
            "Mirriams Flowers", "Gathua flowers", "Flower Bliss", "GateWay florists", "Floral Boutique", "Sixth Sense"
    };
    private String[] flowers = new String[] {"Pine Trees", "Wedding Flowers", "Customized Roses", "Birthday Flowers", "Garden Flowers",
            "Palm Trees", "Potted and Vaced Flowers", "Anniversary Flowers", "Gifts florists", "Burial Boutique", "Garden Sense"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        ButterKnife.bind(this);
//gets location from the search shop activity Textview a
        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mResultsTextView.setText("This are then flowerShops near " + location );
// Displays the available flowershops in the given location
        MyResultsArrayAdapter adapter = new MyResultsArrayAdapter(this, android.R.layout.simple_list_item_1, flowershops, flowers);
        mListView.setAdapter(adapter);


        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String flowershop = ((TextView)view).getText().toString();
                Toast.makeText(Results.this, flowershop, Toast.LENGTH_LONG).show();
            }
        });
    }
}
