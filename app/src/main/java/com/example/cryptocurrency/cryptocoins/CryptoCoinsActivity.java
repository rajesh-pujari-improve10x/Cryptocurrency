package com.example.cryptocurrency.cryptocoins;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.Toast;

import com.example.cryptocurrency.databinding.ActivityCryptoCoinsBinding;
import com.example.cryptocurrency.models.CryptoCoin;
import com.example.cryptocurrency.network.CryptocurrencyApi;
import com.example.cryptocurrency.network.CryptocurrencyService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CryptoCoinsActivity extends AppCompatActivity {

    private ActivityCryptoCoinsBinding binding;
    private CryptoCoinsAdapter cryptoCoinsAdapter;
    private List<CryptoCoin> cryptoCoins = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCryptoCoinsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        fetchCryptocurrencies();
        setupAdapter();
        setupRecyclerView();
    }

    private void setupAdapter() {
        cryptoCoinsAdapter = new CryptoCoinsAdapter();
        cryptoCoinsAdapter.setData(cryptoCoins);
        cryptoCoinsAdapter.setShowActive(true);
    }

    private void setupRecyclerView() {
        binding.cryptoCoinsRv.setLayoutManager(new LinearLayoutManager(this));
        binding.cryptoCoinsRv.setAdapter(cryptoCoinsAdapter);
    }

    private void fetchCryptocurrencies() {
        //CryptocurrencyApi api = new CryptocurrencyApi();
        CryptocurrencyService service = new CryptocurrencyApi().createCryptocurrencyService();
        Call<List<CryptoCoin>> call = service.fetchCryptocurrencies();
        call.enqueue(new Callback<List<CryptoCoin>>() {
            @Override
            public void onResponse(Call<List<CryptoCoin>> call, Response<List<CryptoCoin>> response) {
                if (response.isSuccessful()) {
                    cryptoCoinsAdapter.setData(response.body());
                    Toast.makeText(CryptoCoinsActivity.this, "Successfully Loaded the data", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<CryptoCoin>> call, Throwable t) {
                Toast.makeText(CryptoCoinsActivity.this, "Failed", Toast.LENGTH_SHORT).show();
            }
        });
    }
}