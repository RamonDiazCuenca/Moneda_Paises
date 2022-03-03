package com.example.moneda_paises;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnsudamerica;
    private LinearLayout llbanderas;
    private LayoutInflater layoutInflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsudamerica = findViewById(R.id.btnsudamerica);
        llbanderas = findViewById(R.id.llbanderas);
        layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }


    public void onClickSudamerica(View view) {

        //Toast.makeText(this,"Boton sudamerica",Toast.LENGTH_SHORT).show();
        //Es RelativeLayout porque el contenedor del xml, sí fuera un LinearLayout
        // seria LinearLayout llB = (LinearLayout)
        RelativeLayout rlB = (RelativeLayout) layoutInflater.inflate(R.layout.banderassudamerica, null);
        llbanderas.addView(rlB);
        //btnsudamerica.setBackgroundColor(R.color.botonsudamerica); asi no funciona
        btnsudamerica.setBackgroundColor(Color.YELLOW);

    }

    public void onClickbndargentina(View view) {

        //Toast.makeText(this,"boton argentina", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent (this, SegundoActivity.class);
        startActivity(intent);

    }
}

