package com.example.a17589.zyhs_delivery;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class addressadapter extends ArrayAdapter <addresslistview> {
    private int addressid;
    public addressadapter(Context context, int textViewResourceId, List<addresslistview> objects){
        super(context,textViewResourceId,objects);
        addressid=textViewResourceId;

    }


    @NonNull
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        addresslistview order=getItem(position);
        View view=LayoutInflater.from(getContext()).inflate(addressid,parent,false);
        TextView realname =(TextView) view.findViewById(R.id.realname);
        TextView phnumber=(TextView) view.findViewById(R.id.phonenumber);
        TextView addressall=(TextView) view.findViewById(R.id.addressall);
        return view;
    }
}
