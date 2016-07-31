package br.edu.ifce.estruturadados.pilhadinamica;
 
public class TestePilhaDinamica {
 
    public static void main(String[] args) {
         
        PilhaImpl<Float> pilha = new PilhaImpl<Float>();
         
        pilha.insereTopo(5.0f);
        pilha.insereTopo(6.0f);
        pilha.insereTopo(7.0f);
        pilha.insereTopo(8.0f);
         
        pilha.imprimePilha();
         
        System.out.println("Removendo do topo");
        pilha.removeTopo();
        pilha.imprimePilha();
         
        System.out.println("Inserindo no topo");
        pilha.insereTopo(9.0f);
        pilha.imprimePilha();
         
    }
     
}
