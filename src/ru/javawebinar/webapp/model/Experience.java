package ru.javawebinar.webapp.model;

import java.util.ArrayList;
import java.util.List;

/**
 * rahmetov
 * 18.12.2014.
 * Опыт работы
 */
public class Experience extends Section {
    private String company;
    private List<WorkExtended> works = new ArrayList<WorkExtended>();

    public Experience(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public List<WorkExtended> getWorks() {
        return works;
    }

    @Override
    public String toString() {
        return "\n\t\t" + company + "\t" + works;
    }
}
