package com.example.view_binding;

import android.os.Bundle;

import com.example.view_binding.presenter.UpdateUser;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.view.View;

public class ObserverActivity extends AppCompatActivity {

    private UpdateUser updateUser = new UpdateUser();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBindingUtil.setContentView(this, R.layout.activity_show_user_list);


    }


    public void updateUserUsingObserver(String firstName, String lastName) {
        updateUser.setFirstName(firstName);
        updateUser.setLastName(lastName);

    }
}
