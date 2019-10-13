package com.example.view_binding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.view_binding.model.LaguageName;

import java.util.Arrays;
import java.util.List;

public class AdapterBinding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_binding);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);



        List<LaguageName> items =
                Arrays.asList(new LaguageName("Android", "10"), new LaguageName("Swift", "5"));


        RecyclerView.Adapter mAdapter = new MyAdapter(items);
        recyclerView.setAdapter(mAdapter);
    }
}
