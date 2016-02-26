package com.sweedelight.ganesh.sweedelight.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.sweedelight.ganesh.sweedelight.R;

import java.util.Arrays;
import java.util.List;

public class Location extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        int city = android.R.layout.simple_dropdown_item_1line;
        int area = android.R.layout.simple_dropdown_item_1line;
        int store = android.R.layout.simple_dropdown_item_1line;

        String []city_array = getResources().getStringArray(R.array.City);
        String []area_array= getResources().getStringArray(R.array.Area);
        String []store_array= getResources().getStringArray(R.array.Store);

        List<String> city_list= Arrays.asList(city_array);
        List<String> area_list= Arrays.asList(area_array);
        List<String> store_list= Arrays.asList(store_array);

        ArrayAdapter<String> adapter_city = new ArrayAdapter(this,city, city_list);
        ArrayAdapter<String> adapter_area = new ArrayAdapter(this, area, area_list);
        ArrayAdapter<String> adapter_store = new ArrayAdapter(this, store, store_list);

        AutoCompleteTextView autocompleteView_city =
                (AutoCompleteTextView) findViewById(R.id.City);
        AutoCompleteTextView autocompleteView_area =
                (AutoCompleteTextView) findViewById(R.id.Area);
        AutoCompleteTextView autocompleteView_store =
                (AutoCompleteTextView) findViewById(R.id.Store);

        autocompleteView_area.setAdapter(adapter_area);
        autocompleteView_city.setAdapter(adapter_city);
        autocompleteView_store.setAdapter(adapter_store);
    }

    public void callMainActivity(View view){
        Intent in = new Intent(getBaseContext(), MainActivity.class);
        startActivity(in);
    }
}
















