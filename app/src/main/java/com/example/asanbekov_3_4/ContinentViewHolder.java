package com.example.asanbekov_3_4;


import androidx.recyclerview.widget.RecyclerView;
import com.example.asanbekov_3_4.databinding.ItemContinentBinding;


public class ContinentViewHolder extends RecyclerView.ViewHolder {

    private ItemContinentBinding binding;

    public ContinentViewHolder(ItemContinentBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    void bind(Continent continent){
        binding.tvContinent.setText(continent.getName());
    }
}