package com.bridgelabz.listviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Nadimuddin on 7/9/16.
 */
public class MyAdapter extends BaseAdapter
{
    private static final String TAG=MyAdapter.class.getSimpleName();

    ArrayList<CountryInfo> countryInfo;
    LayoutInflater inflater;

    //Constructor to pass array list to adapter
    MyAdapter(Context context, ArrayList<CountryInfo> countryInfo)
    {
        this.countryInfo = countryInfo;
        inflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return countryInfo.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup)
    {
        //TextView to display rank, name & population of country
        TextView rank, country, population;

        //ImageView to display flag of country
        ImageView imageView;

        view = inflater.inflate(R.layout.new_layout, viewGroup, false);

        /*
        * get component object from xml
         */
        rank = (TextView)view.findViewById(R.id.rank);
        country = (TextView)view.findViewById(R.id.country);
        population = (TextView)view.findViewById(R.id.population);
        imageView = (ImageView)view.findViewById(R.id.imageView);

        //set current rank on TextView
        rank.setText(countryInfo.get(position).getRank());

        //set current name on TextView
        country.setText(countryInfo.get(position).getCountry());

        //set current population on TextView
        population.setText(countryInfo.get(position).getPopulation());

        //set current flag on ImageView
        imageView.setImageResource(countryInfo.get(position).getImageId());

        return view;
    }
}
