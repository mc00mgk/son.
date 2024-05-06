package com.mervecelik.son;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.HashMap;

public class MenuActivity extends AppCompatActivity {
    private String masaAdi;
    private HashMap<String,String> secimler=new HashMap<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Hangi masadan gelindiğini al
        String masaAdi = getIntent().getStringExtra("MasaAdı");
        // İsteğe bağlı olarak, alınan masa adına göre ekranı düzenleyebilirsin
        setTitle(masaAdi + " Menüsü");

        // Ürün 1 ve Ürün 2 seçimleri için butonları tanımla
        Button btnItem1 = findViewById(R.id.btnItem1);
        Button btnItem2 = findViewById(R.id.btnItem2);

        // Ürün 1 tıklama işlemi
        btnItem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secimler.put("Ürün1", "Seçildi");
            }
        });
        // Ürün 2 butonuna tıklama işlemi
        btnItem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, MudurActivity.class);
                intent.putExtra("MasaAdı", masaAdi);
                for (String key : secimler.keySet()) {
                    intent.putExtra(key, secimler.get(key));
                }
                startActivity(intent);
            }

        });





    }
}
