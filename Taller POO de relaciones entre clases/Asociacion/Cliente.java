package Asociacion;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    // Lista para guardar los múltiples artículos que compra un cliente
    private List<ArticuloDeportivo> compras;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.compras = new ArrayList<>();
    }

    public void agregarCompra(ArticuloDeportivo articulo) {
        compras.add(articulo);
        // Aseguramos la relación bidireccional: si el artículo no tiene a este cliente, se lo agregamos
        if(!articulo.getClientes().contains(this)) {
            articulo.agregarCliente(this);
        }
    }
    
    public List<ArticuloDeportivo> getCompras() {
        return compras;
    }
    
    public String getNombre() {
        return nombre;
    }
}