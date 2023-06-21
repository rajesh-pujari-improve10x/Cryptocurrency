package com.example.cryptocurrency.cryptocoins;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptocurrency.databinding.CryptoCoinItemBinding;
import com.example.cryptocurrency.models.CryptoCoin;

import java.util.List;

public class CryptoCoinsAdapter extends RecyclerView.Adapter<CryptoCoinViewHolder> {

    private List<CryptoCoin> cryptoCoins;
    private boolean showActive = false;

    void setData(List<CryptoCoin> cryptoCoins) {
        this.cryptoCoins = cryptoCoins;
        notifyDataSetChanged();
    }

    void setShowActive(boolean showActive) {
        this.showActive = showActive;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CryptoCoinViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CryptoCoinItemBinding cryptoCoinItemBinding = CryptoCoinItemBinding.inflate(LayoutInflater.
                from(parent.getContext()), parent, false);
        CryptoCoinViewHolder cryptoCoinViewHolder = new CryptoCoinViewHolder(cryptoCoinItemBinding);
        return cryptoCoinViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CryptoCoinViewHolder holder, int position) {
        CryptoCoin cryptoCoin = cryptoCoins.get(position);
        holder.binding.setCryptocoin(cryptoCoin);
    }

    @Override
    public int getItemCount() {
        return cryptoCoins.size();
    }
}
