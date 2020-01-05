package com.demo.eclass.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.demo.eclass.R;
import com.demo.eclass.modal.RecommendationDO;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecommendationAdpt extends RecyclerView.Adapter<RecommendationAdpt.ItemHolder> {

    Context mCtx;
    ArrayList<RecommendationDO> recommendationList;

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.recommendations_adapter, null);
        return new ItemHolder(view);
    }

    public RecommendationAdpt(Context mCtx, ArrayList<RecommendationDO> recommendationList) {
        this.mCtx = mCtx;
        this.recommendationList = recommendationList;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, int position) {
        RecommendationDO recommendationDo = recommendationList.get(position);
        holder.tv_faculty_name.setText(recommendationDo.getFaculty_name());
        holder.tv_course.setText(recommendationDo.getSubject());
    }

    @Override
    public int getItemCount() {
        return recommendationList != null ? recommendationList.size() : 0;
    }

    public class ItemHolder extends RecyclerView.ViewHolder {
        TextView tv_course, tv_faculty_name;

        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            tv_course = itemView.findViewById(R.id.tv_course);
            tv_faculty_name = itemView.findViewById(R.id.tv_faculty_name);
        }
    }
}
