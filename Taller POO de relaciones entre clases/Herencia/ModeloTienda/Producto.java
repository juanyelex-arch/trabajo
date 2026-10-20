class Producto {
    private String nombreProducto;
    private double precio;

    public Producto(String nombreProducto, double precio) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    public void mostrarProducto() {
        System.out.println("Artículo: " + nombreProducto + " | Precio Unitario: $" + precio);
    }
}