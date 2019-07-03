package com.example.resultapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class ResultAdapter extends RecyclerView.Adapter<ResultAdapter.ViewHolder> {

    List<Datum> resultDTOList;
    Context mContext;

    public ResultAdapter(List<Datum> resultDTOList, Context mContext) {
        this.resultDTOList = resultDTOList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.test_layout, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.displayResult(resultDTOList.get(i));
    }

    @Override
    public int getItemCount() {
        return resultDTOList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView subjectTextView, fmTextView, pmTextView, omTextView, remarksTextView;
        String subject, remarks;
        Integer fm, pm, om;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            subjectTextView = itemView.findViewById(R.id.subjectID);
            fmTextView = itemView.findViewById(R.id.fmID);
            pmTextView = itemView.findViewById(R.id.pmID);
            omTextView = itemView.findViewById(R.id.omID);
            remarksTextView = itemView.findViewById(R.id.remarkID);
        }

        public void displayResult(Datum datum) {

            subject = datum.getSubject().getSubjectName();
            remarks = datum.getMarks().getRemarks();
            fm = datum.getSubject().getFullMarks();
            pm = datum.getSubject().getPassMarks();
            om = datum.getMarks().getObtainedMarks();

            subjectTextView.setText(subject);
            fmTextView.setText(fm);
            pmTextView.setText(pm);
            omTextView.setText(om);
            remarksTextView.setText(remarks);

        }
    }

}
