package com.example.view_binding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.view_binding.databinding.ActivityObserverBinding;
import com.example.view_binding.presenter.UpdateUser;

public class ObserverActivity extends AppCompatActivity {

    private UpdateUser updateUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        updateUser = new UpdateUser();
        ActivityObserverBinding activityObserverBinding = DataBindingUtil.setContentView(this, R.layout.activity_observer);
        activityObserverBinding.setUpdateUser(updateUser);
        activityObserverBinding.setOberverActivity(ObserverActivity.this);

    }

    public void updateDataUsingOberver(String fname,String lname) {

//        EditText edtFname = findViewById(R.id.edtFname);
//        EditText edtlname = findViewById(R.id.edtlname);
        updateUser.setFirstName(fname);
        updateUser.setLastName(lname);
    }
}
