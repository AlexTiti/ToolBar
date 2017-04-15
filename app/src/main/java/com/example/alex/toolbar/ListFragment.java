package com.example.alex.toolbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Alex on 2017/4/14.
 * <pre>
 *     author  ： Alex
 *     e-mail  ： 18238818283@sina.cn
 *     time    ： 2017/04/14
 *     desc    ：
 *     version ： 1.0
 */
public class ListFragment extends Fragment {

    String mArgument;
    public static final String ARGUMENT = "argument";
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle bundle = getArguments();
        if (bundle != null)
            mArgument = bundle.getString(ARGUMENT);


    }

    public static ListFragment  getIntence(String s){
        Bundle bundle = new Bundle();
        bundle.putString(ARGUMENT,s);
        ListFragment  listFragment = new ListFragment();
        listFragment.setArguments(bundle);
        return listFragment;



    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.text,container,false);
        TextView textView = (TextView) view.findViewById(R.id.text);
        textView.setText(mArgument);
        return view;
    }






}
