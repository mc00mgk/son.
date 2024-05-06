package com.mervecelik.son;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.SwitchCompat;
import android.widget.Button;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MudurActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mudur);

        // Her masaya tıklanınca bir menü veya başka bir sayfaya geçiş sağlayacak metodu çağır
        setButtonClickListener(R.id.btnMasa1, "Masa 1");
        setButtonClickListener(R.id.btnMasa2, "Masa 2");
        setButtonClickListener(R.id.btnMasa3, "Masa 3");
        setButtonClickListener(R.id.btnMasa4, "Masa 4");
        setButtonClickListener(R.id.btnMasa5, "Masa 5");
        setButtonClickListener(R.id.btnMasa6, "Masa 6");
        setButtonClickListener(R.id.btnMasa7, "Masa 7");
        setButtonClickListener(R.id.btnMasa8, "Masa 8");
        setButtonClickListener(R.id.btnMasa9, "Masa 9");
        setButtonClickListener(R.id.btnMasa10, "Masa 10");

        // İlgili masa adı ve ürün bilgilerini al
        String masaAdi = getIntent().getStringExtra("MasaAdı");
        String urun1 = getIntent().getStringExtra("Ürün1");
        String urun2 = getIntent().getStringExtra("Ürün2");

        // Masa ve ürün bilgilerini bir TextView'de göster
        // Masa ve ürün bilgilerini bir TextView'de göster
        TextView textView = findViewById(R.id.textViewHesap);
        StringBuilder hesapBilgisi = new StringBuilder(masaAdi + " Hesap Özeti:\n");
        if (urun1 != null) hesapBilgisi.append("Ürün1: ").append(urun1).append("\n");
        if (urun2 != null) hesapBilgisi.append("Ürün2: ").append(urun2).append("\n");

        textView.setText(hesapBilgisi.toString());

    }

    private void setButtonClickListener(int buttonId, String masaName) {
        Button button = findViewById(buttonId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Menü veya başka bir sayfaya geçiş için intent kullanabilirsiniz
                Intent intent = new Intent(MudurActivity.this, HesapActivity.class);
                // Hangi masadan geçildiğini isteğe bağlı olarak ekstra olarak ekleyebilirsiniz
                intent.putExtra("MasaAdı", masaName);
                startActivity(intent);
            }
        });
    }
}