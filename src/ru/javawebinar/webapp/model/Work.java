package ru.javawebinar.webapp.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * rahmetov
 * 18.12.2014.
 */
public class Work {
    private Date startDate;
    private Date endDate;
    private String description;
    private boolean currentTime;

    public Work() {
    }

    public Work(Date startDate, Date endDate, String description) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.currentTime = endDate == null;
        this.description = description;
    }

    public Work(String startDate, String endDate, String description)
    {
        this(startDate != null ? FormatPeriod.PERIOD.parse(startDate) : null, endDate != null ? FormatPeriod.PERIOD.parse(endDate) : null, description);
    }

    public Work(Date startDate, String description) {
        this.startDate = startDate;
        this.currentTime = true;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/yyyy");
        return "\n\t\t\t" + dateFormat.format(startDate) + (endDate == null ? (currentTime ?  " - по сейчас" : "") : " - " + dateFormat.format(endDate)) + '\t' + description;
    }
}
