package ru.javawebinar.webapp.model;

import java.util.ArrayList;
import java.util.List;

/**
 * rahmetov
 * 18.12.2014.
 */
public class Education {
    private String company;
    private List<Work> courses = new ArrayList<Work>();

    public Education(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public List<Work> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "\n\t\t" + company + "\t" + courses;
    }
}
