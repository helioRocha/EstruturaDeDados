package br.edu.ifce.estruturadados.pilhadinamica;
 
public class PilhaImpl<E> implements Pilha<E> {
     
    private No<E> topo;       //ultimo elemento inserido (TOPO)   
    private int tamanho;     //quantidade elementos pilha
     
    public PilhaImpl() {
        topo = null;
        tamanho = 0;
    }
     
    public No<E> insereTopo(E elemento) {
         
        No<E> novoNo = new No<E>(elemento, topo);
         
        topo = novoNo;
        tamanho++;
         
        return novoNo;
    }
 
    @Override
    public No<E> removeTopo() {
         
        if(pilhaVazia()){
            System.out.println("Pilha Vazia. Não há elementos para remover");
            return null;
        }
         
        No<E> noRemovido = topo;
         
        topo = topo.getProximo();
         
        noRemovido.setProximo(null);
        tamanho--;
         
        return noRemovido;
    }
     
    public void imprimePilha(){
         
        if(pilhaVazia()){
            System.out.println("Pilha Vazia. Não há elementos para imprimir!");
            return;
        }
         
        No<E> temp = topo;
         
        System.out.println("------------- PILHA ATUAL -----------");
        for(int i = 0; i < tamanho; i++){
            System.out.print(" -> " + temp.getElemento() + "\t");
            temp = temp.getProximo();
        }
         
        System.out.println();
    }
 
    @Override
    public No<E> getTopo() {
        return topo;
    }
 
    @Override
    public boolean pilhaVazia() {
        if(topo == null){
            return true;
        }
        return false;
    }
 
    @Override
    public int tamanho() {
        return tamanho;
    }
     
}
