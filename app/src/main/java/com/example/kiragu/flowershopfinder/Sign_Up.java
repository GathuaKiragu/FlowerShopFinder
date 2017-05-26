package com.example.kiragu.flowershopfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;

public class Sign_Up extends AppCompatActivity {
    @Bind(R.id.Submit) Button mSubmit;
    @Bind(R.id.Name) EditText mName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__up);
        ButterKnife.bind(this);
//Gets the first name of user from the signup activity and passes it to the searchshop class
        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mName.getText().toString();
                Intent intent = new Intent(Sign_Up.this, SearchShop.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });

    }
}