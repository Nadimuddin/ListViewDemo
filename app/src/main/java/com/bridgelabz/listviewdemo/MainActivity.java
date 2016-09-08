package com.bridgelabz.listviewdemo;

/**
 * Created by Nadimuddin  on 7/9/16.
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends Activity {
    ListView mListView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing a list of object of class CountryInfo
        final ArrayList<CountryInfo> arrayList = new ArrayList<>();

        /*
        * add object of CountryInfo class to arrayList
         */
        arrayList.add(new CountryInfo(1, "China", "1,354,040,000", R.drawable.china));
        arrayList.add(new CountryInfo(2, "India", "1,210,193,422",R.drawable.india));
        arrayList.add(new CountryInfo(3, "United State", "315,761,000",R.drawable.unitedstates));
        arrayList.add(new CountryInfo(4, "Indonesia", "237,641,326",R.drawable.indonesia));
        arrayList.add(new CountryInfo(5, "Brazil", "193,946,886",R.drawable.brazil));
        arrayList.add(new CountryInfo(6, "Pakistan", "182,912,000", R.drawable.pakistan));
        arrayList.add(new CountryInfo(7, "Nigeria", "170,901,000", R.drawable.nigeria));
        arrayList.add(new CountryInfo(8, "Bangladesh", "152,518,015", R.drawable.bangladesh));
        arrayList.add(new CountryInfo(9, "Russia", "143,369,806", R.drawable.russia));
        arrayList.add(new CountryInfo(10, "Japan", "127,360,000", R.drawable.japan));

        //pass created list to adapter
        MyAdapter adapter = new MyAdapter(this, arrayList);

        // Get ListView object from xml
        mListView = (ListView) findViewById(R.id.list);


        // Assign adapter to ListView
        mListView.setAdapter(adapter);

        // ListView Item Click Listener
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition     = position;

                // ListView Clicked item value
                String  itemValue    = (String) mListView.getItemAtPosition(position);

                // Show Alert
                Toast.makeText(getApplicationContext(),
                        "Position :"+itemPosition+
                        "  Country: " +arrayList.get(itemPosition).getCountry()
                        , Toast.LENGTH_SHORT).show();

            }

        });
    }

}