class Persona {
    protected String nombre;
    protected String documento;

    public Persona(String nombre, String documento) {
        this.nombre = nombre;
        this.documento = documento;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " | Documento: " + documento);
    }
}