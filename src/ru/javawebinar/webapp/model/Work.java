package ru.javawebinar.webapp.model;

/**
 * rahmetov
 * 18.12.2014.
 */
public class Work {
    private String periodOfWork;
    private String description;

    public Work() {
    }

    public Work(String periodOfWork, String description) {
        this.periodOfWork = periodOfWork;
        this.description = description;
    }

    public String getPeriodOfWork() {
        return periodOfWork;
    }

    public String getDescription() {
        return description;
    }

    public void setPeriodOfWork(String periodOfWork) {
        this.periodOfWork = periodOfWork;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "\n\t\t\t" + periodOfWork + '\t' + description;
    }
}
