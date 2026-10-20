package Interface;

public class CamisetaSeleccion implements Comercializable {
    private double precioBase;

    public CamisetaSeleccion(double precioBase) {
        this.precioBase = precioBase;
    }

    // Cumpliendo el primer método del contrato
    @Override
    public double calcularPrecioConImpuesto() {
        return precioBase * 1.19; // Agregando el 19% de IVA
    }

    // Cumpliendo el segundo método del contrato
    @Override
    public void aplicarDescuento(double porcentaje) {
        precioBase -= (precioBase * (porcentaje / 100));
        System.out.println("Descuento aplicado. Nuevo precio base: $" + precioBase);
    }
}
