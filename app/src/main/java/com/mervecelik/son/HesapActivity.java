package com.mervecelik.son;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.TextView;
import android.os.Bundle;

public class HesapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hesap);

        // Masa adı ve seçilen ürün bilgilerini al
        String masaAdi = getIntent().getStringExtra("MasaAdı");
        String secilenUrun = getIntent().getStringExtra("SeçilenÜrün");

        // Hesap ve ürün bilgilerini bir TextView'e göster
        TextView textView = findViewById(R.id.textViewHesap);
        String hesapBilgisi = "Hesap:\n" + masaAdi + " - " + secilenUrun;
        textView.setText(hesapBilgisi);
         
    }
    }
