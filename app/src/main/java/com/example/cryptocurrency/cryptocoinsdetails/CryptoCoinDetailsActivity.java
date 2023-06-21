package com.example.cryptocurrency.cryptocoinsdetails;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.cryptocurrency.R;
import com.example.cryptocurrency.databinding.ActivityCryptoCoinDetailsBinding;

public class CryptoCoinDetailsActivity extends AppCompatActivity {

    private ActivityCryptoCoinDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCryptoCoinDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}