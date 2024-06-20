package arbolesbinarios;
public class ArbolBinario {
    NodoArbolBinario hoja;
    
    public ArbolBinario(){
        hoja = null;
        }

    public NodoArbolBinario getHoja() {
        return hoja;
        }

    public void setHoja(NodoArbolBinario hoja) {
        this.hoja = hoja;
        }
     
    public void Arbolestatico(){
        NodoArbolBinario raiz = new NodoArbolBinario(1);
        raiz.setIzquierda(new NodoArbolBinario(2));
        raiz.setDerecha(new NodoArbolBinario(3));
        raiz.getIzquierda().setIzquierda(new NodoArbolBinario(4));
        raiz.getIzquierda().setDerecha(new NodoArbolBinario(5));
        raiz.getDerecha().setIzquierda(new NodoArbolBinario(6));
        raiz.getDerecha().setDerecha(new NodoArbolBinario(7));
        RecorreInOrden(raiz);
        System.out.println("");
        RecorrePreOrden(raiz);
      
        }

    public void RecorreInOrden(NodoArbolBinario hoja){
        if (hoja != null){
            RecorreInOrden(hoja.getIzquierda());
            System.out.print(hoja.getDato() + " ");
            RecorreInOrden(hoja.getDerecha());            
            }
        }

    public void RecorrePreOrden(NodoArbolBinario hoja){
        if (hoja != null){
            System.out.print(hoja.getDato() + " ");
            RecorrePreOrden(hoja.getIzquierda());
            RecorrePreOrden(hoja.getDerecha());            
            }
        }

  
    
    }
