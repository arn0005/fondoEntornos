/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoFondo;

/**
 *
 * @author angel.ruiz
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        ListaClientes lista = new ListaClientes(10);

        Cliente p1 = new Cliente("Elena1");
        Cliente p2 = new Cliente("Elena2");
        Cliente p3 = new Cliente("Elena3");
        Cliente p4 = new Cliente("Elena4");
        Cliente p5 = new Cliente("Elena5");

        System.out.println(p1);
        p1.atender();
        p1.atender();
        p2.atender();
        

    }

}
