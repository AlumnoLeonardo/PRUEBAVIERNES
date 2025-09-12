package com.example.apprata;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ListadoUsuariosActivity extends AppCompatActivity {

    private ListView listView;
    private Button btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_usuarios);

        listView = findViewById(R.id.listViewUsuarios);
        btnVolver = findViewById(R.id.btnVolver);

        ArrayAdapter<Usuario> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                DataHolder.usuarios
        );

        listView.setAdapter(adapter);

        listView.setOnItemClickListener((AdapterView<?> parent, android.view.View view, int position, long id) -> {
            Usuario seleccionado = DataHolder.usuarios.get(position);
            Intent i = new Intent(this, DetalleUsuarioActivity.class);
            i.putExtra("rut", seleccionado.getRut());
            startActivity(i);
        });

        btnVolver.setOnClickListener(v -> finish());
    }
}
