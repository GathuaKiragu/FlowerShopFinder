package com.example.kiragu.flowershopfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

import static android.R.attr.name;

public class SearchShop extends AppCompatActivity {
    @Bind(R.id.FindShop) Button mFindShop;
    @Bind(R.id.nameTextView) TextView mNameTextView;
    @Bind(R.id.location)
    EditText mLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_shop);
        ButterKnife.bind(this);
//        Gets User Name From the SignUp Page and Displays it in the nameTextView
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        mNameTextView.setText("Hey! " + name + " welcome To FlowerShopFinder");
//        Override method to take user to the the results page once the Find Shop Button is clicked
        mFindShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String location = mLocation.getText().toString();
                Intent intent = new Intent(SearchShop.this, Results.class);
                intent.putExtra("location", location);
                startActivity(intent);
            }
        });
    }
}
