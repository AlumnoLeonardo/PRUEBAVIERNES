package com.example.apprata;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TiendasActivity extends AppCompatActivity {

    private ListView listTiendas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiendas);

        listTiendas = findViewById(R.id.listTiendas);

        String[] tiendas = {

                "Muscle Store Iquique - Av. Arturo Prat 1050 - 09:00 a 20:00",
                "NutriSport Center - Calle Tarapacá 456 - 10:00 a 19:30",
                "Fitness Pro Market - Av. Héroes de la Concepción 789 - 09:30 a 21:00",
                "Power Nutrition - Av. Salvador Allende 101 - 10:00 a 20:00",
                "Suplementos Fit Iquique - Av. La Tirana 2345 - 11:00 a 19:00"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, tiendas);

        listTiendas.setAdapter(adapter);
    }
}
