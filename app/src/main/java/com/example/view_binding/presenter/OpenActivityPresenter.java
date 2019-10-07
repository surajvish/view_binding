package com.example.view_binding.presenter;

import android.content.Intent;

import com.example.view_binding.MainActivity;
import com.example.view_binding.ShowUserListActivity;

public class OpenActivityPresenter {
    MainActivity mainActivity;

    public OpenActivityPresenter(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    public void openUserListActivity(){
        mainActivity.startActivity(new Intent(mainActivity,ShowUserListActivity.class));
    }
}
