package com.generuskoding.assessment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnHasilPersegi, btnHasilPersegiPanjang, btnHasilJajarGenjang;
    private EditText sisiPersegi, panjangPersegiPanjang, lebarPersegiPanjang, alasJajarGenjang, tinggiJajarGenjang;
    private TextView txtHasilPersegi, txtHasilPersegiPanjang, txtHasilJajarGenjang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHasilPersegi = (Button) findViewById(R.id.btnHasilPersegi);
        btnHasilPersegiPanjang = findViewById(R.id.btnHasilPersegiPanjang);
        btnHasilJajarGenjang = findViewById(R.id.btnHasilJajarGenjang);

        sisiPersegi = (EditText) findViewById(R.id.sisiPersegi);
        panjangPersegiPanjang = findViewById(R.id.panjangPersegiPanjang);
        lebarPersegiPanjang = findViewById(R.id.lebarPersegiPanjang);
        alasJajarGenjang   = findViewById(R.id.alasJajarGenjang);
        tinggiJajarGenjang = findViewById(R.id.tinggiJajarGenjang);

        txtHasilPersegi = (TextView) findViewById(R.id.txtHasilPersegi);
        txtHasilPersegiPanjang = (TextView) findViewById(R.id.txtHasilPersegiPanjang);
        txtHasilJajarGenjang = (TextView) findViewById(R.id.txtHasilJajarGenjang);

        btnHasilPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sisiPersegi.getText().toString().trim().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Sisi Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                } else {
                    String nilai1 = sisiPersegi.getText().toString();

                    Integer sisi = Integer.parseInt(nilai1);
                    Integer luas = sisi * sisi;

                    txtHasilPersegi.setText(String.valueOf(luas + " CM"));
                }
            }
        });

        btnHasilPersegiPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(panjangPersegiPanjang.getText().toString().trim().isEmpty() && lebarPersegiPanjang.getText().toString().trim().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Sisi Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                } else {
                    String nilai1 = panjangPersegiPanjang.getText().toString();
                    String nilai2 = lebarPersegiPanjang.getText().toString();

                    Integer panjang = Integer.parseInt(nilai1);
                    Integer lebar = Integer.parseInt(nilai2);
                    Integer luas = panjang * lebar;

                    txtHasilPersegiPanjang.setText(String.valueOf(luas + " CM"));
                }
            }
        });

        btnHasilJajarGenjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(alasJajarGenjang.getText().toString().trim().isEmpty() && tinggiJajarGenjang.getText().toString().trim().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Sisi Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                } else {
                    String nilai1 = alasJajarGenjang.getText().toString();
                    String nilai2 = tinggiJajarGenjang.getText().toString();

                    Integer alas = Integer.parseInt(nilai1);
                    Integer tinggi = Integer.parseInt(nilai2);
                    Integer luas = alas * tinggi;

                    txtHasilJajarGenjang.setText(String.valueOf(luas + " CM"));
                }
            }
        });

    }
}