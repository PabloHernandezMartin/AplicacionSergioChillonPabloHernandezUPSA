package es.upsa.aplicacionsergiochillonpablohernandez.repositories;

import java.util.List;

import es.upsa.aplicacionsergiochillonpablohernandez.models.Receta;

public interface Repository {

    List<Receta> findRecetas();
    Receta findRecetaById(String id);
}
