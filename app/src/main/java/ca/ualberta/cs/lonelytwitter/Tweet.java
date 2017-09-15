package ca.ualberta.cs.lonelytwitter;
import java.util.Date;

/**
 * Created by nparada on 9/13/17.
 */

public abstract class tweet implements Tweetable{
    private String message;
    private Date date;

    public tweet(String message){
        date = new Date();
        this.message = message; /**for this message instance*/
    }

    public tweet(String message, Date date){
        this.date = date;
        this.message = message;
    }
    public String getMessage(){
        return message;
    }

    public void setMessage(String message) throws TweettoolongException{
        if (message.length() < 140){
            this.message = message;
        }
        else{
            throw new TweettoolongException();
        }
    }

    public abstract Boolean isImportant();

    public Date getDate() {
        return date;
    }

}
