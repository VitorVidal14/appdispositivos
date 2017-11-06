package vitor.com.appdispositivos;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vitor on 10/28/2017.
 *
 * O adaptador cira objetos ViewHoler e infla os itens da tela na sua função onCreateViewHolder.Ele
 *  também retorna o número de itens na fonte de dados e liga os dados do banco em cada item 9mesmo que a responsabilidade
 *  seja passada para a ViewHolder). Ele não faz cache das visualizações associadas a cada item (que é o trabalho da classe
 *  ViewHolder, nem sua reciclagem; Isso é o que o nosso RecyclerView faz.
 */

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.MyViewHolder>{

    private Context mContext;
    List<Card> cardList;

    class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView title, description;

        public MyViewHolder(View view){
            super(view);
            title = (TextView) view.findViewById(R.id.text_title);
            description = (TextView) view.findViewById(R.id.text_description);
        }
    }

    public CardAdapter(Context context, List<Card> cardsList) {
        this.mContext = context;
        this.cardList = cardsList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType){
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_to_show, viewGroup, false);
        MyViewHolder viewHolder = new MyViewHolder(view);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position){
        Card card = cardList.get(position);
        holder.title.setText(card.getTitle());
        holder.description.setText(card.getText());
    }

    @Override
    public int getItemCount(){return cardList.size();}
}
