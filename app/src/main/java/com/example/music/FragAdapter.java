package com.example.music;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FragAdapter extends RecyclerView.Adapter<FragAdapter.MyViewHolder> {

    ArrayList<Model> list = new ArrayList<>();
    private onClick onClick;

    public void FragmentAdapter(ArrayList<Model> list, onClick onClick) {
        this.list = new ArrayList<>();
        this.list.addAll(list);
        this.onClick = onClick;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.my_raw, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FragAdapter.MyViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView number, name, avtor, vanshot;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            number = itemView.findViewById(R.id.tv_text);
            name = itemView.findViewById(R.id.tv_name);
            avtor = itemView.findViewById(R.id.tv_nameAvtor);
            vanshot = itemView.findViewById(R.id.tv_vanshot);

        }

        public void onBind(Model model) {
            number.setText(String.valueOf(model.getNumber()));
            name.setText(model.getName());
            avtor.setText(model.getAvtor());
            vanshot.setText(model.getVanshot());
            itemView.setOnClickListener(v ->{
                onClick.onItemClick(model);
            });

        }
    }
        public interface onClick{
            void onItemClick(Model model);

        }
}
