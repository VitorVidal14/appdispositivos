package vitor.com.appdispositivos;

import android.content.Intent;
import android.icu.util.Calendar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NewTask extends AppCompatActivity {

    private View Text;
    ArrayList<Card> listCard;


    public NewTask (){
        listCard = new ArrayList<Card>();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_task);
        setupActionBar();

    }

    private void setupActionBar() {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            startActivity(new Intent(NewTask.this, MainActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void acao (View view){

        Card card = new Card();

        //Passando title pro card.
        EditText get_text_titulo = view.findViewById(R.id.text_titulo);
        card.setTitle(get_text_titulo.toString());

        //Passando description pro card
        EditText get_description = view.findViewById(R.id.text_description);
        card.setText(get_description.toString());


        listCard.add(card); //NO FINAL DE TUDO ADICIONA O CARD NO VETOR

    }



}

