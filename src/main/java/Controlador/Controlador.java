package Controlador;

import Modelo.Datos.Receta;

import java.util.List;

public interface Controlador {
    Receta crearReceta();
    boolean eliminarReceta();
    Receta getReceta();
    List<Receta> getRecetas();



}
