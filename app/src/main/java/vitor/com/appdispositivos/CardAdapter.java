package vitor.com.appdispositivos;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by vitor on 10/28/2017.
 *
 * O adaptador cira objetos ViewHoler e infla os itens da tela na sua função onCreateViewHolder.Ele
 *  também retorna o número de itens na fonte de dados e liga os dados do banco em cada item 9mesmo que a responsabilidade
 *  seja passada para a ViewHolder). Ele não faz cache das visualizações associadas a cada item (que é o trabalho da classe
 *  ViewHolder, nem sua reciclagem; Isso é o que o nosso RecyclerView faz.
 */

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder>{

    private static final String TAG = CardAdapter.class.getSimpleName();

    private int mNumberCards;

    public CardAdapter(int numberOfCards) {mNumberCards = numberOfCards;}

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType){
        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.card_to_show;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImediately = false;

        View view = inflater.inflate(layoutIdForListItem, viewGroup, shouldAttachToParentImediately);
        CardViewHolder viewHolder = new CardViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position){
        holder.bind(position);
    }

    @Override
    public int getItemCount(){return mNumberCards;}

    class CardViewHolder extends RecyclerView.ViewHolder{
        TextView listItemNumberView;

        public CardViewHolder(View itemView){
            super(itemView);
            listItemNumberView = (TextView) itemView.findViewById(R.id.text_title);
        }

        void bind(int listIndex){
            listItemNumberView.setText(String.valueOf(listIndex));
        }
    }
}
