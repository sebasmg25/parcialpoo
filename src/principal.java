import java.util.List;

public class principal {

    public static void main(String[] args){
        TipoMaterial tipo = new TipoMaterial();
        Material m1 = new Material(1, "Material 1", 50, tipo.PELICULA);
        Material m2 = new Material(2, "Material 2", 90, tipo.BIOGRAFIAS);
        Material m3 = new Material(3, "Material 3", 80, tipo.DOCUMENTAL);
        Material m4 = new Material(4, "Material 4", 70, tipo.SERIE);

        Pooflix pooflix = new Pooflix();

        boolean agregarM1 = pooflix.agregar(m1);
        boolean agregarM2 = pooflix.agregar(m2);
        boolean agregarM3 = pooflix.agregar(m3);
        boolean agregarM4 = pooflix.agregar(m4);

        System.out.println(agregarM1 + " " + agregarM2 + " " +  agregarM3 +  " " + agregarM4);

        System.out.println(pooflix.retirar(m2.getCodigo()));

        Material encontradocodigo = pooflix.buscar(m4.getCodigo());
        Material encontradonombre = pooflix.buscar(m1.getNombre());


        List<Material> materialestipo = pooflix.buscarPorTipo(tipo.PELICULA);

        System.out.println(pooflix.calcularDuracionTotal());
    }
}
