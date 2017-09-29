package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by nparada on 9/15/16.
 */
public class CurrentMood {public abstract class Tweet {
    protected Date date;
    protected String mood;


    public CurrentMood(Date date, String mood) {
        this.date = date;
        this.message = message;
    }

    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    public Date getDate() {
        return this.date;
    }

    public String getMessage() {
        return this.message;
    }
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }
}

}
