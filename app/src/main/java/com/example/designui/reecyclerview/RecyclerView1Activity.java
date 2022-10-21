package com.example.designui.reecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.designui.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerView1Activity extends AppCompatActivity {

    Button btnTap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view1_activity);
        btnTap = findViewById(R.id.btnTapData);

        List<PersonClass> personClassList = new ArrayList<>();
        personClassList.add(new PersonClass("Koko","22"));
        personClassList.add(new PersonClass("lolo","77"));
        personClassList.add(new PersonClass("popo","89"));
        personClassList.add(new PersonClass("Vanda","22"));
        personClassList.add(new PersonClass("nony","89"));
        personClassList.add(new PersonClass("sopy","18"));

        RecyclerView recyclerView = findViewById(R.id.recyclerViewId);
        Adapter adapter = new Adapter(this, personClassList, new Adapter.AdapterClickListener() {
            @Override
            public void onItemClick(PersonClass personClass) {

            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

       btnTap.setOnClickListener(view -> {

           //remove
          if(personClassList.size() == 0){
              Toast.makeText(this, "NO item to remove", Toast.LENGTH_SHORT).show();
          }else {
              personClassList.remove(personClassList.size()-1); // list from zero
              adapter.notifyItemRemoved(personClassList.size());  // adapter from 1
          }

           //Update data
//           personClassList.set(0,new PersonClass("888","gogo"));
//           adapter.notifyItemChanged(0);

           //Insert new data
//           personClassList.add(0,new PersonClass("999","koko"));
//           adapter.notifyItemInserted(0);
       });
    }
}