package br.edu.ifce.estruturadados;
 
public class FilaImpl implements Fila {
 
    public static final int TAM_FILA = 5;
    public Integer[] elementos;
    public int pos;
     
    public FilaImpl() {
        elementos = new Integer[TAM_FILA];
        pos = -1;
    }
     
    public boolean filaCheia() {
        if((elementos[elementos.length -1]) != null){
            System.out.println("Fila cheia!");
            return true;
        }
        return false;
    }
     
    public boolean filaVazia() {
        if(elementos[0] == null){
            System.out.println("Fila vazia!");
            return true;
        }
        return false;
    }
     
    public Integer getPrimeiro() {
        if(!filaVazia()){
            return elementos[0];
        }
        return null;
    }
     
    public Integer insereFinal(Integer elemento) {
        if (filaCheia()){
            return null;
        }
         
        elementos[++pos] = elemento;
         
        return elementos[pos];
    }
     
    public Integer removeInicio() {
        if(filaVazia()){
            return null;
        }
         
        int primeiroElemento = elementos[0];
         
        for(int i=0; i<pos; i++){
            elementos[i] = elementos[i+1];
        }
         
        elementos[pos]=null;
        --pos;
        return primeiroElemento;
    }
     
    public void imprimeFila() {
        if(filaVazia()){
            return;
        }
        for(int i=0; i < elementos.length; i++){
            if(elementos[i] == null) return;
            System.out.println("Elemento["+i+"]: " + elementos[i]);
        }
         
    }
     
}
