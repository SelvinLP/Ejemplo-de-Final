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
public class Nodo {
    private String Dato;
    private Nodo Siguiente;

    public  void Nodo() {
        this.Siguiente=null;
        this.Dato="";
    }
    public String getvalor(){
        return Dato;
    }
    public Nodo getsiguiente(){
        return Siguiente;
    }
    public void setvalor(String valor){
        this.Dato=valor;
    }
    public void setsiguiente(Nodo siguiente){
        this.Siguiente=siguiente;
    }
}
