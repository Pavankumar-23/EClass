package com.demo.eclass;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.demo.eclass.adapter.RecommendationAdpt;
import com.demo.eclass.modal.RecommendationDO;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    ArrayList<RecommendationDO> recomDo = new ArrayList<>();
    RecyclerView rcv_remmomendations;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        for (int i = 0; i < 10; i++) {
            recomDo.add(new RecommendationDO("Cultural History of India", "Faculty Name"));
        }
        rcv_remmomendations = (RecyclerView) view.findViewById(R.id.rcv_recommendations);
        rcv_remmomendations.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        rcv_remmomendations.setAdapter(new RecommendationAdpt(getContext(), recomDo));
    }
}
