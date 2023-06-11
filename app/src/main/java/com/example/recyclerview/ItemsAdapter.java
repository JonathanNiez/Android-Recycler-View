package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ItemsViewHolder> {

    private Context context;
    private ArrayList<ItemsModel> itemsModelArrayList;


    public ItemsAdapter(Context context, ArrayList<ItemsModel> itemsModelArrayList) {
        this.context = context;
        this.itemsModelArrayList = itemsModelArrayList;

    }

    @NonNull
    @Override
    public ItemsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.items, parent, false);
        return new ItemsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemsViewHolder holder, int position) {
        ItemsModel itemsModel = itemsModelArrayList.get(position);
        holder.itemImage.setImageResource(itemsModel.getItemImage());
        holder.itemName.setText(itemsModel.getItemName());
        holder.itemPrice.setText("₱" + itemsModel.getItemPrice());
    }

    @Override
    public int getItemCount() {
        return itemsModelArrayList.size();
    }

    public static class ItemsViewHolder extends RecyclerView.ViewHolder {

        private TextView itemName, itemPrice;
        private ImageView itemImage;

        public ItemsViewHolder(@NonNull View itemView) {
            super(itemView);

            itemName = itemView.findViewById(R.id.itemName);
            itemPrice = itemView.findViewById(R.id.itemPrice);
            itemImage = itemView.findViewById(R.id.itemImage);
        }
    }
}
