package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button email = findViewById(R.id.email);
        Button phone = findViewById(R.id.phone);
        Button map = findViewById(R.id.map);

    email.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_EMAIL,new String[] {"royef7e@gmail.com"});

                try {
                    startActivity(Intent.createChooser(intent, "Kirim Email menggunakan"));
                } catch (android.content.ActivityNotFoundException ex) {

                }
        }
    });

    phone.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "082241124576", null));
            startActivity(intent);


        }
    });

    map.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.id/maps/place/Blimbing,+Bageng,+Gembong,+Kabupaten+Pati,+Jawa+Tengah+59162/@-6.6860686,110.9418139,18z/data=!3m1!4b1!4m5!3m4!1s0x2e70d719199dae81:0x6036903b88ec17ab!8m2!3d-6.6860675!4d110.9429002"));
            startActivity(intent);
        }
    });
    }
}

