package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by nparada on 9/13/17.
 */

public class Happy extends Mood {
    private Date date;

    public Happy() {
        super();
    }

    public Happy(Date date) {
        super(date);
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Happy";
    }
}