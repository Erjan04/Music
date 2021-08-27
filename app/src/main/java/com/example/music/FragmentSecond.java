package com.example.music;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class FragmentSecond extends Fragment implements FragAdapter.onClick{

    private RecyclerView recyclerView;
    private ArrayList<Model> list = new ArrayList<>();
    private FragAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initFrag(view);
        createList();
    }
    private void initFrag(View view) {
        recyclerView = view.findViewById(R.id.recycler_rv);
        adapter = new FragAdapter();
        adapter.FragmentAdapter(createList(),this);
        recyclerView.setAdapter(adapter);
    }
    private ArrayList<Model> createList() {
        list = new ArrayList<>();
    list.add(new Model(1,"Giorno theme","JOJO","4:00"));
    list.add(new Model(2,"Звезда по имени солнце","Кино","3:00"));
    list.add(new Model(3,"Kira theme","JOJO","2:00"));
    list.add(new Model(4,"Theme","KK","1:00"));
    list.add(new Model(5,"What theme","JOJO","4:00"));
    list.add(new Model(6,"Requem theme","JOJO","4:00"));
    list.add(new Model(7,"D4C theme","AC/DC","5:00"));
    list.add(new Model(8,"Killer queen","Queen","4:00"));
        return list;
    }


    @Override
    public void onItemClick(Model model) {
       Intent intent = new Intent(getActivity(),MainActivity2.class);
       intent.putExtra("key",model.getName());
       startActivity(intent);
    }
}
