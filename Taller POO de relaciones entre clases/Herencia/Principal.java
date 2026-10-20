import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA DE GESTIÓN TIENDA DEPORTIVA ===");

        // Registro de Cliente
        System.out.println("\n--- Datos del Cliente ---");
        System.out.print("Nombre: ");
        String nombreCliente = scanner.nextLine();
        System.out.print("Documento: ");
        String docCliente = scanner.nextLine();
        System.out.print("Categoría de fidelidad: ");
        String categoria = scanner.nextLine();
        Cliente cliente = new Cliente(nombreCliente, docCliente, categoria);

        // Registro de Empleado
        System.out.println("\n--- Datos del Empleado ---");
        System.out.print("Nombre: ");
        String nombreEmpleado = scanner.nextLine();
        System.out.print("Documento: ");
        String docEmpleado = scanner.nextLine();
        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();
        Empleado empleado = new Empleado(nombreEmpleado, docEmpleado, cargo);

        // Registro de Producto
        System.out.println("\n--- Datos del Producto ---");
        System.out.print("Nombre del artículo deportivo: ");
        String nombreProd = scanner.nextLine();
        System.out.print("Precio unitario ($): ");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer de entrada
        Producto producto = new Producto(nombreProd, precio);

        // Registro de la Asociación N-aria (Transacción)
        System.out.println("\n--- Datos de la Transacción ---");
        System.out.print("Cantidad comprada: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada
        System.out.print("Fecha de la venta (DD/MM/AAAA): ");
        String fecha = scanner.nextLine();

        // Creación del objeto de asociación n-aria uniendo las 3 entidades principales
        TransaccionVenta transaccion = new TransaccionVenta(cliente, empleado, producto, cantidad, fecha);

        // Visualización del resultado consolidado
        System.out.println("\n");
        transaccion.mostrarTransaccion();

        scanner.close();
    }
}