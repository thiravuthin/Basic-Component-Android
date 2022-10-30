package com.example.designui.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.designui.R;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    Context context;
    AdapterClickListener adapterClickListener;

    public Adapter(Context context, List<PersonClass> personClassList, AdapterClickListener adapterClickListener) {
        this.context = context;
        this.personClassList = personClassList;
        this.adapterClickListener = adapterClickListener;

    }

    List<PersonClass> personClassList;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recyclerview_cart_custom,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        PersonClass personClass = personClassList.get(position);
        holder.name.setText(personClass.getName());
        holder.id.setText(personClass.getId());
    }

    @Override
    public int getItemCount() {
        return personClassList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView name, id;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.txtName);
            id = itemView.findViewById(R.id.txtAge);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            PersonClass personClass = personClassList.get(getAdapterPosition());
            Toast.makeText(context, personClass.getName(), Toast.LENGTH_SHORT).show();

            adapterClickListener.onItemClick(personClass);
        }
    }
    interface AdapterClickListener{
        void onItemClick(PersonClass personClass);
    }
}
