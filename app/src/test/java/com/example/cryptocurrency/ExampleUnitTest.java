package com.example.cryptocurrency;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.cryptocurrency.models.CryptoCoin;
import com.example.cryptocurrency.models.currencydetails.Cryptocurrency;
import com.example.cryptocurrency.network.CryptocurrencyApi;
import com.example.cryptocurrency.network.CryptocurrencyService;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void getCryptocurrencies() throws IOException {
        CryptocurrencyService cryptocurrencyService = new CryptocurrencyApi().createCryptocurrencyService();
        Call<List<CryptoCoin>> call = cryptocurrencyService.fetchCryptocurrencies();
        List<CryptoCoin> cryptoCoins = call.execute().body();
        assertNotNull(cryptoCoins);
        assertFalse(cryptoCoins.isEmpty());
        System.out.println(new Gson().toJson(cryptoCoins));
    }

    @Test
    public void getCryptocurrencyDetails() throws IOException {
        CryptocurrencyService cryptocurrencyService = new CryptocurrencyApi().createCryptocurrencyService();
        Call<Cryptocurrency> call = cryptocurrencyService.fetchCryptocurrencyDetails();
        Cryptocurrency cryptocurrency = call.execute().body();
        assertNotNull(cryptocurrency);
        System.out.println(new Gson().toJson(cryptocurrency));
    }
}