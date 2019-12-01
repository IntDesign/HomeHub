package com.intDesign.homeHub.presentation.ui.house;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.intDesign.homeHub.R;
import com.intDesign.homeHub.core.models.House;
import com.intDesign.homeHub.infrastructure.repositories.HouseRepository;

public class AddHouseFragment extends Fragment {
    private View root;
    EditText name, address, email, phone;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_add_house, container, false);
        FloatingActionButton floatingActionButton = root.findViewById(R.id.backToViewHouses);

        name = root.findViewById(R.id.editFullName);
        address = root.findViewById(R.id.editAddress);
        email = root.findViewById(R.id.editEmail);
        phone = root.findViewById(R.id.editPhone);

        floatingActionButton.setOnClickListener(v -> {
            HouseFragment nextFrag = new HouseFragment();
            getActivity().getSupportFragmentManager().beginTransaction()
                    .replace(container.getId(), nextFrag, "viewHouseFragment")
                    .addToBackStack(null)
                    .commit();
        });
        Button button = root.findViewById(R.id.saveHouse);
        button.setOnClickListener(v -> {
            House house = new House();
            house.setHouseAddress(address.getText().toString());
            house.setOwnerEmail(email.getText().toString());
            house.setOwnerPhone(phone.getText().toString());
            house.setOwnerName(name.getText().toString());
            HouseRepository.getInstance().saveHouse(house);
        });
        return root;
    }
}
