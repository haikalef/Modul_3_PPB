package com.example.modul3.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.modul3.R;
import com.example.modul3.database.entitas.User;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewAdapter>{
    private List<User> list;
    private Context context;

    public UserAdapter(Context context, List<User> list){
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewAdapter holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ViewAdapter extends RecyclerView.ViewHolder{

        TextView fullname, email;

        public ViewAdapter(@NonNull View itemView) {
            super(itemView);
            fullname = itemView.findViewById(R.id.full_name);
            email = itemView.findViewById(R.id.email);

        }
    }
}
