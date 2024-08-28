/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaropa;

/**
 *
 * @author Joaqu
 */
public class Cliente {
    // Atributos
    private String numeroCliente;
    private String nombre;
    private String prendasAdquiridas;

    // Constructor
    public Cliente(String numeroCliente, String nombre) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.prendasAdquiridas = "";
    }

    // Métodos
    public void realizarCompra(PrendaDeVestir prenda) {
        this.prendasAdquiridas += prenda.getNombre() + ", ";
        System.out.println("El cliente " + this.nombre + " ha adquirido la prenda: " + prenda.getNombre());
    }

    public void devolverPrenda(PrendaDeVestir prenda) {
        // Ejemplo simple, removiendo prenda del registro de adquisiciones.
        if (this.prendasAdquiridas.contains(prenda.getNombre())) {
            this.prendasAdquiridas = this.prendasAdquiridas.replace(prenda.getNombre() + ", ", "");
            prenda.reponerInventario();
            System.out.println("El cliente " + this.nombre + " ha devuelto la prenda: " + prenda.getNombre());
        } else {
            System.out.println("La prenda no está en el registro de adquisiciones del cliente.");
        }
    }
    // Getters y Setters
    
    public String getNumeroCliente() { return numeroCliente; }
    public String getNombre() { return nombre; }
    public String getPrendasAdquiridas() { return prendasAdquiridas; }
}
