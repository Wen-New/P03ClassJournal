package com.myapplicationdev.android.p03classjournal;
import android.content.Context;
import java.util.ArrayList;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.view.View;
import android.view.LayoutInflater;

public class ModulesAdapter extends ArrayAdapter<Info> {
    private Context context;
    private ArrayList<Info> info;
    public TextView tvGrade , tvWeeks;
    private ImageView imageView;

    public ModulesAdapter(Context context,int resource,ArrayList<Info>objects){
    super(context,resource,objects);
    info = objects;
    this.context = context;
    }
    @Override
    public View getView(int position,View converView,ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row,parent,false);
        tvGrade = rowView.findViewById(R.id.tvGrade);
        tvWeeks = rowView.findViewById(R.id.tvWeek);
        imageView = (ImageView)rowView.findViewById(R.id.imageView);
        Info CurrentWeeks = info.get(position);

        // put in TextViewScores and Weeks here

        //End

        return rowView;
    }


}
