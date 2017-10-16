package vitor.com.appdispositivos;

import android.icu.util.Calendar;

/**
 * Created by saviolage on 16/10/17.
 */

public class Card{

    //VALORES BASE
    private String title;
    private String text;
    private boolean fav; // FALSE = NO PRIORITY (DEFAULT)

    //DETALHES DO DIA DE CRIACAO DO CARD
    private Calendar cal;
    private int dayOfCreation;
    private int monthOfCreation;
    private int yearOfCreation;
    private int hourOfCreation;
    private int minuteOfCreation;
    private int secondOfCreation;

    //void image; <- Imagem tirada e anexada a nova tarefa, opcional.

    private double milisecond; //PARA COMPARAR QUAL CARD MAIS RECENTE


    public Card (){ // bob, the builder
        this.title = "";
        this.text = "";
        this.fav = false;
        this.cal = Calendar.getInstance(); // Requires minimum API level 24

        this.dayOfCreation = cal.get(Calendar.DAY_OF_MONTH);
        this.monthOfCreation=cal.get(Calendar.MONTH);
        this.yearOfCreation=cal.get(Calendar.YEAR);
        this.hourOfCreation=cal.get(Calendar.HOUR);
        this.minuteOfCreation=cal.get(Calendar.MINUTE);
        this.secondOfCreation=cal.get(Calendar.SECOND);


    }


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
