package Asociacion;

public class MainAsociacion {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Santiago");
        ArticuloDeportivo articulo1 = new ArticuloDeportivo("Camiseta Selección Colombia");

        // Creamos la asociación
        cliente1.agregarCompra(articulo1);

        System.out.println("--- PRUEBA DE ASOCIACIÓN ---");
        System.out.println("El cliente " + cliente1.getNombre() + " compró: " + 
                           cliente1.getCompras().get(0).getNombreArticulo());
    }
}