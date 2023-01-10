package com.example.customlistapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CountryAdapter extends BaseAdapter {

    private final ArrayList<CountryModel> list;
    private final Context context;

    public CountryAdapter(ArrayList<CountryModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public static class ViewHolder {
        private TextView tvCountry, tvWin;
        private ImageView imgCountry;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CountryModel dataModel = list.get(position);
        ViewHolder viewHolder;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(
                    R.layout.item_list,
                    parent,
                    false
            );
            viewHolder.tvCountry = (TextView) convertView.findViewById(R.id.tvCountry);
            viewHolder.tvWin = (TextView) convertView.findViewById(R.id.tvWin);
            viewHolder.imgCountry = (ImageView) convertView.findViewById(R.id.imgFlag);
            convertView.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.imgCountry.setImageResource(dataModel.getImageResource());
        viewHolder.tvCountry.setText(dataModel.getCountryName());
        viewHolder.tvWin.setText(dataModel.getWin());

        return convertView;
    }
}
