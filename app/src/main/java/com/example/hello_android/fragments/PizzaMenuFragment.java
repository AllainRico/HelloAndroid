package com.example.hello_android.fragments;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.hello_android.data.Pizza;
import com.example.hello_android.R;

public class PizzaMenuFragment extends Fragment {


    ArrayAdapter<String> itemsAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        itemsAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, Pizza.pizzaMenu);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable Bundle savedInstanceState) {
        // Inflate the xml file for the fragment
        return inflater.inflate(R.layout.activity_pizza_menu_fragment, parent, false);
    }

}