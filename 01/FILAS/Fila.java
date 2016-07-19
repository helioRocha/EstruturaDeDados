package br.edu.ifce.estruturadados;
 
public interface Fila {
 
    /** Métodos principais*/
    public abstract Integer insereFinal(Integer elemento);
    public abstract Integer removeInicio();
     
    /**Métodos Auxiliares*/
    public abstract boolean filaCheia();
    public abstract boolean filaVazia();
     
    public abstract Integer getPrimeiro();
     
    public void imprimeFila();
}
