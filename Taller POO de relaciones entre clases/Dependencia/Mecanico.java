package Dependencia;
public class Mecanico {
    private String nombre;

    public Mecanico(String nombre) {
        this.nombre = nombre;
    }

    // Aquí ocurre la dependencia: el método recibe un objeto de tipo Motocicleta
    public void realizarMantenimiento(Motocicleta moto) {
        System.out.println("El mecánico " + this.nombre + 
                           " está revisando la motocicleta: " + moto.getDetalles());
    }
}