package com.example.view_binding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.view_binding.databinding.ActivityMainBinding;
import com.example.view_binding.model.OnUserAddListner;
import com.example.view_binding.model.UserDetails;
import com.example.view_binding.presenter.AddUserPresenter;
import com.example.view_binding.presenter.UpdateUser;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnUserAddListner {

    private UserDetails user;
    private UpdateUser updateUser;
    private int i = 0;
    private List<UserDetails> userDetails = new ArrayList<>();
    private ListView listView;
    private ArrayAdapter<UserDetails> itemsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        AddUserPresenter addUserPresenter = new AddUserPresenter(this);
        viewDataBinding.setAddUser(addUserPresenter);


        listView = findViewById(R.id.showUserList);
        itemsAdapter = new ArrayAdapter<UserDetails>(this, android.R.layout.simple_list_item_1, userDetails);
        listView.setAdapter(itemsAdapter);

    }


    @Override
    public void updateListView(UserDetails userDetails) {
        this.userDetails.add(userDetails);
        itemsAdapter.notifyDataSetChanged();
    }
}
