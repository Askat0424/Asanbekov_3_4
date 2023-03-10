package com.example.asanbekov_3_4;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.asanbekov_3_4.databinding.ItemCountryBinding;

public class CountryViewHolder extends RecyclerView.ViewHolder {

    private ItemCountryBinding binding;

    public CountryViewHolder(ItemCountryBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    void bind(@NonNull Country country){
        binding.tvCountry.setText(country.getName());
        binding.tvCapital.setText(country.getCapital());
        Glide.with(binding.imgFlag).load(country.getFlag()).into(binding.imgFlag);
    }
}