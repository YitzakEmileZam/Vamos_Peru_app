package com.example.vamos_peru_app;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ActListaReserva extends AppCompatActivity {
    private ListView listViewReservas;
    private ArrayAdapter<Reserva> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_lista);

        listViewReservas = findViewById(R.id.listViewReservas);


        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ActPrincipal.listaReservas);
        listViewReservas.setAdapter(adapter);
    }
}
