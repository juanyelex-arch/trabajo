class Cliente extends Persona {
    private String categoriaFidelidad;

    public Cliente(String nombre, String documento, String categoriaFidelidad) {
        super(nombre, documento);
        this.categoriaFidelidad = categoriaFidelidad;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Rol: Cliente | Categoría: " + categoriaFidelidad);
    }
}