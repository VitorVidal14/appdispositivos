package vitor.com.appdispositivos;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by vitor on 14/11/17.
 */

public class TabFourFragment extends Fragment {
    View view;

    public TabFourFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        view = inflater.inflate(R.layout.card_organizar,container,false);
        return view;
    }
}
