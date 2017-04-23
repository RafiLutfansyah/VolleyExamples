package com.rafilutfansyah.volleyexamples;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<Model> models;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewJudul;
        public TextView textViewIsi;
        public ViewHolder(View view) {
            super(view);
            textViewJudul = (TextView) view.findViewById(R.id.textview_name);
            textViewIsi = (TextView) view.findViewById(R.id.textview_username);
        }
    }

    public RecyclerViewAdapter(List<Model> models) {
        this.models = models;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Model model = models.get(position);
        holder.textViewJudul.setText(position + ". "+model.getUsername());
        holder.textViewIsi.setText(model.getName());
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}