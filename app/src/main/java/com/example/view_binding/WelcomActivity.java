package com.example.view_binding;

import android.content.Intent;
import android.os.Bundle;

import com.example.view_binding.databinding.ActivityWelcomBinding;
import com.example.view_binding.model.WelcomMessage;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import android.view.View;
import android.widget.Toast;

public class WelcomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WelcomMessage welcomMessage = new WelcomMessage("Name : Welcome to Data Binding", "Version :2.0.1");
        ActivityWelcomBinding viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_welcom);
        viewDataBinding.setWelcome(welcomMessage);
        viewDataBinding.setWelcomActivityPresenter(WelcomActivity.this);
    }


    public void OpenMainActivity(View view) {
        //Toast.makeText(this,"Main Activity",Toast.LENGTH_LONG).show();
        startActivity(new Intent(this, MainActivity.class));
    }

    public void openObserverBinding(View view) {
        startActivity(new Intent(this, ObserverActivity.class));
    }

    public void openAdapterBinding(View view) {
        startActivity(new Intent(this, AdapterBinding.class));
    }

}
