package ru.javawebinar.webapp.model;

import java.text.ParseException;

/**
 * rahmetov
 * 18.12.2014.
 */
public class WorkExtended extends Work {
    private Objective objective;

    public WorkExtended(Objective objective, String startDate, String endDate, String description) {
        super(startDate, endDate, description);
        this.objective = objective;
    }

    public Objective getObjective() {
        return objective;
    }

    public void setObjective(Objective objective) {
        this.objective = objective;
    }
}
