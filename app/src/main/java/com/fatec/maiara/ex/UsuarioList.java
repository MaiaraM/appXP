package com.fatec.maiara.ex;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class UsuarioList  extends ArrayAdapter<Usuario> {


    private Context mContext;
    private int mResource;
    private  ArrayList<Usuario> elementos;

    public UsuarioList(Context context, ArrayList<Usuario> elementos) {
        super(context, R.layout.adapter_raking, elementos);
        this.elementos = elementos;
        mContext = mContext;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View linhaView = LayoutInflater.from(mContext).inflate(R.layout.adapter_raking, parent, false);

        TextView tt1 = (TextView) linhaView.findViewById(R.id.ranking_nome);
        TextView tt2 = (TextView) linhaView.findViewById(R.id.ranking_pontos);

        tt1.setText(elementos.get(position).getNome());
        tt2.setText(elementos.get(position).getPontos());


        return linhaView;

    }
}
