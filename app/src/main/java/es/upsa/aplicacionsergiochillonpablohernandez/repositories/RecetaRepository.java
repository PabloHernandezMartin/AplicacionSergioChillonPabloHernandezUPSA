package es.upsa.aplicacionsergiochillonpablohernandez.repositories;
import es.upsa.aplicacionsergiochillonpablohernandez.repositories.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.upsa.aplicacionsergiochillonpablohernandez.R;
import es.upsa.aplicacionsergiochillonpablohernandez.models.Receta;

public class RecetaRepository implements Repository{ // Clase encargada de proporcionar la lista de recetas a la app

    private Map<Integer, Receta> recetas;

    //CONSTRUCTOR
    public RecetaRepository() {
        recetas = new HashMap<>(); //Es como una "base de datos en memoria" en la propia app

        recetas.put(1, new Receta(1, "Tortilla de Patatas",
                "Una receta tradicional española hecha con huevos y patatas.",
                List.of("Huevos", "Patatas", "Cebolla", "Aceite de oliva", "Sal"),
                "Dificultad: Fácil",
                List.of(
                        "Pelar y cortar las patatas y la cebolla.",
                        "Freírlas en aceite hasta que estén doradas.",
                        "Batir los huevos y mezclarlos con las patatas.",
                        "Cocinar la mezcla en una sartén hasta que cuaje.",
                        "Dar la vuelta con un plato y cocinar por el otro lado."
                )));

        recetas.put(2, new Receta(2, "Paella Valenciana",
                "El plato más internacional de la gastronomía española.",
                List.of("Arroz", "Pollo", "Conejo", "Judías verdes", "Garrofón", "Tomate", "Pimentón", "Azafrán", "Aceite de oliva", "Sal"),
                "Dificultad: Alta",
                List.of(
                        "Sofreír la carne troceada en la paellera.",
                        "Añadir las verduras y sofreír.",
                        "Incorporar el tomate y el pimentón.",
                        "Añadir el arroz y remover.",
                        "Verter el caldo caliente y el azafrán.",
                        "Cocinar a fuego fuerte 10 minutos y a fuego lento otros 8 minutos.",
                        "Dejar reposar tapada 5 minutos."
                )));

        recetas.put(3, new Receta(3, "Gazpacho",
                "Sopa fría de verduras típica de Andalucía, perfecta para el verano.",
                List.of("Tomates", "Pimiento verde", "Pepino", "Ajo", "Pan duro", "Aceite de oliva", "Vinagre", "Sal"),
                "Dificultad: Baja",
                List.of(
                        "Lavar y trocear todas las verduras.",
                        "Poner todos los ingredientes en un vaso de batidora.",
                        "Triturar hasta conseguir una textura homogénea.",
                        "Colar para eliminar posibles trozos y semillas.",
                        "Refrigerar al menos 2 horas antes de servir."
                )));

        recetas.put(4, new Receta(4, "Pulpo a la Gallega",
                "Plato tradicional de Galicia con pulpo cocido y pimentón.",
                List.of("Pulpo", "Patatas", "Pimentón dulce", "Pimentón picante", "Aceite de oliva", "Sal gorda"),
                "Dificultad: Media",
                List.of(
                        "Congelar el pulpo previamente para ablandarlo.",
                        "Cocer el pulpo introduciéndolo 3 veces en agua hirviendo.",
                        "Cocer a fuego lento durante 40-50 minutos.",
                        "Cortar en rodajas y servir sobre una cama de patatas cocidas.",
                        "Espolvorear con pimentón y sal gorda.",
                        "Rociar con un buen chorro de aceite de oliva."
                )));

        recetas.put(5, new Receta(5, "Fabada Asturiana",
                "Guiso tradicional asturiano con fabes y embutidos.",
                List.of("Fabes (alubias blancas)", "Chorizo", "Morcilla", "Panceta", "Azafrán", "Sal"),
                "Dificultad: Media",
                List.of(
                        "Poner las fabes en remojo la noche anterior.",
                        "Cocer las fabes a fuego lento con los embutidos.",
                        "Retirar la espuma que se forma en la superficie.",
                        "Cocinar a fuego lento durante 2-3 horas.",
                        "Servir caliente con los embutidos troceados."
                )));

        recetas.put(6, new Receta(6, "Crema Catalana",
                "Postre tradicional catalán similar a la crème brûlée.",
                List.of("Leche", "Yemas de huevo", "Azúcar", "Canela en rama", "Piel de limón", "Maicena", "Azúcar para caramelizar"),
                "Dificultad: Media",
                List.of(
                        "Infusionar la leche con canela y piel de limón.",
                        "Batir las yemas con el azúcar y la maicena.",
                        "Mezclar con la leche caliente y remover hasta espesar.",
                        "Verter en cazuelas de barro y dejar enfriar.",
                        "Espolvorear con azúcar y quemar con un quemador o plancha."
                )));

        recetas.put(7, new Receta(7, "Cocido Madrileño",
                "Plato tradicional de Madrid con garbanzos y carnes.",
                List.of("Garbanzos", "Carne de ternera", "Pollo", "Chorizo", "Morcilla", "Tocino", "Patatas", "Zanahorias", "Repollo"),
                "Dificultad: Alta",
                List.of(
                        "Poner los garbanzos en remojo la noche anterior.",
                        "Cocer las carnes en agua abundante y espumar.",
                        "Añadir los garbanzos y cocer a fuego lento.",
                        "Incorporar las verduras a mitad de cocción.",
                        "Servir separando los garbanzos, las carnes y el caldo con fideos."
                )));

        recetas.put(8, new Receta(8, "Ensaladilla Rusa",
                "Ensalada popular en toda España con patatas y mayonesa.",
                List.of("Patatas", "Zanahorias", "Guisantes", "Atún en conserva", "Huevos duros", "Aceitunas", "Mayonesa", "Sal"),
                "Dificultad: Baja",
                List.of(
                        "Cocer las patatas y zanahorias con piel.",
                        "Cocer los huevos hasta que estén duros.",
                        "Pelar y cortar en dados pequeños patatas y zanahorias.",
                        "Mezclar con los guisantes, el atún desmigado y los huevos picados.",
                        "Aliñar con mayonesa y decorar con aceitunas."
                )));

        recetas.put(9, new Receta(9, "Croquetas de Jamón",
                "Tapa española por excelencia, cremosas por dentro y crujientes por fuera.",
                List.of("Jamón serrano", "Harina", "Leche", "Mantequilla", "Cebolla", "Huevo", "Pan rallado", "Aceite para freír", "Sal"),
                "Dificultad: Media",
                List.of(
                        "Picar finamente la cebolla y el jamón.",
                        "Preparar una bechamel con mantequilla, harina y leche.",
                        "Añadir el jamón y la cebolla y cocinar hasta espesar.",
                        "Enfriar la masa en la nevera durante varias horas.",
                        "Formar las croquetas, pasar por huevo y pan rallado.",
                        "Freír en aceite abundante hasta que estén doradas."
                )));

        recetas.put(10, new Receta(10, "Churros con Chocolate",
                "Desayuno o merienda tradicional española.",
                List.of("Harina", "Agua", "Sal", "Aceite para freír", "Chocolate negro", "Leche", "Azúcar"),
                "Dificultad: Media",
                List.of(
                        "Hervir el agua con sal.",
                        "Añadir la harina de golpe y remover hasta formar una masa.",
                        "Poner la masa en una manga pastelera con boquilla estrellada.",
                        "Freír los churros en aceite muy caliente hasta que estén dorados.",
                        "Para el chocolate: derretir el chocolate con leche y azúcar al gusto.",
                        "Servir los churros espolvoreados con azúcar junto al chocolate caliente."
                )));
    }

    //Devuelve todas las recetas del Map
    @Override
    public List<Receta> findRecetas() {
        Collection<Receta> values = recetas.values();
        return List.copyOf(values);
    }

    //Busca una receta a partir de su ID
    @Override
    public Receta findRecetaById(String id) {
        return recetas.get(Integer.parseInt(id));
    }

}
