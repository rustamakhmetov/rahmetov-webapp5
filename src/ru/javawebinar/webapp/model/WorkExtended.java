package ru.javawebinar.webapp.model;

/**
 * rahmetov
 * 18.12.2014.
 */
public class WorkExtended extends Work {
    private Objective objective;

    public WorkExtended(Objective objective, String periodOfWork, String description) {
        super(periodOfWork, description);
        this.objective = objective;
    }

    public Objective getObjective() {
        return objective;
    }

    public void setObjective(Objective objective) {
        this.objective = objective;
    }
}
