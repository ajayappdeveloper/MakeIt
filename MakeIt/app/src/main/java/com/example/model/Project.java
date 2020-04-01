package com.example.model;

import java.util.ArrayList;
import java.util.Date;

public class Project {

    ArrayList<Developer> developers;
    ArrayList<Tester> testers;
    Manager manager;
    String projectName;
    String description;
    Date startDate;
    Date releasedDate;
    String platForm;

    public Project(ArrayList<Developer> developers, ArrayList<Tester> testers, Manager manager, String projectName, String description, Date startDate, Date releasedDate, String platForm){
        this.developers = developers;
        this.testers = testers;
        this.manager = manager;
        this.projectName = projectName;
        this.description = description;
        this.startDate = startDate;
        this.releasedDate = releasedDate;
        this.platForm = platForm;
    }

    public Project(String projectName, String description, Date startDate, Date releasedDate, String platForm){
        this.projectName = projectName;
        this.description = description;
        this.startDate = startDate;
        this.releasedDate = releasedDate;
        this.platForm = platForm;
    }

    public ArrayList<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(ArrayList<Developer> developers) {
        this.developers = developers;
    }

    public ArrayList<Tester> getTesters() {
        return testers;
    }

    public void setTesters(ArrayList<Tester> testers) {
        this.testers = testers;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getReleasedDate() {
        return releasedDate;
    }

    public void setReleasedDate(Date releasedDate) {
        this.releasedDate = releasedDate;
    }

    public String getPlatForm() {
        return platForm;
    }

    public void setPlatForm(String platForm) {
        this.platForm = platForm;
    }



    public void addDeveloper(Developer developer){
        developers.add(developer);
    }
    public void addTester(Tester tester){
        testers.add(tester);
    }
}
