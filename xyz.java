package com.example.anil.recycler;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by anil on 30/06/16.
 */
public class xyz extends RecyclerView.Adapter<xyz.ViewHolder> {
    public String[] captions;
    public  int[] imageIds;
    public xyz(String[] captions, int[] imgids)
    {
        this.captions = captions;
                this.imageIds = imgids;
    }

    @Override
    public xyz.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        CardView cv = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card1, parent,false);

        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(xyz.ViewHolder holder, int position) {
        CardView cardView = holder.cardView;
        ImageView imageView = (ImageView)cardView.findViewById(R.id.image1);
         imageView.setImageDrawable(cardView.getResources().getDrawable(imageIds[position]));
        TextView textView = (TextView)cardView.findViewById(R.id.text1);

        textView.setText(captions[position]);
        TextView textView2 = (TextView)cardView.findViewById(R.id.text2);
        textView2.setText(captions[position]);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Hello guys",Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
       private CardView cardView;
        public ViewHolder(CardView v) {
            super(v);
            cardView = v;


        }
    }
}
