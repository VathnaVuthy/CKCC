package com.example.user.ckcc.fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.ckcc.R;
import com.example.user.ckcc.dataset.NewsArticle;
import com.example.user.ckcc.viewholder.ViewAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFragment extends Fragment {

    RecyclerView mRecyclerView ;
    RecyclerView.LayoutManager mLayoutManager ;
    ViewAdapter mViewAdapter;

    public NewsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=  inflater.inflate(R.layout.fragment_news, container, false);
        mRecyclerView = (RecyclerView)view.findViewById(R.id.rv_view);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
        NewsArticle newsArticle1[] = new NewsArticle[12];
        newsArticle1[0] = new NewsArticle("123","321");
        newsArticle1[1] = new NewsArticle("asd","qwe");
        newsArticle1[2] = new NewsArticle("zxc","cvb");
        newsArticle1[3] = new NewsArticle("64","324561");
        newsArticle1[4] = new NewsArticle("123","321");
        newsArticle1[5] = new NewsArticle("asd","qwe");
        newsArticle1[6] = new NewsArticle("zxc","cvb");
        newsArticle1[7] = new NewsArticle("64","324561");
        newsArticle1[8] = new NewsArticle("123","321");
        newsArticle1[9] = new NewsArticle("asd","qwe");
        newsArticle1[10] = new NewsArticle("zxc","cvb");
        newsArticle1[11] = new NewsArticle("64","324561");
        mViewAdapter = new ViewAdapter(newsArticle1);
        mRecyclerView.setAdapter(mViewAdapter);
        return view;
    }
}
