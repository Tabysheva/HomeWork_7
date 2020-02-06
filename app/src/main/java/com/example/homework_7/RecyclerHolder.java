package com.example.homework_7;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerHolder extends RecyclerView.ViewHolder {
    TextView title;
    TextView description;
    TextView deadline;

    public RecyclerHolder(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.title_textview);
        description = itemView.findViewById(R.id.descripr_textview);
        deadline = itemView.findViewById(R.id.deadline_textview);
    }

    public void createTask(Task task){
        title.setText(task.title);
        description.setText(task.description);
        deadline.setText(task.deadline);

    }
}
