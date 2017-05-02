package com.example.user.ckcc.viewholder;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.ckcc.R;
import com.example.user.ckcc.dataset.Courses;
import com.example.user.ckcc.dataset.NewsArticle;
import com.example.user.ckcc.fragment.NewsDetail;
import com.example.user.ckcc.fragment.NewsFragment;

/**
 * Created by User on 4/25/2017.
 */

public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.ArticleHodler>{
    private NewsArticle[] newsArticles;
    private Context context;
    public ViewAdapter(NewsArticle[] newsArticles){
        this.newsArticles = newsArticles;
    }

    @Override
    public ArticleHodler onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.article_list,parent,false);
        ArticleHodler articleHodler = new ArticleHodler(view);
        context = parent.getContext();
        return articleHodler;
    }

    @Override
    public void onBindViewHolder(ArticleHodler holder, int position) {
        NewsArticle newsArticle = newsArticles[position];
        holder.txt_title.setText(newsArticle.getTitle());
        holder.txt_date.setText(newsArticle.getDate());
    }

    @Override
    public int getItemCount() {
        return newsArticles.length;
    }

    public class ArticleHodler extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView txt_title;
        private TextView txt_date;
        FragmentManager fragmentManager;
        public ArticleHodler(View itemView) {
            super(itemView);
            txt_title = (TextView) itemView.findViewById(R.id.txt_title);
            txt_date = (TextView) itemView.findViewById(R.id.txt_date);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            NewsArticle newsArticle = newsArticles[position];
            NewsDetail newsDetail = new NewsDetail();
            Bundle args = new Bundle();
            args.putString("title", newsArticle.getTitle());
            args.putString("date", newsArticle.getDate());
            newsDetail.setArguments(args);

            FragmentManager fragmentManager = ((Activity) context).getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.lyt_content,newsDetail);
            fragmentTransaction.commit();

        }
    }
}
