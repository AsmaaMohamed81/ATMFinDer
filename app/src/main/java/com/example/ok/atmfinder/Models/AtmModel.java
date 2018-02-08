package com.example.ok.atmfinder.Models;

/**
 * Created by ok on 29/01/2018.
 */

public class AtmModel {
    String title;
    String street;

    public AtmModel(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTitle() {

        return title;
    }

    public String getStreet() {
        return street;
    }

    public AtmModel(String title, String street) {
        this.title = title;
        this.street = street;
    }
}

