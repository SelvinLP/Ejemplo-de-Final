/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.examen;

/**
 *
 * @author Aragon Perez
 */
public class EjemploExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lt=new Lista();
        lt.agregar("Intento 1");
        lt.agregar("Intento 2");
        
        System.out.println("El tamaño es el siguiente"+ lt.gettamaño());
        
        System.out.println("");
        System.out.println("Mostrar todos");
        lt.mostrar();
        System.out.println("////////////");
        System.out.println("");
        lt.ultimo();
        System.out.println("///////////");
        System.out.println("");
        lt.buscarmodi(0, "Modificado");
        System.out.println("Se comprueba que se modifico mostrando la lista");
        lt.mostrar();
        System.out.println("///////////////");
        System.out.println("");
        lt.buscareli(0);
        System.out.println("se elimino");
        lt.mostrar();
    }
    
}
