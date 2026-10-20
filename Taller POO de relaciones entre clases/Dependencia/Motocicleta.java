package Dependencia;
public class Motocicleta {
    private String marca;
    private String modelo;

    public Motocicleta(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getDetalles() {
        return marca + " " + modelo;
    }
}

