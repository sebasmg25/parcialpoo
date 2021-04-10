public class Material {

    private int codigo;

    private String nombre;

    private int duracion;

    private String tipo;

    public Material (int codigo , String nombre, int duracion, String tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.duracion = duracion;
        this.tipo = tipo;
    }

    public int getCodigo (){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public int getDuracion(){
        return this.duracion;
    }

    public void setDuracion(int duracion){
        this.duracion = duracion;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

}
