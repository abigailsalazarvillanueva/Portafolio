package mx.utng.s09;

public class Vehiculo {
    //Atributos
    private Combustible combustible;
    private Llanta[] llantas = new Llanta[4];
    private String marca;
    private String modelo;
    private int anioFabricacion;

    //Metodo Constructor
    public Vehiculo(String marca, String modelo, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }

    //Metodos getters y setters
    public Combustible getCombustible() {
        return combustible;
    }
    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }
    public Llanta[] getLlantas() {
        return llantas;
    }
    public void setLlantas(Llanta[] llantas) {
        this.llantas = llantas;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAnioFabricacion() {
        return anioFabricacion;
    }
    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }    

    public void colocarLlantas(Llanta delanteraIzquierda, 
        Llanta delanteraDerecha, 
        Llanta traseraIzquierda, 
        Llanta traseraDerecha){
            llantas[0] = delanteraIzquierda;
            llantas[1] = delanteraDerecha;
            llantas[2] = traseraIzquierda;
            llantas[3] = traseraDerecha;
    }

    public void llenarTanque(){
        combustible.setLitrosActuales(combustible.getLitrosMaximos());
    }

    public void avanzar(){
        if(combustible.getLitrosActuales()>0){
            for (Llanta llanta : llantas) {
                llanta.rodar();
            }
            combustible.usar();
        }else{
            System.out.println("No hay combustible.");
        }
    }
}