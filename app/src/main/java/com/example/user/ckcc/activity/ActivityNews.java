package com.example.user.ckcc.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.user.ckcc.R;
import com.example.user.ckcc.dataset.NewsArticle;
import com.example.user.ckcc.viewholder.ViewAdapter;

public class ActivityNews extends Activity {

    RecyclerView mRecyclerView ;
    RecyclerView.LayoutManager mLayoutManager ;
    ViewAdapter mViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        mRecyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
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



    }
}
