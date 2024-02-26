package com.example.duaduasi.uts_kerstynlaigusten;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class SepActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sep);
        textView = findViewById(R.id.textView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //catat di log
                Log.d("SEP", "Masuk ke SEP");
                //pindah dari MainActivity ke SepActivity
                startActivity(new Intent(SepActivity.this, MainActivity.class));
            }
        });
    }
}