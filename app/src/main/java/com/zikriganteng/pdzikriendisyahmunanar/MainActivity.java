package com.zikriganteng.pdzikriendisyahmunanar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    Button btnExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnExit = (Button) findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //perintah untuk mengakhiri aplikasi
                finish();
            }
        });
    }

    public void profile(View view) {
        Intent profile = new Intent(getApplicationContext(), ProfileActivity.class);
        startActivity(profile);
    }

    public void nilai(View view) {
        Intent nilai = new Intent(getApplicationContext(), NilaiActivity.class);
        startActivity(nilai);

    }

    public void kompetensi(View view) {

    }

    public void gallery(View view) {

    }

    public void toko(View view) {
        Intent toko = new Intent(getApplicationContext(), TokoActivity.class);
        startActivity(toko);
    }

    public void organisasi(View view) {

    }
}
