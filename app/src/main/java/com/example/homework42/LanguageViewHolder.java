package com.example.homework42;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LanguageViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;


    public LanguageViewHolder(@NonNull View itemView) {
        super(itemView);
        textView=itemView.findViewById(R.id.tv_language);
    }

    public void bind(String language) {
        textView.setText(language);
    }
}
