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
import java.util.List;

@SuppressLint("StaticFieldLeak")
public class HouseSearchTask extends AsyncTask<Void, Void, Void> {
    private ArrayList<House> value;
    private Activity context;
    private ArrayAdapter<House> adapter;
    int take;
    int offset;
    String orderBy;
    OrderType orderType;
    String searchTerm;
    List<String> ids;
    List<String> names;

    public HouseSearchTask(FragmentActivity context, HouseListAdapter adapter,
                           int take, int offset, String orderBy, OrderType orderType,
                           String searchTerm, List<String> ids, List<String> names) {
        this.context = context;
        this.adapter = adapter;
        this.take = take;
        this.offset = offset;
        this.orderBy = orderBy;
        this.orderType = orderType;
        this.searchTerm = searchTerm;
        this.ids = ids;
        this.names = names;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        value = new ArrayList<>();
    }

    @Override
    protected Void doInBackground(Void... voids) {
        context.runOnUiThread(() -> Toast.makeText(context.getBaseContext(), "Start Fetching Data", Toast.LENGTH_SHORT).show());
        HouseRepository.getInstance().fetchData(take, offset, orderBy, orderType, searchTerm, ids, names);
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