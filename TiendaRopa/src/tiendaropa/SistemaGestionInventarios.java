/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaropa;

/**
 *
 * @author Joaqu
 */
public class SistemaGestionInventarios {
    // Atributos
    private String catalogoPrendas;
    private String clientesRegistrados;
    private String proveedoresActivos;

    // Constructor
    public SistemaGestionInventarios() {
        this.catalogoPrendas = "";
        this.clientesRegistrados = "";
        this.proveedoresActivos = "";
    }

    // Métodos
    public void registrarPrenda(PrendaDeVestir prenda) {
        this.catalogoPrendas += prenda.getNombre() + ", ";
        System.out.println("Prenda " + prenda.getNombre() + " registrada en el catálogo.");
    }

    public void registrarCliente(Cliente cliente) {
        this.clientesRegistrados += cliente.getNombre() + ", ";
        System.out.println("Cliente " + cliente.getNombre() + " registrado en el sistema.");
    }

    public void verificarDisponibilidad(PrendaDeVestir prenda) {
        if (prenda.isDisponible()) {
            System.out.println("La prenda " + prenda.getNombre() + " está disponible.");
        } else {
            System.out.println("La prenda " + prenda.getNombre() + " no está disponible.");
        }
    }

    public void generarInformeVentas() {
        System.out.println("Generando informe de ventas...");
        
    }

    
    public String getCatalogoPrendas() { return catalogoPrendas; }
    public String getClientesRegistrados() { return clientesRegistrados; }
    public String getProveedoresActivos() { return proveedoresActivos; }
}