package com.example.interntask;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

public class ReturnFragment extends Fragment {
    public ReturnFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    PieChart pieChart;
    TextView received,upComing;
    ImageView moreFriends;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_return, container, false);

        pieChart = view.findViewById(R.id.piechart);
        received = view.findViewById(R.id.textRecevied);
        upComing = view.findViewById(R.id.textComing);




        setData();
        return  view;
    }


    private void setData(){

        received.setText(Integer.toString(38139));
        upComing.setText(Integer.toString(4632));

        pieChart.addPieSlice(
                new PieModel(
                        Integer.parseInt(received.getText().toString()),
                        Color.parseColor("#68DE90")));
        pieChart.addPieSlice(
                new PieModel(
                        Integer.parseInt(upComing.getText().toString()),
                        Color.parseColor("#E2796E")));


        pieChart.startAnimation();


    }
}