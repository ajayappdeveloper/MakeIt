package com.example.makeit;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.model.Project;
import com.example.utility.SpacingItemDecorator;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Date;

public class ProjectActivity extends Fragment {

    RecyclerView recyclerView;

    ProjectAdapter adapter;

    FloatingActionButton addButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.project_activity,container,false);

        recyclerView = view.findViewById(R.id.recyclerView_project);

        addButton = view.findViewById(R.id.floating_addButton);

        registerOnClickListener();

        adapter = new ProjectAdapter(getContext(),this.loadProjects());

        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        SpacingItemDecorator itemDecorator = new SpacingItemDecorator(15);
        recyclerView.addItemDecoration(itemDecorator);

        adapter.notifyDataSetChanged();

        return view;
    }

      public void registerOnClickListener(){
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("clicked","button clicked");
            }
        });
      }


    public ArrayList<Project> loadProjects(){
        ArrayList<Project> projects = new ArrayList<>();

        Project p1 = new Project("MakeIt","This is my first project", new Date(),new Date(),"Android");
        Project p2 = new Project("Olx","This is selling application", new Date(),new Date(),"Android");
        Project p3 = new Project("Flipkart","This is marketing application", new Date(),new Date(),"Android");

        projects.add(p1);
        projects.add(p2);
        projects.add(p3);

        return projects;
    }
}
