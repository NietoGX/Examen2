package Modelo;

import Modelo.Datos.Receta;

import java.util.List;

public interface InterrogaModelo {
    Receta getReceta(String nombre);
    List<Receta> getRecetas();
}
