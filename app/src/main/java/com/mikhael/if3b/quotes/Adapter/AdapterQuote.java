package com.mikhael.if3b.quotes.Adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mikhael.if3b.quotes.R;

public class AdapterQuote {

    public class ViewHolderQuotes extends RecyclerView.ViewHolder {
        TextView tvQuotes, tvAuthor;

        public ViewHolderQuotes(@NonNull View itemView) {
            super(itemView);
            tvQuotes = itemView.findViewById(R.id.tv_quotes);
            tvAuthor = itemView.findViewById((R.id.tv_author);
        }
    }
}
