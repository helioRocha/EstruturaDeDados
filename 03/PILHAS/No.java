package br.edu.ifce.estruturadados.pilhadinamica;
 
public class No<E> {
     
    private E elemento;
    private No<E> proximo;
     
    public No(E elemento, No<E> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }
     
    public E getElemento() {
        return elemento;
    }
    public void setElemento(E elemento) {
        this.elemento = elemento;
    }
    public No<E> getProximo() {
        return proximo;
    }
    public void setProximo(No<E> proximo) {
        this.proximo = proximo;
    }
    
}
