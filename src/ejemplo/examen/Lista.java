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
public class Lista {
    private Nodo inicial;
    private Nodo ultimo;
    public int tamaño;

    public Lista() {
        this.inicial=null;
        this.ultimo=null;
        this.tamaño=0;
    }
    public boolean vacio(){
        return inicial==null;
    }
    public int gettamaño(){
        return tamaño;
    }
    public void agregar(String Valor){
        Nodo nuevo=new Nodo();
        nuevo.setvalor(Valor);
        if(vacio()){
            inicial=nuevo;
            ultimo=nuevo;
            ultimo.setsiguiente(nuevo);
        }else{
            ultimo.setsiguiente(nuevo);
            nuevo.setsiguiente(inicial);
            ultimo=nuevo;
        }
        tamaño++;
    }
    public void mostrar(){
        Nodo aux = inicial;
        int i = 0;
        do{
            if(aux.getvalor().equals("")){
            }else{
            System.out.print(i + "," + aux.getvalor() );
            System.out.println("");
            }
            aux = aux.getsiguiente();
            i++;
        }while(aux != inicial);
    }
    
    public void ultimo(){
        Nodo aux = inicial;
        int i = 0;
        do{
            if(i==(tamaño-1)){
                System.out.println("El ultimo dato es: "+aux.getvalor());
            }
            aux = aux.getsiguiente();
            i++;
        }while(aux != inicial);
    }
    
    public void buscareli(int a){
        Nodo aux = inicial;
        int i = 0;
        do{
            if(i==a){
                aux.setvalor("");
            }
            aux = aux.getsiguiente();
            i++;
        }while(aux != inicial);
    }
    public void buscarmodi(int a, String datonuevo){
        Nodo aux = inicial;
        int i = 0;
        do{
            if(i==a){
                aux.setvalor(datonuevo);
            }
            aux = aux.getsiguiente();
            i++;
        }while(aux != inicial);
    }
    
}
