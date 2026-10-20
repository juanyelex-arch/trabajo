package Asociacion;

import java.util.ArrayList;
import java.util.List;

public class ArticuloDeportivo {
    private String nombreArticulo;
    // Lista para guardar los múltiples clientes que compran este artículo
    private List<Cliente> clientes;

    public ArticuloDeportivo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
        // Aseguramos la relación bidireccional: si el cliente no tiene este artículo, se lo agregamos
        if(!cliente.getCompras().contains(this)) {
            cliente.agregarCompra(this);
        }
    }
    
    public List<Cliente> getClientes() {
        return clientes;
    }
    
    public String getNombreArticulo() {
        return nombreArticulo;
    }
}