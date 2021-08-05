package com.example.doatahlil;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;


import com.google.android.gms.fido.fido2.api.common.RequestOptions;

import java.util.List;


public class RecyclerView extends androidx.recyclerview.widget.RecyclerView.Adapter<RecyclerView.MyView> {
    private Context aContext;
    private List<doaTahlil> aData;
    private String url;
    RequestOptions options;

    public RecyclerView(Context aContext, List<doaTahlil> aData){
        this.aContext = aContext;
        this.aData = aData;
        options = new RecyclerView().placeholder(R.drawable.loading_shape).error(R.drawable.loading_shape);
    }


    @NonNull
    @Override
    public RecyclerView.MyView onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(aContext);
        view = inflater.inflate(R.layout.doatahlil_row_item,parent,false);

        MyView viewM = new MyView(view);
        viewM.view_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(aContext, doaTahlil.class);
                i.putExtra("",)



            }
        });
    return viewM;
    }

    @Override
    public void onBindViewHolder(RecyclerView.MyView holder, int position) {
        holder.

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public static class MyView extends RecyclerView.MyView{

        LinearLayout view_container;

    }
}
