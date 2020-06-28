package Modelo;

import Excepciones.ExcepcionYaExisteReceta;
import Excepciones.NoExisteReceta;
import Modelo.Datos.Receta;

public interface CambioModelo {
    Receta crearReceta(Receta receta) throws ExcepcionYaExisteReceta;
    boolean eliminarTarea(String nombre) throws NoExisteReceta;
}
