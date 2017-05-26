package com.example.kiragu.flowershopfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static android.R.attr.name;

public class SearchShop extends AppCompatActivity {
    private TextView mNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_shop);

//        Gets User Name From the SignUp Page and Displays in the nameTextView
        mNameTextView = (TextView) findViewById(R.id.nameTextView);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        mNameTextView.setText("Hey! " + name + " Welcome To FlowerShopFinder");
    }
}
