package com.example.apprata;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class HistoriaDesarrolladoresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia_desarrolladores);

        TextView txtHistoria = findViewById(R.id.txtHistoria);
        Button btnVolver = findViewById(R.id.btnVolver);

        // Historia ficticia de 5 líneas
        txtHistoria.setText(
                "Un día Leonardo, Jade y Jeremy se reunieron en una cafetería.\n" +
                        "Decidieron crear una app que ayudara a gestionar el gimnasio.\n" +
                        "Entre risas y café, diseñaron cada pantalla en servilletas.\n" +
                        "El código fluyó como magia, cada uno aportó su talento.\n" +
                        "Hoy, gracias a ellos, esta app es una realidad para todos."
        );

        btnVolver.setOnClickListener(v -> {
            startActivity(new Intent(this, MenuPrincipalActivity.class));
            finish();
        });
    }
}
