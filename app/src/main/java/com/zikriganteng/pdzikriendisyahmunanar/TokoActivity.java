package com.zikriganteng.pdzikriendisyahmunanar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TokoActivity extends AppCompatActivity {
    EditText input_barang, input_jumlah, input_harga;
    TextView text_total, text_keterangan, text_potongan, text_barang, text_harga, text_jumlah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toko);
        init();
        System.out.println();
    }

    private void init(){
        input_barang = findViewById(R.id.input_barang);
        input_jumlah = findViewById(R.id.input_jumlah);
        input_harga = findViewById(R.id.input_harga);
        text_total = findViewById(R.id.text_total);
        text_keterangan = findViewById(R.id.text_keterangan);
        text_potongan = findViewById(R.id.text_potongan);
        text_barang = findViewById(R.id.text_barang);
        text_harga = findViewById(R.id.text_harga);
        text_jumlah = findViewById(R.id.text_jumlah);
    }

    public void hapusDataToko(View view){
        text_total.setText("Total Harga");
        text_keterangan.setText("Keterangan");
        text_potongan.setText("Potongan Harga");
        text_barang.setText("Nama Barang");
        text_harga.setText("Harga Awal");
        text_jumlah.setText("Jumlah Barang");
    }

    public void proses(View view){
        String barang = input_barang.getText().toString().trim();
        String jumlah = input_jumlah.getText().toString().trim();
        String harga = input_harga.getText().toString().trim();
        if (barang.isEmpty() || jumlah.isEmpty() || harga.isEmpty()){
            input_barang.setError("Isi Dulu");
            input_jumlah.setError("Isi Dulu");
            input_harga.setError("Isi Dulu");
        } else {
            double jmlh = Double.parseDouble(jumlah);
            double hrg = Double.parseDouble(harga);
            double total = hrg * jmlh;
            double potongandiskon = total * 5/100;
            text_barang.setText("Nama Barang " + barang);
            text_jumlah.setText("Jumlah Barang " + jumlah);
            text_harga.setText("Harga Awal " + total);
            if (total >= 1000000){
                double totaldiskon = total - potongandiskon;
                text_keterangan.setText("Mendapatkan Diskon sebesan 5%");
                text_total.setText("Total Harga : " + totaldiskon);
                text_potongan.setText("Potongan Harga : " + potongandiskon);
            }else{
                text_keterangan.setText("Keterangan");
                text_total.setText("Total Harga : " + total);
                text_potongan.setText("Potongan Harga : 0 Rupiah");
            }
        }
    }
}