package es.upsa.aplicacionsergiochillonpablohernandez;

import android.app.Application;

import es.upsa.aplicacionsergiochillonpablohernandez.repositories.RecetaRepository;
import es.upsa.aplicacionsergiochillonpablohernandez.repositories.Repository;

public class RecetasAplicaction extends Application {

    private Repository repository;

    @Override
    public void onCreate()
    {
        super.onCreate();
        this.repository = new RecetaRepository();
    }

    public Repository getRepository() {
        return repository;
    }

}
