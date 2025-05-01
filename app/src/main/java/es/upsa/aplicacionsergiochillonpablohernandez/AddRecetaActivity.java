package es.upsa.aplicacionsergiochillonpablohernandez;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AddRecetaActivity extends AppCompatActivity { //Actividad para crear el forumlario para añadir una receta

    private EditText nombreInput, descripcionInput, ingredientesInput, pasosInput, dificultadInput;
    private Button guardarButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_receta);

        // Asociar los elementos del layout
        nombreInput = findViewById(R.id.nombre_input);
        descripcionInput = findViewById(R.id.descripcion_input);
        ingredientesInput = findViewById(R.id.ingrediente_input);
        pasosInput = findViewById(R.id.paso_input);
        dificultadInput = findViewById(R.id.dificultad_input);
        guardarButton = findViewById(R.id.guardar_button);

        guardarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí recogeremos los datos y los enviaremos a la lista principal
            }
        });
    }
}