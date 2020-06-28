package Modelo;

import Modelo.Datos.Receta;
import Vista.InformaVista;

import java.util.ArrayList;
import java.util.List;

public class ImplementacionModelo implements CambioModelo, InterrogaModelo{
    private ArrayList<Receta> recetas;
    private InformaVista vista;

    public Receta crearReceta(Receta receta) {
        return null;
    }

    public boolean eliminarTarea(String nombre) {
        return false;
    }

    public Receta getReceta(String nombre) {
        return null;
    }

    public List<Receta> getRecetas() {
        return null;
    }
}
