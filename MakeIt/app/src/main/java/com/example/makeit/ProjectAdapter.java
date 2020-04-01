package com.example.makeit;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.model.Project;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class ProjectAdapter extends RecyclerView.Adapter<ProjectAdapter.ProjectViewHolder> {

    Context context;
    ArrayList<Project> projects = new ArrayList<>();


    public ProjectAdapter(Context ct, ArrayList<Project> projects){
        this.context = ct;
        this.projects = projects;
    }

    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.project_cell,parent,false);

        return new ProjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {

        String projectName = projects.get(position).getProjectName();

        holder.projectName.setText(projectName);
        holder.projectDes.setText(projects.get(position).getDescription());
        holder.startedDate.setText(projects.get(position).getStartDate().toString());
        holder.releaseDate.setText(projects.get(position).getReleasedDate().toString());
        holder.platform.setText(projects.get(position).getPlatForm());


        char[] charaters = projectName.toCharArray();
        holder.projectIcon.setText(String.valueOf(charaters[0]));


    }

    @Override
    public int getItemCount() {
        return projects.size();
    }



    public class ProjectViewHolder extends RecyclerView.ViewHolder{

        TextView projectName, projectDes, releaseDate, platform, startedDate, projectIcon;

        public ProjectViewHolder(@NonNull View itemView) {
            super(itemView);

            projectName = itemView.findViewById(R.id.projectName_tv);
            projectDes = itemView.findViewById(R.id.projectDes_tv);
            releaseDate = itemView.findViewById(R.id.projectReleaseDate_tv);
            platform = itemView.findViewById(R.id.projectPlatForm_tv);
            startedDate = itemView.findViewById(R.id.projectStartDate_tv);
            projectIcon = itemView.findViewById(R.id.project_icon);


        }
    }
}
