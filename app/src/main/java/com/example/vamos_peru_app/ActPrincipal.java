package com.example.vamos_peru_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import Desarrollador.ActDesarrollador;

public class ActPrincipal extends AppCompatActivity {

    //para ubicar los id de cada componente y rellenarlo usando el listView
    //TextView txtNombre, txtCelular, txtCorreo, txtProfesion;
    //ImageView imgFoto;

    //int codigo = new Random().nextInt(999) + 1;

    // Validar y guardar la reserva (por ejemplo, en una base de datos)
    // ...

    // Mostrar el código al usuario
      //  Toast.makeText(CurrentActivity.this, "Código de Reserva: " + codigo, Toast.LENGTH_SHORT).show();
    private EditText nom,apellPat,apellMat,numDoc,cel,correo,diaReserva,numDiaReserv,horReserv,tipoDoc,genero,cantPerson;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_principal);
        asignarReferencias();
    }


    public void asignarReferencias(){
        // Inicializar las referencias a los componentes
        nom = findViewById(R.id.txtNom);
        apellPat = findViewById(R.id.txtApePat);
        apellMat= findViewById(R.id.txtApeMat);
        numDoc=findViewById(R.id.txtNumDoc);
        cel=findViewById(R.id.txtCel);
        correo=findViewById(R.id.txtCorreo);
        diaReserva=findViewById(R.id.txtDiaReserva);
        numDiaReserv=findViewById(R.id.txtNumDiasReserv);
        horReserv=findViewById(R.id.txtHorReserv);
        tipoDoc=findViewById(R.id.txtTipDoc);
        genero=findViewById(R.id.txtGenero);
        cantPerson=findViewById(R.id.txtCantPersonas);
    }

    public static ArrayList<Reserva> listaReservas = new ArrayList<>();

    public void guardarReserva(View view) {
        String nombres = nom.getText().toString();
        String apellidoMaterno = apellMat.getText().toString();
        String apellidoPaterno = apellPat.getText().toString();
        String tipoDocumento = tipoDoc.getText().toString();
        String numeroDocumento = numDoc.getText().toString();
        String generoR = genero.getText().toString();
        String celular = cel.getText().toString();
        String correoR = correo.getText().toString();
        String cantidadPersonas = cantPerson.getText().toString();
        String diaReservacion = diaReserva.getText().toString();
        String numerosDiasReserva = numDiaReserv.getText().toString();
        String horaReserva = horReserv.getText().toString();


        //int cantidadPersonas = Integer.parseInt(cantPerson.getSelectedItem().toString());

        Reserva reserva = new Reserva(nombres,apellidoMaterno,apellidoPaterno,tipoDocumento,numeroDocumento,generoR,celular,correoR,cantidadPersonas,
                diaReservacion,numerosDiasReserva,horaReserva);
        listaReservas.add(reserva);

        Toast.makeText(this, "Reserva guardada con éxito", Toast.LENGTH_SHORT).show();
    }

    public void verListaReservas(View view) {
        Intent intent = new Intent(this, ActListaReserva.class);
        startActivity(intent);
    }


    //metodo para redireccionar al activityDesarrollador
    public void vistaDesarrollador(View view) {
        Intent intent = new Intent(this, ActDesarrollador.class);
        startActivity(intent);
    }
}