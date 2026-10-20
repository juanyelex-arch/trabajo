package Interface; // Ajusta el nombre del package según como hayas nombrado la carpeta en minúsculas

public class MainInterface {
    public static void main(String[] args) {
        CamisetaSeleccion camiseta = new CamisetaSeleccion(250000);
        
        System.out.println("--- PRUEBA DE INTERFAZ ---");
        System.out.println("Precio con IVA: $" + camiseta.calcularPrecioConImpuesto());
        
        camiseta.aplicarDescuento(15);
    }
}