package com.example.apprata;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class DetalleUsuarioActivity extends AppCompatActivity {

    private TextView tvNombre, tvFechaIngreso, tvRut, tvEstado, tvVencimiento, tvTipo;
    private Button btnModificar, btnVolver;
    private Usuario usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_usuario);

        tvNombre = findViewById(R.id.tvNombre);
        tvFechaIngreso = findViewById(R.id.tvFechaIngreso);
        tvRut = findViewById(R.id.tvRut);
        tvEstado = findViewById(R.id.tvEstado);
        tvVencimiento = findViewById(R.id.tvVencimiento);
        tvTipo = findViewById(R.id.tvTipo);

        btnModificar = findViewById(R.id.btnModificar);
        btnVolver = findViewById(R.id.btnVolver);

        String rut = getIntent().getStringExtra("rut");
        usuario = DataHolder.buscarPorRut(rut);

        if (usuario != null) {
            tvNombre.setText("Nombre: " + usuario.getNombre());
            tvFechaIngreso.setText("Fecha Ingreso: " + usuario.getFechaIngreso());
            tvRut.setText("RUT: " + usuario.getRut());
            tvEstado.setText("Estado: " + usuario.getEstado());
            tvVencimiento.setText("Vence: " + usuario.getFechaVencimiento());
            tvTipo.setText("Tipo: " + usuario.getTipoSubscripcion());
        }

        btnModificar.setOnClickListener(v -> {
            Intent i = new Intent(this, ModificarUsuarioActivity.class);
            i.putExtra("rut", usuario.getRut());
            startActivity(i);
        });

        btnVolver.setOnClickListener(v -> finish());
    }
}
