package com.example.apprata;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MenuPrincipalActivity extends AppCompatActivity {

    private Button btnHorario, btnUsuarios, btnAgregar, btnHistoria, btnAlimentacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        btnHorario = findViewById(R.id.btnHorario);
        btnUsuarios = findViewById(R.id.btnUsuarios);
        btnAgregar = findViewById(R.id.btnAgregar);
        btnHistoria = findViewById(R.id.btnHistoria);
        btnAlimentacion = findViewById(R.id.btnAlimentacion);

        btnHorario.setOnClickListener(v -> startActivity(new Intent(this, HorarioGymActivity.class)));
        btnUsuarios.setOnClickListener(v -> startActivity(new Intent(this, ListadoUsuariosActivity.class)));
        btnAgregar.setOnClickListener(v -> startActivity(new Intent(this, AgregarUsuarioActivity.class)));
        btnHistoria.setOnClickListener(v -> startActivity(new Intent(this, HistoriaDesarrolladoresActivity.class)));
        btnAlimentacion.setOnClickListener(v -> startActivity(new Intent(this, AlimentacionActivity.class))); // Añade el listener para el nuevo botón
    }
}
