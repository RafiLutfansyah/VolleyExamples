package com.rafilutfansyah.volleyexamples;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<Model> models;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textViewTitle;
        public TextView textViewUsername;

        public ViewHolder(View view) {
            super(view);
            textViewTitle = (TextView) view.findViewById(R.id.textview_title);
            textViewUsername = (TextView) view.findViewById(R.id.textview_username);
        }
    }

    public RecyclerViewAdapter(List<Model> models) {
        this.models = models;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        final Model model = models.get(position);
        holder.textViewTitle.setText(position + ". "+model.getTitle());
        holder.textViewUsername.setText(model.getUsername());
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}