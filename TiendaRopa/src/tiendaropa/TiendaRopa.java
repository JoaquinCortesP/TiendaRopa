/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendaropa;

/**
 *
 * @author Joaqu
 */
public class TiendaRopa {
 public static void main(String[] args) {       
        SistemaGestionInventarios sistemaGestion = new SistemaGestionInventarios();

        PrendaDeVestir prenda1 = new PrendaDeVestir("001", "Camiseta", "Nike", "Deportiva", true);
        PrendaDeVestir prenda2 = new PrendaDeVestir("002", "Jeans", "Levis", "Casual", true);

        sistemaGestion.registrarPrenda(prenda1);
        sistemaGestion.registrarPrenda(prenda2);

        Cliente cliente1 = new Cliente("C001", "Juan Perez");
        Cliente cliente2 = new Cliente("C002", "Maria Lopez");

        sistemaGestion.registrarCliente(cliente1);
        sistemaGestion.registrarCliente(cliente2);

        sistemaGestion.verificarDisponibilidad(prenda1);

        prenda1.vender(cliente1);
        prenda1.vender(cliente2);

        prenda1.reponerInventario();
        cliente1.devolverPrenda(prenda1);

        sistemaGestion.generarInformeVentas();
    }
}
