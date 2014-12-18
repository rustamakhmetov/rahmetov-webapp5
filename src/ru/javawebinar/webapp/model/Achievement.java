package ru.javawebinar.webapp.model;

/**
 * rahmetov
 * 18.12.2014.
 * Достижения
 */
public class Achievement {
    private String description;

    public Achievement() {
    }

    public Achievement(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "\n\t\t* " + description;
    }
}
