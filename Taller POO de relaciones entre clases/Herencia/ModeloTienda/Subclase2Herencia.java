class Empleado extends Persona {
    private String cargo;

    public Empleado(String nombre, String documento, String cargo) {
        super(nombre, documento);
        this.cargo = cargo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Rol: Empleado | Cargo: " + cargo);
    }
}