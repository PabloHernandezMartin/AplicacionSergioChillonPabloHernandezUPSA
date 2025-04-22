package es.upsa.aplicacionsergiochillonpablohernandez.models;

import java.util.List;
public class Receta { //Creamos esta clase para guardar y manejar los datos de una receta individual

    //ATRIBUTOS

    private int id;
    private String nombre;
    private String descripcion;
    private List<String> ingredientes;
    private String dificultad;
    private List<String> pasos;

    //CONSTRUCTOR:

    public Receta(int id, String nombre, String descripcion, List<String> ingredientes, String dificultad, List<String> pasos) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ingredientes = ingredientes;
        this.dificultad = dificultad;
        this.pasos = pasos;
    }


    //GETTERS:

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public String getDificultad() {
        return dificultad;
    }

    public List<String> getPasos() {
        return pasos;
    }
}
