package com.fatec.maiara.ex;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class RakingFragment extends Fragment {

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        ListView listaRanking = v.findViewById(R.id.list_raking);
        Usuario u1 = new Usuario("Maiara", 1500);
        Usuario u2 = new Usuario("Lucas", 900);
        Usuario u3 = new Usuario("Antonio", 850);

        ArrayList<Usuario> usuarioList = new ArrayList<Usuario>();
        usuarioList.add(u1);
        usuarioList.add(u2);
        usuarioList.add(u3);

        //ListAdapter adapter = new ArrayAdapter<Usuario>(getActivity(), R.layout.adapter_raking, R.id.ranking_nome, usuarioList);
        UsuarioList adapter = new UsuarioList(v.getContext(), usuarioList);
        listaRanking.setAdapter(adapter);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        ListView listaRanking = view.findViewById(R.id.list_raking);
////
//        Usuario u1 = new Usuario("Maiara", 1500);
//        Usuario u2 = new Usuario("Lucas", 900);
//        Usuario u3 = new Usuario("Antonio", 850);
//
//        ArrayList<Usuario> usuarioList = new ArrayList<Usuario>();
//        usuarioList.add(u1);
//        usuarioList.add(u2);
//        usuarioList.add(u3);
//
//        //ListAdapter adapter = new ArrayAdapter<Usuario>(getActivity(), R.layout.adapter_raking, R.id.ranking_nome, usuarioList);
//        UsuarioList adapter = new UsuarioList(view.getContext(), usuarioList);
//        listaRanking.setAdapter(adapter);


    }

    public RakingFragment() {
        // Required empty public constructor

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_raking, container, false);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }


}
