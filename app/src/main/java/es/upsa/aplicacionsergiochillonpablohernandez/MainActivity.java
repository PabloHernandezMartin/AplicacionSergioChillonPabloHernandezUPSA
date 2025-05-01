package es.upsa.aplicacionsergiochillonpablohernandez;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

import es.upsa.aplicacionsergiochillonpablohernandez.adapters.RecetaAdapter;
import es.upsa.aplicacionsergiochillonpablohernandez.databinding.ActivityMainBinding;
import es.upsa.aplicacionsergiochillonpablohernandez.models.Receta;
import es.upsa.aplicacionsergiochillonpablohernandez.viewmodels.MainViewModel;

public class MainActivity extends AppCompatActivity
{
    MainViewModel viewModel;
    ActivityMainBinding viewBinding;
    RecetaAdapter adapter = new RecetaAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}