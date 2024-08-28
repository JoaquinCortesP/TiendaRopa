/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaropa;

/**
 *
 * @author Joaqu
 */
public class PrendaDeVestir {
    // Atributos
    private String codigo;
    private String nombre;
    private String marca;
    private String categoria;
    private boolean disponibilidad;

    // Constructor
    public PrendaDeVestir(String codigo, String nombre, String marca, String categoria, boolean disponibilidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.categoria = categoria;
        this.disponibilidad = disponibilidad;
    }

    // Métodos
    public void vender(Cliente cliente) {
        if (this.disponibilidad) {
            cliente.realizarCompra(this);
            this.disponibilidad = false;  // Actualizar disponibilidad
            System.out.println("Prenda " + this.nombre + " vendida al cliente " + cliente.getNombre());
        } else {
            System.out.println("La prenda no está disponible.");
        }
    }

    public void reponerInventario() {
        this.disponibilidad = true;
        System.out.println("La prenda " + this.nombre + " ha sido repuesta en el inventario.");
    }
    
    public boolean isDisponibilidad() { return disponibilidad; }

    // Getters y Setters
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    boolean isDisponible() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}

