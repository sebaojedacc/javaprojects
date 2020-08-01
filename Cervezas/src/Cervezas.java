public class Cervezas {
    //atributos
    private String nombre;
    private String marca;
    private String tipo;
    private float grados;
    private String pais;

    public Cervezas (String nombre, String marca, String tipo, float grados, String pais) {
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        this.grados = grados;
        this.pais = pais;
    }

    public String getNombre () {
        return nombre;
    }

    public String getMarca () {
        return marca;
    }

    public String getTipo () {
        return tipo;
    }

    public float getGrados () {
        return grados;
    }

    public String getPais () {
        return pais;
    }

    public String datos (){
        return "Nombre: "+nombre+
                "\nMarca: "+marca+
                "\nTipo: "+tipo+
                "\nGrados de alcohol: "+grados+
                "\nPais de origen: "+pais;
    }

}
