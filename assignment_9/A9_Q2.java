package com.student;

import java.util.Objects;

public class Project 
{
    private int id;
    private String title;
    private int teamSize;
    private double projectCost;
    private String technology;

    public Project(int id, String title, int teamSize, double projectCost, String technology) {
        this.id = id;
        this.title = title;
        this.teamSize = teamSize;
        this.projectCost = projectCost;
        this.technology = technology;
    }

    public int getId()
    {
        return id;
    }

    public String getTitle() 
    {
        return title;
    }

    public int getTeamSize() 
    {
        return teamSize;
    }

    public double getProjectCost() 
    {
        return projectCost;
    }

    public String getTechnology() 
    {
        return technology;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj)
            return true;
        if (!(obj instanceof Project))
            return false;
        Project other = (Project) obj;
        return this.id == other.id;
    }

    @Override
    public int hashCode() 
    {
        return Objects.hash(id);
    }
    
    @Override
    public String toString() 
    {
        return "ID: " + id + ", Title: " + title + ", TeamSize: " + teamSize +
               ", Cost: " + projectCost + ", Tech: " + technology;
    }
}