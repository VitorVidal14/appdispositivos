package vitor.com.appdispositivos;

/**
 * Created by saviolage on 16/10/17.
 */

public class Card {

    //VALORES BASE
    private String title;
    private String text; 
    private boolean fav;

    //DETALHES DO DIA DE CRIACAO DO CARD
    private int dayOfCreation;
    private int monthOfCreation;
    private int yearOfCreation;
    private int hourOfCreation;
    private int minuteOfCreation;
    private int secondOfCreation;

    private double milisecond; //PARA COMPARAR QUAL CARD MAIS RECENTE


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isFav() {
        return fav;
    }

    public void setFav(boolean fav) {
        this.fav = fav;
    }

    public int getDayOfCreation() {
        return dayOfCreation;
    }

    public void setDayOfCreation(int dayOfCreation) {
        this.dayOfCreation = dayOfCreation;
    }

    public int getMonthOfCreation() {
        return monthOfCreation;
    }

    public void setMonthOfCreation(int monthOfCreation) {
        this.monthOfCreation = monthOfCreation;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    public int getHourOfCreation() {
        return hourOfCreation;
    }

    public void setHourOfCreation(int hourOfCreation) {
        this.hourOfCreation = hourOfCreation;
    }

    public int getMinuteOfCreation() {
        return minuteOfCreation;
    }

    public void setMinuteOfCreation(int minuteOfCreation) {
        this.minuteOfCreation = minuteOfCreation;
    }

    public int getSecondOfCreation() {
        return secondOfCreation;
    }

    public void setSecondOfCreation(int secondOfCreation) {
        this.secondOfCreation = secondOfCreation;
    }

    public double getMilisecond() {
        return milisecond;
    }

    public void setMilisecond(double milisecond) {
        this.milisecond = milisecond;
    }
}
