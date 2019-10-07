package com.example.view_binding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.view_binding.databinding.ActivityMainBinding;
import com.example.view_binding.model.UserDetails;
import com.example.view_binding.presenter.OpenActivityPresenter;
import com.example.view_binding.presenter.ShowUserPresenter;

public class MainActivity extends AppCompatActivity {

    private UserDetails user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        ShowUserPresenter showUserPresenter = new ShowUserPresenter(this);
        OpenActivityPresenter openActivityPresenter = new OpenActivityPresenter(this);

        user = new UserDetails("Name : Data Binding", "Version :2.0.1");
        viewDataBinding.setUser(user);
        viewDataBinding.setPresenter(showUserPresenter);
        viewDataBinding.setMainpresenter(MainActivity.this);
        viewDataBinding.setIntentPresenter(openActivityPresenter);

    }

    public void toastExample(View view) {
        Toast.makeText(this, "Tu bhi Le", Toast.LENGTH_LONG).show();
    }
}
