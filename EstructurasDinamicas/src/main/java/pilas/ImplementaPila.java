package pilas;

import java.util.Stack;

public class ImplementaPila {

    Stack<Integer> pila = new Stack<>();

    public void AgregaElemento(int dato) {
        pila.push(dato);
    }

    public void MuestraPila() {
        System.out.println("Despliega pila");
        for (Integer elemento : pila) {
            System.out.println(elemento);
        }
    }

    public void MuestraElementoArriba() {
        if (!pila.isEmpty()) {
            Integer elementoInicio = pila.peek();
            System.out.println("Primer elemento de la pila: " + elementoInicio);
        } else {
            System.out.println("La pila esta vacia");
        }
    }

    public void EliminaElemento() {
        if (!pila.isEmpty()) {
            Integer elementoEliminado = pila.pop();
            System.out.println("Elemento eliminado de la pila: " + elementoEliminado);
        } else {
            System.out.println("La pila esta vacia, no se puede eliminar ningun elemento");
        }
    }

    public void EditaElemento(int posicion, int nuevoValor) {
        if (posicion >= 0 && posicion < pila.size()) {
            pila.set(posicion, nuevoValor);
            System.out.println("Elemento en la posición " + posicion + " ha sido actualizado a " + nuevoValor);
        } else {
            System.out.println("Posicion invalida");
        }
    }
}
