package com.example.view_binding.presenter;

import com.example.view_binding.MainActivity;
import com.example.view_binding.model.OnUserAddListner;
import com.example.view_binding.model.UserDetails;

import java.util.ArrayList;
import java.util.List;

public class AddUserPresenter {
    private OnUserAddListner onUserAddListner;
    private List<UserDetails> userDetails = new ArrayList<>();

    public AddUserPresenter(OnUserAddListner onUserAddListner) {
        this.onUserAddListner = (OnUserAddListner) onUserAddListner;
    }

    public void addUserToList(String name, String age) {

        onUserAddListner.updateListView(new UserDetails(name, age));
    }
}
