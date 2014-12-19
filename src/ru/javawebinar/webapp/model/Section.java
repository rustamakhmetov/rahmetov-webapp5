package ru.javawebinar.webapp.model;

/**
 * rahmetov
 * 19.12.2014.
 */
public class Section {
    private String icon;
    private String description;

    public Section() {
    }

    public Section(String description) {
        this.description = description;
    }

    public Section(String icon, String description) {
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
