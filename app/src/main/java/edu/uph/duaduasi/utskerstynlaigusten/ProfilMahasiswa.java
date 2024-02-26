package com.example.duaduasi.uts_kerstynlaigusten;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.material.snackbar.Snackbar;

public class ProfilActivity extends AppCompatActivity {
    EditText editText;
    EditText editText2;
    EditText editText3;
    EditText editText4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        Button submitButton = findViewById(R.id.button);

        editText = findViewById(R.id.editTextText);
        editText2 = findViewById(R.id.editTextText2);
        editText3 = findViewById(R.id.editTextText3);
        editText4 = findViewById(R.id.editTextText4);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleSubmitButtonClick();
            }
        });
    }

    private void handleSubmitButtonClick() {
        String studentId = editText.getText().toString();
        String nama = editText2.getText().toString();
        String jurusan = editText3.getText().toString();
        String tahunMasuk = editText4.getText().toString();

        // Menggabungkan nilai dari setiap EditText menjadi satu pesan Snackbar
        String snackbarMessage = "Student ID: " + studentId + ", Nama: " + nama + ", Jurusan: " + jurusan +
                ", Tahun Masuk: " + tahunMasuk;

        // Mengirim pesan Snackbar kembali ke MainActivity
        Intent resultIntent = new Intent();
        resultIntent.putExtra("MESSAGE", snackbarMessage);
        setResult(RESULT_OK, resultIntent);
        finish();
    }
}