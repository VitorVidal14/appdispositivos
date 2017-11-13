package vitor.com.appdispositivos;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.MainThread;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;
    private RecyclerView recyclerView;
    private CardAdapter cardAdapter;
    private List<Card> cardList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Instância da activity_maain como tela principal do programa.

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        Intância da Toolbar.

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
//        Instãncia do menu Settings.

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
//        Instância das Tabs do layout principal.

        recyclerView = (RecyclerView) findViewById(R.id.rv_titulo);

        cardList = new ArrayList<>();
        cardAdapter = new CardAdapter(this, cardList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(cardAdapter);

        prepareCards();


        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Card card = new Card(" ", "");

                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                View newtaskView = MainActivity.this.getLayoutInflater().inflate(R.layout.activity_new_task, null);
                alert.setView(newtaskView);
                alert.setTitle("New task");

                final EditText editTextTitulo = (EditText) newtaskView.findViewById(R.id.text_titulo);
                final EditText editTextDescription = (EditText) newtaskView.findViewById(R.id.text_description);

                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        // use the value.
                        card.setTitle(editTextTitulo.getText().toString());
                        card.setText(editTextDescription.getText().toString());
                        cardList.add(card);
                        cardAdapter.notifyDataSetChanged();
                    }
                });

                alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        // cancel
                    }
                });

                alert.show();
            }

        });
//        Instância do FAB.


        for (int i=0; i< cardList.size();i++)
            System.out.println("Titulo " + cardList.get(i).getTitle() + "\n Description: " + cardList.get(i).getText());




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
//    Inflate imprime o menu Settings na tela.

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {startActivity(new Intent(MainActivity.this,SettingsActivity.class));}
        return super.onOptionsItemSelected(item);
    }
//    Função para definir a relação das activitys main e settings.





    public static class PlaceholderFragment extends Fragment {

        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {}

        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);

            return rootView;
        }
    }
//    Todo(10) - Definir a funcionalidade do método acima.

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {super(fm);}

        @Override
        public Fragment getItem(int position) {return PlaceholderFragment.newInstance(position + 1);}

        @Override
        public int getCount() {return 4;}

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Hoje";
                case 1:
                    return "Semana";
                case 2:
                    return "Mês";
                case 3:
                    return "Organizar";
            }return null;
        }
    }
//    Função para definir o menu de abas.

    private void prepareCards(){

        Card a = new Card("Eletromag", "Estudar");
        cardList.add(a);





        cardAdapter.notifyDataSetChanged();
    }
}
