package br.edu.ifce.estruturadados.pilhadinamica;
 
public interface Pilha<E> {
 
    /** Metodos Principais */
     
    public abstract No<E> insereTopo(E elemento);
    public abstract No<E> removeTopo();
     
    /** Metodos Auxiliares */
     
    public abstract No<E> getTopo();
    public abstract boolean pilhaVazia();
    public abstract int tamanho();
    
}
