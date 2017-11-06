package vitor.com.appdispositivos;

import android.icu.util.Calendar;

import java.io.Serializable;

public class Card implements Serializable{

    //VALORES BASE
    private String title;
    private String text;
    private boolean fav; // FALSE = NO PRIORITY (DEFAULT)

    //DETALHES DO DIA DE CRIACAO DO CARD
    private Calendar cal;

    //void image; <- Imagem tirada e anexada a nova tarefa, opcional.

    private double milisecond; //PARA COMPARAR QUAL CARD MAIS RECENTE


    public Card (String title, String text){
        this.title = title;
        this.text = text;
        this.fav = false;

        this.cal = Calendar.getInstance(); // Requires minimum API level 24
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {return text;}

    public void setText(String text) {
        this.text = text;
    }

    public boolean isFav() {return fav;}

    public void setFav(boolean fav) {this.fav = fav;}

}
