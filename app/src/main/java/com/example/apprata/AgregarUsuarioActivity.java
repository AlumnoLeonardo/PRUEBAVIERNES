package com.example.apprata;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AgregarUsuarioActivity extends AppCompatActivity {

    private EditText etNombre, etFechaIngreso, etRut, etEstado, etVencimiento, etTipo;
    private Button btnGuardar, btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_usuario);

        etNombre = findViewById(R.id.etNombre);
        etFechaIngreso = findViewById(R.id.etFechaIngreso);
        etRut = findViewById(R.id.etRut);
        etEstado = findViewById(R.id.etEstado);
        etVencimiento = findViewById(R.id.etVencimiento);
        etTipo = findViewById(R.id.etTipo);

        btnGuardar = findViewById(R.id.btnGuardar);
        btnVolver = findViewById(R.id.btnVolver);

        btnGuardar.setOnClickListener(v -> {
            if(etNombre.getText().toString().isEmpty() || etRut.getText().toString().isEmpty()){
                Toast.makeText(this, "Nombre y RUT son obligatorios", Toast.LENGTH_SHORT).show();
                return;
            }

            Usuario u = new Usuario(
                    etNombre.getText().toString(),
                    etFechaIngreso.getText().toString(),
                    etRut.getText().toString(),
                    etEstado.getText().toString(),
                    etVencimiento.getText().toString(),
                    etTipo.getText().toString()
            );

            DataHolder.usuarios.add(u);
            Toast.makeText(this, "Usuario agregado", Toast.LENGTH_SHORT).show();
            finish();
        });

        btnVolver.setOnClickListener(v -> finish());
    }
}
