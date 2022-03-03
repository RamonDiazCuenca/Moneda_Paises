package com.example.moneda_paises;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SegundoActivity extends AppCompatActivity {

    private Button btnatras;
    private TextView tvurl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segundo_activity);

        btnatras = findViewById(R.id.btnatras);
        tvurl = findViewById(R.id.tvurl);


        tvurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.google.com/search?q=conversor+de+peso+argentino+a+euro&sxsrf=AOaemvIdfUIjegd_R_LkQJxi5mFrUHuWXQ%3A1631113200138&ei=8M84YcfsB5K7lwTzo46QBg&oq=conversor+de+peso+argentino+a+euro&gs_lcp=Cgdnd3Mtd2l6EAMyBQgAEIAEMgYIABAWEB4yBggAEBYQHjIGCAAQFhAeMgYIABAWEB4yBggAEBYQHjoHCAAQRxCwAzoHCAAQsAMQQzoGCAAQBxAeOggIABAIEAcQHjoFCAAQzQI6CggAEIAEEEYQggJKBAhBGABQ-BZYnyNg1iRoAXACeACAAYMBiAGdBJIBAzMuMpgBAKABAcgBCsABAQ&sclient=gws-wiz&ved=0ahUKEwjHpIeX0u_yAhWS3YUKHfORA2IQ4dUDCA8&uact=5");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }

    public void onClickatras(View view) {
        Intent intent2 = new Intent(this,MainActivity.class);
        startActivity(intent2);
    }
}
