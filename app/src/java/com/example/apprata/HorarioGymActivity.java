package com.example.apprata;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class HorarioGymActivity extends AppCompatActivity {

    private TextView tvHorario;
    private Button btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horario_gym);

        tvHorario = findViewById(R.id.tvHorario);
        btnVolver = findViewById(R.id.btnVolver);

        String horario = "Lunes - 08:00 a 20:00\n" +
                "Martes - 08:00 a 20:00\n" +
                "Miércoles - 08:00 a 20:00\n" +
                "Jueves - 08:00 a 20:00\n" +
                "Viernes - 08:00 a 20:00\n" +
                "Sábado - 09:00 a 14:00\n" +
                "Domingo - Cerrado";

        tvHorario.setText(horario);

        btnVolver.setOnClickListener(v -> finish());
    }
}
