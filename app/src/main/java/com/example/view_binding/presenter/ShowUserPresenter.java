package com.example.view_binding.presenter;

import android.app.Activity;
import android.view.View;
import android.widget.Toast;

import com.example.view_binding.MainActivity;
import com.example.view_binding.model.UserDetails;

public class ShowUserPresenter {
    private MainActivity mainActivity;

    public ShowUserPresenter(MainActivity activity) {
        this.mainActivity = activity;
    }

    public void toastFromPresenter(){
        Toast.makeText(mainActivity,"Toast displayed in Show User Presenter!",Toast.LENGTH_LONG).show();
    }
}
