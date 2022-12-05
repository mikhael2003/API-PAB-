package com.mikhael.if3b.quotes.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mikhael.if3b.quotes.Model.QuotesModel;
import com.mikhael.if3b.quotes.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterQuotes {

    public class adapterQuotes extends RecyclerView.Adapter<adapterQuotes.ViewHolderQuotes> {
        private List<QuotesModel> listQuotes = new ArrayList<>();
        private Context ctx;

        public adapterQuotes(List<QuotesModel> listQuotes, Context ctx) {
            this.listQuotes = listQuotes;
            this.ctx = ctx;
        }

        @NonNull
        @Override
        public ViewHolderQuotes onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View varView = LayoutInflater.from(ctx).inflate(R.layout
                    .item_quotes, parent, false );
            return new ViewHolderQuotes(varView);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolderQuotes holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }

        public class ViewHolderQuotes extends RecyclerView.ViewHolder {
            TextView tvQuotes, tvAuthor;

            public ViewHolderQuotes(@NonNull View itemView) {
                super(itemView);
                tvQuotes = itemView.findViewById(R.id.tv_quotes);
                tvAuthor = itemView.findViewById(R.id.tv_author);
            }
        }
    }
}