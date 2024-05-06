package com.mervecelik.son;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatDelegate;
import android.content.SharedPreferences;
import androidx.appcompat.widget.SwitchCompat;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Button;
import android.widget.Switch;


public class MainActivity extends AppCompatActivity {
    private static final String PREFS_NAME = "AppPrefs";
    private static final String THEME_KEY = "isDarkTheme";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Tema ayarlarını yükleyin ve uygulayın
        SharedPreferences prefs = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        boolean isDarkTheme = prefs.getBoolean(THEME_KEY, false);
        setTheme(isDarkTheme ? R.style.AppTheme_Dark : R.style.AppTheme_Light);



        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);


        // Switch bileşenini bulun ve mevcut durumu ayarlayın
        Switch themeSwitch = findViewById(R.id.themeSwitch);
        themeSwitch.setChecked(isDarkTheme);


        // Switch tıklama olayı
        themeSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            // Tema tercihlerini kaydedin
            SharedPreferences.Editor editor = prefs.edit();
            editor.putBoolean(THEME_KEY, isChecked);
            editor.apply();

            // Temayı hemen uygulamak için aktiviteyi yeniden başlatın
            Intent intent = getIntent();
            finish();
            startActivity(intent);
        });
        Button btnGarson = findViewById(R.id.btnGarson);
        Button btnMudur = findViewById(R.id.btnMudur);
        Button btnCikis = findViewById(R.id.btnCikis);

        btnGarson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Burada Garson aktivitesine geçiş kodu yer alır
                Intent intent = new Intent(MainActivity.this, GarsonActivity.class);
                startActivity(intent);
            }
        });

        btnMudur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Burada Müdür aktivitesine geçiş kodu yer alır
                Intent intent = new Intent(MainActivity.this, MudurActivity.class);
                startActivity(intent);
            }
        });

        btnCikis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Uygulamadan çıkış yapar
                finish();
                System.exit(0);
            }
        });

        }
}