package com.example.apprata;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ModificarUsuarioActivity extends AppCompatActivity {

    private EditText etNombre, etFechaIngreso, etRut, etEstado, etVencimiento, etTipo;
    private Button btnGuardarCambios, btnVolver;
    private Usuario usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar_usuario);

        etNombre = findViewById(R.id.etNombre);
        etFechaIngreso = findViewById(R.id.etFechaIngreso);
        etRut = findViewById(R.id.etRut);
        etEstado = findViewById(R.id.etEstado);
        etVencimiento = findViewById(R.id.etVencimiento);
        etTipo = findViewById(R.id.etTipo);

        btnGuardarCambios = findViewById(R.id.btnGuardarCambios);
        btnVolver = findViewById(R.id.btnVolver);

        String rut = getIntent().getStringExtra("rut");
        usuario = DataHolder.buscarPorRut(rut);

        if (usuario != null) {
            etNombre.setText(usuario.getNombre());
            etFechaIngreso.setText(usuario.getFechaIngreso());
            etRut.setText(usuario.getRut());
            etEstado.setText(usuario.getEstado());
            etVencimiento.setText(usuario.getFechaVencimiento());
            etTipo.setText(usuario.getTipoSubscripcion());
        } else {
            Toast.makeText(this, "Usuario no encontrado", Toast.LENGTH_SHORT).show();
            finish();
        }

        btnGuardarCambios.setOnClickListener(v -> {
            if (usuario != null) {
                usuario.setNombre(etNombre.getText().toString());
                usuario.setFechaIngreso(etFechaIngreso.getText().toString());
                usuario.setRut(etRut.getText().toString());
                usuario.setEstado(etEstado.getText().toString());
                usuario.setFechaVencimiento(etVencimiento.getText().toString());
                usuario.setTipoSubscripcion(etTipo.getText().toString());
                Toast.makeText(this, "Datos modificados", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        btnVolver.setOnClickListener(v -> finish());
    }
}
