package com.mervecelik.son;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;
import android.content.Intent;

public class GarsonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garson);

        // Her masaya tıklanınca mesaj göstermek için örnek kod
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
    }

    private void setButtonClickListener(int buttonId, String masaName) {
        Button button = findViewById(buttonId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GarsonActivity.this, MenuActivity.class);
                // İsteğe bağlı olarak hangi masadan geçildiğini iletebilirsin
                intent.putExtra("MasaAdı", masaName);
                startActivity(intent);
                // Bu kısımda masa sayfasına yönlendirme yapılabilir veya başka işlemler eklenebilir
                Toast.makeText(GarsonActivity.this, masaName + " tıklandı.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}