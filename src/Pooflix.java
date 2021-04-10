import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Pooflix {

    public Pooflix(){
        materiales = new ArrayList<Material>();
    }

    public int CAPACIDAD = 15;

    private List<Material> materiales;

    public boolean agregar(Material m){
        boolean respuesta = true;
        for(int i = 0; i < materiales.size(); i++){
            if(m.getCodigo() == materiales.get(i).getCodigo()){
                respuesta = false;
            }
        }
        if(respuesta == true){
            if(materiales.size() < CAPACIDAD){
                materiales.add(m);
            }
            else{
               respuesta = false;
            }
        }
        return respuesta;
    }

    public boolean retirar(int codigo){
        boolean respuesta = false;
        for(int i = 0; i < materiales.size(); i++){
            if(codigo == materiales.get(i).getCodigo()){
                materiales.remove(i);
                respuesta = true;
            }
        }
        return respuesta;
    }

    public Material buscar(int codigo){
        for(int i=0; i < materiales.size(); i++){
            if(codigo == materiales.get(i).getCodigo()){
                return materiales.get(i);
            }
        }
        return null;
    }

    public Material buscar(String nombre){
        for(int i=0; i< materiales.size(); i++){
            if(nombre == materiales.get(i).getNombre()){
                return materiales.get(i);
            }
        }
        return null;
    }

    public List<Material> buscarPorTipo(String tipo){
        List<Material> materialesencontrados = new ArrayList<Material>();

        for (int i = 0; i < materiales.size(); i++){
            if(materiales.get(i).getTipo() == tipo){
                materialesencontrados.add(materiales.get(i));
            }
        }
        return materialesencontrados;
    }

    public int calcularDuracionTotal(){
        int sumatoria = 0;
        for(int i=0; i<materiales.size();i++){
         sumatoria = sumatoria + materiales.get(i).getDuracion();
        }
        return sumatoria;
    }

    public List<Material> ordernarPorCodigo() {
        List<Material> materialesordenados = materiales;

        return materialesordenados;
    }
}
