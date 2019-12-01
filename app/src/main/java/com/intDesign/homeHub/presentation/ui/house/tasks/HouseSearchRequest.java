package com.intDesign.homeHub.presentation.ui.house.tasks;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.AsyncTask;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.fragment.app.FragmentActivity;

import com.intDesign.homeHub.core.models.House;
import com.intDesign.homeHub.infrastructure.graphql.types.OrderType;
import com.intDesign.homeHub.infrastructure.repositories.HouseRepository;
import com.intDesign.homeHub.presentation.ui.house.HouseListAdapter;

import java.util.ArrayList;

@SuppressLint("StaticFieldLeak")
public class HouseSearchRequest extends AsyncTask<Void, Void, Void> {
    private ArrayList<House> value;
    private Activity context;
    private ArrayAdapter<House> adapter;

    public HouseSearchRequest(FragmentActivity context, HouseListAdapter adapter) {
        this.context = context;
        this.adapter = adapter;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        value = new ArrayList<>();
    }

    @Override
    protected Void doInBackground(Void... voids) {
        context.runOnUiThread(() -> Toast.makeText(context.getBaseContext(), "Start Fetching Data", Toast.LENGTH_SHORT).show());
        HouseRepository.getInstance().fetchData(100, 0, "Id", OrderType.ASC);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }

    protected void onPostExecute(Void result) {
        value = HouseRepository.getInstance().searchHouses().getValue();
        context.runOnUiThread(() -> {
            Toast.makeText(context.getBaseContext(), "Data fetched adding " + value.size(), Toast.LENGTH_SHORT).show();
            adapter.addAll(value);
            adapter.notifyDataSetChanged();
        });
        super.onPostExecute(result);
    }
}