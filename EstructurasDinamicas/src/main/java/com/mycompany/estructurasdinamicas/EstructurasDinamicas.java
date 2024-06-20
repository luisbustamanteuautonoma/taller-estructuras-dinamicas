package com.mycompany.estructurasdinamicas;

import listasenlacesimple.ListaEnlaceSimple;
import listaenlacedoble.ListaEnlaceDoble;
import colas.ImplementaCola;
import pilas.ImplementaPila;
import arbolesbinarios.ArbolBinario;

public class EstructurasDinamicas {

    /**
     * * editado por luis bustamante, benjamin miranda**
     */
    public static void main(String[] args) {
        ListaEnlaceSimple lista_simple = new ListaEnlaceSimple();
        //llamadas a las funciones listas simples

        lista_simple.InsertaInicio(3);
        lista_simple.InsertaInicio(8);
        lista_simple.InsertaInicio(7);
        lista_simple.InsertaFin(150);
        lista_simple.InsertaInicio(-7);
        lista_simple.InsertaFin(-150);
        lista_simple.insertaPosicion(8000, 2);
        System.out.println("Lista enlazada:");
        lista_simple.imprimirLista();
        lista_simple.EliminaElemento(2);
        System.out.println("Después de eliminar el elemento en la posición 2:");
        lista_simple.imprimirLista();
        lista_simple.EditaElemento(1, 99);
        System.out.println("Después de editar el elemento en la posición 1:");
        lista_simple.imprimirLista();

        //fin llamadas a las funciones listas simples
        ListaEnlaceDoble lista_doble = new ListaEnlaceDoble();
        //llamadas a las funciones listas docbles

        lista_doble.InsertaInicio(1);
        lista_doble.InsertaInicio(2);
        lista_doble.InsertaInicio(3);
        lista_doble.InsertaInicio(4);
        lista_doble.InsertaFin(-50);
        lista_doble.InsertaFin(-500);
        lista_doble.imprimirListaInicioFin();
        lista_doble.insertaPosicion(800, 0);
        lista_doble.insertaPosicion(900, 3);
        lista_doble.insertaPosicion(1900, 6);
        lista_doble.imprimirListaInicioFin();
        System.out.println(lista_doble.CuentaElementos());
        lista_doble.EliminaElemento(0);
        lista_doble.EliminaElemento(3);
        lista_doble.imprimirListaInicioFin();
        System.out.println("Después de eliminar elementos:");
        lista_doble.imprimirListaInicioFin();
        lista_doble.EditaElemento(1, 99);
        lista_doble.EditaElemento(2, 199);
        System.out.println("Después de editar elementos:");
        lista_doble.imprimirListaInicioFin();
        
        System.out.println(lista_doble.CuentaElementos());

        //fin llamadas a las funciones listas docbles
        ImplementaPila p = new ImplementaPila();
        //llamadas a las funciones colas

        p.AgregaElemento(15);
        p.AgregaElemento(18);
        p.AgregaElemento(20);
        p.MuestraPila();
        p.MuestraElementoArriba();

        //fin llamadas a las funciones pilas        
        ImplementaCola c = new ImplementaCola();
        //llamadas a las funciones pilas

        c.AgregaElemento(15);
        c.AgregaElemento(18);
        c.AgregaElemento(20);
        c.MuestraCola();
        c.MuestraPrimerElemento();

        //fin llamadas a las funciones pilas        
        ArbolBinario ab = new ArbolBinario();
        ab.Arbolestatico();

    }
}
