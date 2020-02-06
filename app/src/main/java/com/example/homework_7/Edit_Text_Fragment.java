package com.example.homework_7;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Edit_Text_Fragment extends Fragment {
IEdetTextFR iEdetTextFR;

    public Edit_Text_Fragment() {
        // Required empty public constructor
    }

    public  static Edit_Text_Fragment createTextFragment(IEdetTextFR iEdetTextFR){
        Edit_Text_Fragment fragment = new Edit_Text_Fragment();
        fragment.iEdetTextFR = iEdetTextFR;
        return  fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_text_, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final EditText title = view.findViewById(R.id.Task_title);
        final EditText description = view.findViewById(R.id.Task_description);
        final EditText deadLine = view.findViewById(R.id.deadline);
        Button saveBtn = view.findViewById(R.id.task_save);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Task task = new Task();
                if (title.getText().toString().trim().equals("")) {
                    return;
                } else {
                    task.title = title.getText().toString().trim();
                }

                if (description.getText().toString().trim().equals("")) {

                    return;
                } else {
                    task.description = description.getText().toString().trim();
                }

                task.deadline = deadLine.getText().toString();

                iEdetTextFR.getInfoToRecycler(task);





            }
        });
    }
}
