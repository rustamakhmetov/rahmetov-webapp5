package ru.javawebinar.webapp.model;

/**
 * rahmetov
 * 18.12.2014.
 * Позиция
 */
public class Objective {
    private String description;
    private String comment;

    public Objective() {
    }

    public Objective(String description) {
        this.description = description;
    }

    public Objective(String description, String comment) {
        this.description = description;
        this.comment = comment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description + " (" + comment + ")";
    }
}
