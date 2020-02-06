package com.example.homework_7;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Text_Fragment extends Fragment {
    RecyclerView recyclerView;
    AdapterRecycler adapterRecycler;
IRecyclerFr iRecyclerFr;
ArrayList<Task> tasks = new ArrayList<>();


public  static Text_Fragment createRecyclerFfagment(IRecyclerFr iRecyclerFr){
    Text_Fragment fragment = new Text_Fragment();
    fragment.iRecyclerFr = iRecyclerFr;
    return fragment;
}

    public Text_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_edit__text_, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycler_view);
        adapterRecycler = new AdapterRecycler(tasks);
        recyclerView.setAdapter(adapterRecycler);
        Button addBtn = view.findViewById(R.id.FED_btn_back);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iRecyclerFr.goToEditTextFr();
            }

        });
            Bundle bundle = getArguments();
            tasks.add((Task) bundle.getSerializable("key"));
            adapterRecycler.notifyDataSetChanged();

    }
}
