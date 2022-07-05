package com.example.task2;



public class Users {

    private int id;
    private String moviename;
    private int ratings;

    public Users() {
    }

    public Users(int movieid, String moviename, int ratings) {
        super();
        this.id = movieid;
        this.moviename = moviename;
        this.ratings = ratings;
    }

    public int getId() {
        return id;
    }

    public void setId(int movieid) {
        this.id = movieid;
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
