package Modelo;

import Excepciones.ExcepcionYaExisteReceta;
import Excepciones.NoExisteReceta;
import Modelo.Datos.Receta;
import Vista.InformaVista;

import java.util.ArrayList;
import java.util.List;

public class ImplementacionModelo implements CambioModelo, InterrogaModelo{
    private ArrayList<Receta> recetas;
    private InformaVista vista;

    public ImplementacionModelo(){
        recetas = new ArrayList<Receta>();
    }

    public void setVista(InformaVista vista) {
        this.vista = vista;
    }
    public Receta crearReceta(Receta receta) throws ExcepcionYaExisteReceta {
        Receta rec = new Receta(receta.getNombre(), receta.getPreparacion(), receta.getIngredientes(), receta.getTipo(),receta.getDificultad());
        for(Receta r: recetas){
            if (r.getNombre().equals(rec.getNombre()))
                throw new ExcepcionYaExisteReceta();
        }
        if(recetas.add(rec)){
            vista.nuevaReceta();
            return rec;
        }

        return null;
    }

    public boolean eliminarTarea(String nombre) throws NoExisteReceta {
        for (Receta rec : recetas) {
            if (rec.getNombre() == nombre) {
                recetas.remove(rec);
                vista.eliminaReceta();
                return true;

            }
        }
        throw new NoExisteReceta();
    }

    public Receta getReceta(String nombre) throws NoExisteReceta {
        for(Receta r:recetas)
            if(r.getNombre().equals(nombre))
                return r;
        throw new NoExisteReceta();
    }



    public List<Receta> getRecetas() {

        return recetas;
    }
}
