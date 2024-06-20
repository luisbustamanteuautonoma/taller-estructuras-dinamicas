package colas;
import java.util.LinkedList;
import java.util.Queue;

public class ImplementaCola {
    Queue<Integer> cola = new LinkedList<>();
    
    public void AgregaElemento(int dato){
        cola.add(dato);
    }

    public void MuestraCola(){
        System.out.println("Despliega cola");
        for (Integer elemento : cola){
            System.out.println(elemento);
        }
    }

    public void MuestraPrimerElemento(){
        if (!cola.isEmpty()) {
            Integer elementoInicio = cola.peek();
            System.out.println("Primer elemento de la cola: " + elementoInicio);
        } else {
            System.out.println("La cola está vacía");
        }
    }

    public void EliminaElemento(){
        if (!cola.isEmpty()) {
            Integer elementoEliminado = cola.poll();
            System.out.println("Elemento eliminado de la cola: " + elementoEliminado);
        } else {
            System.out.println("La cola está vacía, no se puede eliminar ningún elemento");
        }
    }

    public void EditaElemento(int posicion, int nuevoValor){
        if (posicion >= 0 && posicion < cola.size()) {
            LinkedList<Integer> temp = new LinkedList<>(cola);
            temp.set(posicion, nuevoValor);
            cola = new LinkedList<>(temp);
            System.out.println("Elemento en la posición " + posicion + " ha sido actualizado a " + nuevoValor);
        } else {
            System.out.println("Posición inválida");
        }
    }
}
