package com.intDesign.homeHub.presentation.ui.house;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.intDesign.homeHub.R;
import com.intDesign.homeHub.core.models.House;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;


public class HouseListAdapter extends ArrayAdapter<House> {

    public HouseListAdapter(Context context, ArrayList<House> users) {
        super(context, R.layout.house_list_view_layout, users);
    }

    @NotNull
    @Override
    public View getView(int position, View convertView, @NotNull ViewGroup parent) {
        House house = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.house_list_view_layout, parent, false);
        }
        TextView houseLocation = convertView.findViewById(R.id.houseLocation);
        TextView houseDescription = convertView.findViewById(R.id.houseDescription);

        houseLocation.setText(house.getHouseAddress());
        houseDescription.setText(String.format("%s / %s / %s ", house.getOwnerName(), house.getOwnerPhone(), house.getOwnerEmail()));
        return convertView;
    }
}
