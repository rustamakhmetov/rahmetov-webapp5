package ru.javawebinar.webapp.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * rahmetov
 * 19.12.2014.
 */
public enum FormatPeriod {
    YEAR("yyyy"),
    PERIOD("MM/yyyy");

    private DateFormat formatter;

    FormatPeriod(String format)
    {
        this.formatter = new SimpleDateFormat(format, Locale.ENGLISH);
    }

    public Date parse(String date)
    {
        try {
            return formatter.parse(date);
        } catch (ParseException e) {
            //e.printStackTrace();
            return null;
        }
    }

    public static FormatPeriod parseDate(String date)
    {
        for(FormatPeriod f : FormatPeriod.values())
        {
            f.parse(date);
            return f;
        }
        return null;
    }
}
