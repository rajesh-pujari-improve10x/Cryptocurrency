package com.example.cryptocurrency.cryptocoins;

import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptocurrency.databinding.CryptoCoinItemBinding;

public class CryptoCoinViewHolder extends RecyclerView.ViewHolder {

    CryptoCoinItemBinding binding;

    public CryptoCoinViewHolder(CryptoCoinItemBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
}
