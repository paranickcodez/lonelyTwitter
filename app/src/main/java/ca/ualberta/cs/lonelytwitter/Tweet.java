package ca.ualberta.cs.lonelytwitter;

import android.widget.ListView;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by nparada on 9/13/17.
 */

public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;
    private ArrayList<Mood> moodList;

    public void setMoodList(ArrayList<Mood> moodList) {
        this.moodList = moodList;
    }

    public ArrayList<Mood> getMoodList() {
        return moodList;
    }

    public Tweet(String message){
        moodList = new ArrayList<Mood>();
        date = new Date();
        this.message = message; /**for this message instance*/
    }

    public Tweet(String message, Date date){
        moodList = new ArrayList<Mood>();
        this.date = date;
        this.message = message;
    }

    public void AddMood(Mood mood){
            this.moodList.add(mood);
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

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }

}
