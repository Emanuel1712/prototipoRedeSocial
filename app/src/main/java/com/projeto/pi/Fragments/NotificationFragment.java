package com.projeto.pi.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.projeto.pi.Adapter.NotificationAdapter;
import com.projeto.pi.Model.Notification;
import com.projeto.pi.R;

import java.util.List;


public class NotificationFragment extends Fragment {

    private RecyclerView recyclerView;
    private NotificationAdapter notificationAdapter;
    private List<Notification> notificationList;
    Spinner agressoes;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_helper, container, false);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        agressoes = view.findViewById(R.id.spnAgressao);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getContext(), R.array.agressoes, android.R.layout.simple_spinner_item);
        agressoes.setAdapter(adapter);
        return view;

    }

    public void teste(){

    }

}
