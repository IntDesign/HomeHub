package com.intDesign.homeHub.presentation.ui.house;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.intDesign.homeHub.R;
import com.intDesign.homeHub.presentation.ui.house.tasks.HouseSearchRequest;

import java.util.ArrayList;

public class HouseFragment extends Fragment {
    private ListView houseListView;
    private HouseListAdapter adapter;
    private View root;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        container.removeAllViews();
        root = inflater.inflate(R.layout.fragment_house, container, false);
        FloatingActionButton floatingActionButton = root.findViewById(R.id.addHouse);
        floatingActionButton.setOnClickListener(v -> {
            AddHouseFragment nextFrag = new AddHouseFragment();
            container.removeAllViews();
            getActivity().getSupportFragmentManager().beginTransaction()
                    .replace(container.getId(), nextFrag, "addHouseFragment")
                    .addToBackStack(null)
                    .commit();
        });

        updateListView(root);
        return root;
    }

    private void updateListView(View root) {
        if (houseListView == null || adapter == null || houseListView.getAdapter() == null) {
            ListView houseListView = root.findViewById(R.id.houseList);
            adapter = new HouseListAdapter(getActivity(), new ArrayList<>());
            houseListView.setAdapter(adapter);
        }
        adapter.clear();
        if (isNetwork(getActivity()))
            new HouseSearchRequest(getActivity(), adapter).execute();
        else
            Toast.makeText(getActivity(), "No network connection", Toast.LENGTH_LONG).show();
    }

    private boolean isNetwork(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return netInfo != null && netInfo.isConnectedOrConnecting();
    }

}