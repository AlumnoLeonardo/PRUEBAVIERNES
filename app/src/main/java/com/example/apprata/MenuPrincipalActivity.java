package com.example.apprata;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MenuPrincipalActivity extends AppCompatActivity {

    private Button btnHorario, btnUsuarios, btnAgregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        btnHorario = findViewById(R.id.btnHorario);
        btnUsuarios = findViewById(R.id.btnUsuarios);
        btnAgregar = findViewById(R.id.btnAgregar);

        btnHorario.setOnClickListener(v -> startActivity(new Intent(this, HorarioGymActivity.class)));
        btnUsuarios.setOnClickListener(v -> startActivity(new Intent(this, ListadoUsuariosActivity.class)));
        btnAgregar.setOnClickListener(v -> startActivity(new Intent(this, AgregarUsuarioActivity.class)));
    }
}

