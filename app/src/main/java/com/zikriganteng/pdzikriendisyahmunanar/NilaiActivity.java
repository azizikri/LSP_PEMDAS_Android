package com.zikriganteng.pdzikriendisyahmunanar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class NilaiActivity extends AppCompatActivity {

    TextView text_hasil;
    TextView text_ket;
    EditText input_uh, input_uts, input_uas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nilai);
        init();
    }

    private void init(){
        text_hasil = findViewById(R.id.text_hasil);
        text_ket = findViewById(R.id.text_ket);
        input_uh = findViewById(R.id.input_uh);
        input_uts = findViewById(R.id.input_uts);
        input_uas = findViewById(R.id.input_uas);

    }

    public void hapusDataNilai(View view){
        text_hasil.setText("NILAI AKHIR");
        text_ket.setText("Keterangan");
    }

    public void hitung(View view) {
        String uh = input_uh.getText().toString().trim();
        String uts = input_uts.getText().toString().trim();
        String uas = input_uas.getText().toString().trim();


        if(uh.isEmpty() || uas.isEmpty() || uts.isEmpty()){
            input_uh.setError("Isi Dulu");
            input_uts.setError("Isi Dulu");
            input_uas.setError("Isi Dulu");

        }else{
            double hri = Double.parseDouble(uh);
            double tgh = Double.parseDouble(uts);
            double akhr = Double.parseDouble(uas);
            double hasil = (hri * 0.2) + (tgh * 0.3) + (akhr * 0.5);

            text_hasil.setText("Nilai : " + hasil);
            if (hasil >= 90 && hasil <= 100){
                text_ket.setText("LULUS PREDIKAT A");
            }
            else if (hasil >= 70 && hasil <= 100){
                text_ket.setText("LULUS PREDIKAT B");
            }
            else if (hasil < 70 && hasil <= 100){
                text_ket.setText("TIDAK LULUS PREDIKAT C");
            }else{
                Toast.makeText(getApplicationContext(), "INVALID",
                        Toast.LENGTH_SHORT).show();
                text_ket.setText("Invalid");
                text_hasil.setText("INPUT NILAI 1 - 100");
            }
        }

    }
}