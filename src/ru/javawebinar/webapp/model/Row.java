package ru.javawebinar.webapp.model;

/**
 * rahmetov
 * 19.12.2014.
 */
public class Row {
    private String icon;
    private String description;

    public Row() {
    }

    public Row(String description) {
        this.description = description;
    }

    public Row(String icon, String description) {
        this.icon = icon;
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
        return "\n\t\t" + (icon != null ? (icon.length() > 1 ? icon + ": " : icon + " ") : "") + description;
    }
}
