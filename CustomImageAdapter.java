package com.example.cs478_project2;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class CustomImageAdapter extends BaseAdapter {

    private Context c;
    private ArrayList<DisplayElements> displayList;

    public CustomImageAdapter(Context c, ArrayList<DisplayElements> displayList){
        this.c = c;
        this.displayList = displayList;
    }//End of constructor()

    @Override
    public int getCount(){
        return displayList.size();
    }//End of getCount()

    @Override
    public Object getItem(int index){
        return displayList.get(index);
    }//End of getItem()

    @Override
    public long getItemId(int index){
        return 0;
    }//End of getItemId()

    @Override
    public View getView(int index, View convertView, ViewGroup parent){

        PhoneView pv;

        if(convertView == null){
            pv = new PhoneView();
            LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.content_main, null, true);

            pv.phone = (ImageView) convertView.findViewById(R.id.imageView);
            pv.info = (TextView) convertView.findViewById(R.id.text);
            pv.specs = (TextView) convertView.findViewById(R.id.text2);

            convertView.setTag(pv);
        }
        else{
            pv = (PhoneView) convertView.getTag();
        }

        pv.phone.setImageResource(displayList.get(index).getPictureID());
        pv.info.setText(displayList.get(index).getPhoneInfo());
        pv.specs.setText(displayList.get(index).getPhoneSpecs());

        return convertView;

    }//End of getView()

    private class PhoneView{
        private ImageView phone;
        private TextView info;
        private TextView specs;

    }//End of PhoneView class

}//End of CustomAdapter class
