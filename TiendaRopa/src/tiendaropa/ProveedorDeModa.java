/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaropa;

/**
 *
 * @author Joaqu
 */
public class ProveedorDeModa {
    // Atributos
    private String codigoProveedor;
    private String nombre;
    private String prendasSuministradas;

    // Constructor
    public ProveedorDeModa(String codigoProveedor, String nombre) {
        this.codigoProveedor = codigoProveedor;
        this.nombre = nombre;
        this.prendasSuministradas = "";
    }

    // Métodos
    public void suministrarPrenda(PrendaDeVestir prenda) {
        this.prendasSuministradas += prenda.getNombre() + ", ";
        System.out.println("Proveedor " + this.nombre + " ha suministrado la prenda: " + prenda.getNombre());
    }

    // Getters y Setters
    public String getCodigoProveedor() { return codigoProveedor; }
    public String getNombre() { return nombre; }
    public String getPrendasSuministradas() { return prendasSuministradas; }
}

