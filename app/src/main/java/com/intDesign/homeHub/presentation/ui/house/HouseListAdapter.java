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

    public HouseListAdapter(Context context, ArrayList<House> houses) {
        super(context, R.layout.house_list_view_layout, houses);
    }

    @NotNull
    @Override
    public View getView(int position, View itemLayout, @NotNull ViewGroup parent) {
        House house = getItem(position);

        if (itemLayout == null) {
            itemLayout = LayoutInflater.from(getContext()).inflate(R.layout.house_list_view_layout, parent, false);
        }
        TextView houseLocation = itemLayout.findViewById(R.id.houseLocation);
        TextView houseDescription = itemLayout.findViewById(R.id.houseDescription);

        houseLocation.setText(house.getHouseAddress());
        houseDescription.setText(String.format("%s / %s / %s ", house.getOwnerName(), house.getOwnerPhone(), house.getOwnerEmail()));
        return itemLayout;
    }
}