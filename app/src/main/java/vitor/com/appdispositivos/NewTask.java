package vitor.com.appdispositivos;

import android.content.Intent;
import android.icu.util.Calendar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
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
        CardView cardView;

        //Passando title pro card.
        final EditText editTextTitulo = (EditText) findViewById(R.id.text_titulo);
        card.setTitle(editTextTitulo.getText().toString());

        //Passando description pro card
        final EditText editTextDescription = (EditText) findViewById(R.id.text_description);
        card.setText(editTextDescription.getText().toString());

        listCard.add(card); //NO FINAL DE TUDO ADICIONA O CARD NO VETOR

        //FINALIZA A FUNÇÃO E RETORNA A TELA INICIAL
        finish();
    }
}

