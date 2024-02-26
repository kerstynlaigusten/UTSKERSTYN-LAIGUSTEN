package com.example.duaduasi.uts_kerstynlaigusten;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    TextView textview2;
    TextView textview3;
    TextView textview5;
    TextView textview6;
    TextView textview7;
    private static final int REQUEST_CODE_PROFILE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview13 = findViewById(R.id.textView13);
        textview13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //catat di log
                Log.d("SEP", "Masuk ke SEP");
                //pindah dari MainActivity ke SepActivity
                startActivity(new Intent(MainActivity.this, SepActivity.class));
            }
        });

        textview15 = findViewById(R.id.textView15);
        textview15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //catat di log
                Log.d("PROFIL", "Masuk ke profil");
                //pindah dari MainActivity ke ProfilActivity
                startActivityForResult(new Intent(MainActivity.this, ProfilActivity.class), REQUEST_CODE_PROFILE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_PROFILE) {
            if (resultCode == RESULT_OK && data != null) {
                String snackbarMessage = data.getStringExtra("MESSAGE");
                if (snackbarMessage != null) {
                    Snackbar.make(findViewById(android.R.id.content), snackbarMessage, Snackbar.LENGTH_SHORT).show();
                }
            }
        }
    }
}