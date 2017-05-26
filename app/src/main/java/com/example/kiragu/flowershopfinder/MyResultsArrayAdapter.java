package com.example.kiragu.flowershopfinder;

import android.content.Context;
import android.widget.ArrayAdapter;

/**
 * Created by kiragu on 5/26/17.
 */

public class MyResultsArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mFlowerShops;
    private String[] mFlowers;

    public MyResultsArrayAdapter(Context mContext, int resource, String[] mFlowerShops, String[] mFlowers) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mFlowerShops = mFlowerShops;
        this.mFlowers = mFlowers;
    }

    @Override
    public Object getItem(int position) {
        String flowershop = mFlowerShops[position];
        String flower = mFlowers[position];
        return String.format("%s \nSells Great: %s", flowershop, flower);
    }

    @Override
    public int getCount() {
        return mFlowerShops.length;
    }
}
