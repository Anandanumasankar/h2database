package com.task.example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
    @Id
    private int movieid;
    private String moviename;
    private int ratings;

    public Users() {
    }

    public Users(int movieid, String moviename, int ratings) {
        super();
        this.movieid = movieid;
        this.moviename = moviename;
        this.ratings = ratings;
    }

    public int getMovieid() {
        return movieid;
    }

    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }
}
