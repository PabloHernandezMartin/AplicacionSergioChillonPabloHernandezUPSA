package es.upsa.aplicacionsergiochillonpablohernandez.viewmodels;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;

import java.util.List;

import es.upsa.aplicacionsergiochillonpablohernandez.RecetasAplicaction;
import es.upsa.aplicacionsergiochillonpablohernandez.models.Receta;
import es.upsa.aplicacionsergiochillonpablohernandez.repositories.Repository;

public class MainViewModel extends ViewModel {

    //Referencia al repositorio donde se guardan los datos
    private Repository repository;

    //Guarda la lista actual de recetas
    private MutableLiveData<List<Receta>> _receta = new MutableLiveData<>(List.of());

    //Encapsulacion
    public LiveData<List<Receta>> recetas = _receta;

    //CONSTRUCTOR
    public MainViewModel(Repository repository) {
        this.repository = repository;
    }

    public void queryRecetas() {
        List<Receta> receta = repository.findRecetas();
        _receta.setValue(receta);
    }

    public static ViewModelProvider.Factory factory(){
        return new ViewModelProvider.Factory() {
            @NonNull
            @Override
            public <T extends ViewModel> T create(@NonNull Class<T> modelClass, @NonNull CreationExtras extras) {
                RecetasAplicaction app = (RecetasAplicaction) extras.get(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY);
                return ViewModelProvider.Factory.super.create(modelClass, extras);
            }
        };
    }
}
