package com.the_brainy_fools.wr.model;

public class MainModel{
    private int ID;
    private String poster, title, genres, date;
    private long dateMill;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getDateMill() {
        return dateMill;
    }

    public void setDateMill(long dateMill) {
        this.dateMill = dateMill;
    }
}
