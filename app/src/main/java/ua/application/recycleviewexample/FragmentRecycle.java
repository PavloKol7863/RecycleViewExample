package ua.application.recycleviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FragmentRecycle extends Fragment{
    RecyclerView rv;
    LinearLayoutManager layoutManager;
    AdapterDish adapterDish;
    Toolbar toolbar;
    ArrayList<Dish> dishArrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_recycle, parent, false);

        toolbar = (Toolbar)v.findViewById(R.id.toolBar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);

        rv = (RecyclerView)v.findViewById(R.id.recycleViewCard);

        layoutManager = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(layoutManager);

        dishArrayList = new ArrayList<>();
        dishArrayList.add(new Dish("Американо","28 грн","250 мл",R.drawable.cofe));
        dishArrayList.add(new Dish("Лате","27 грн","250 мл", R.drawable.latte));
        dishArrayList.add(new Dish("Тайська яловичина з базиліком","136 грн","500 гр",R.drawable.taiska_yalovich));

        adapterDish = new AdapterDish(dishArrayList);
        rv.setAdapter(adapterDish);

        adapterDish.setViewOnFragment(v.findViewById(R.id.bell));


        return v;
    }
}
