package com.example.customlistapp;

public class CountryModel {
    private String countryName, win;
    private int imageResource;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWin() {
        return win;
    }

    public void setWin(String win) {
        this.win = win;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public CountryModel(String countryName, String win, int imageResource) {
        this.countryName = countryName;
        this.win = win;
        this.imageResource = imageResource;
    }
}
