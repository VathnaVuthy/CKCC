package com.example.user.ckcc.fragment;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.user.ckcc.R;

public class NewsDetail extends Fragment {
    Bundle args = new Bundle();
    public NewsDetail() {
        // Required empty public constructor

    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_news_detail, container, false);

        Bundle getArg = this.getArguments();

        TextView title = (TextView)view.findViewById(R.id.news_title);
        title.setText(getArg.getString("title"));
        TextView date = (TextView)view.findViewById(R.id.news_date);
        date.setText(getArg.getString("date"));
        return view;
    }

}
