package Modelo;

import Modelo.Datos.Receta;

public interface CambioModelo {
    Receta crearReceta(Receta receta);
    boolean eliminarTarea(String nombre);
}
