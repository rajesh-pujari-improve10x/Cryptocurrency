package com.example.cryptocurrency.network;

import com.example.cryptocurrency.models.CryptoCoin;
import com.example.cryptocurrency.models.currencydetails.Cryptocurrency;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptocurrencyService {

    @GET("coins")
    Call<List<CryptoCoin>> fetchCryptocurrencies();

    @GET("coins/btc-bitcoin")
    Call<Cryptocurrency> fetchCryptocurrencyDetails();
}
