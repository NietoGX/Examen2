package Controlador;

import Modelo.CambioModelo;
import Modelo.Datos.Receta;
import Vista.InterrogaVista;

import java.util.List;

public class ImplementacionControlador implements Controlador{
    private InterrogaVista vista;
    private CambioModelo modelo;
    public Receta crearReceta() {
        return null;
    }

    public boolean eliminarReceta() {
        return false;
    }

    public Receta getReceta() {
        return null;
    }

    public List<Receta> getRecetas() {
        return null;
    }
    public void setModelo(CambioModelo modelo) {
        this.modelo = modelo;
    }

    public void setVista(InterrogaVista vista) {
        this.vista = vista;
    }
}
