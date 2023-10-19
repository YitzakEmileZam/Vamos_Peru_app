package Desarrollador;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.vamos_peru_app.ActPrincipal;
import com.example.vamos_peru_app.R;

public class ActDesarrollador extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_desarrollador);
    }

    public void regresarPrincipal(View view) {
        Intent intent = new Intent(this, ActPrincipal.class);
        startActivity(intent);
    }

}
