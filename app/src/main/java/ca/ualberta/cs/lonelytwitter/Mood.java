package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by nparada on 9/13/17.
 */

public abstract class Mood {
    private Date date;

    public Mood() {
        date = new Date();
    }

    public Mood(Date date) {
        this.date = date;
    }

    public abstract void setDate(Date date);

    public abstract Date getDate();

}
