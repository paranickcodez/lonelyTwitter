/*
 * Copyright (c) Team X, CMPUT 301, University of Alberta -- All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behavior at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.List;

/**
 * Created by nparada on 10/12/17.
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList(){

    }

    public void add(Tweet tweet){
        if (tweets.contains(tweet) ){
            throw new IllegalArgumentException("You tweeted that already. Low IQ. SAD!") ;
        }
        tweets.add(tweet);
    }

    public Boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public ArrayList<Tweet> getTweets(){
        Tweet small;
        for(int i=0; i<tweets.size(); i++){
            small = tweets.get(i);
            for(int j=i+1; j<tweets.size(); j++) {
                if (tweets.get(j).getDate().getTime() <= small.getDate().getTime()) {
                    small = tweets.get(j);
                    tweets.set(j, tweets.get(i));
                    tweets.set(i, small);
                }
            }
        }
        return tweets;

    }

    public int getCount(){
        return tweets.size();
    }

}
