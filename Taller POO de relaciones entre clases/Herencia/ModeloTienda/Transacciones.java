class TransaccionVenta {
    private Cliente cliente;
    private Empleado empleado;
    private Producto producto;
    private int cantidad;
    private String fecha;

    public TransaccionVenta(Cliente cliente, Empleado empleado, Producto producto, int cantidad, String fecha) {
        this.cliente = cliente;
        this.empleado = empleado;
        this.producto = producto;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public void mostrarTransaccion() {
        System.out.println("==================================================");
        System.out.println("      DETALLE DE ASOCIACIÓN N-ARIA (VENTA)");
        System.out.println("==================================================");
        System.out.println("Fecha de transacción: " + fecha);
        System.out.println("Cantidad adquirida: " + cantidad);
        System.out.println("--------------------------------------------------");
        System.out.println("Información del Cliente:");
        cliente.mostrarDatos();
        System.out.println("--------------------------------------------------");
        System.out.println("Información del Empleado:");
        empleado.mostrarDatos();
        System.out.println("--------------------------------------------------");
        System.out.println("Información del Producto:");
        producto.mostrarProducto();
        System.out.println("==================================================");
    }
}