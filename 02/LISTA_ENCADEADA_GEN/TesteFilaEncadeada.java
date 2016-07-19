package br.edu.ifce.estruturadados.filaencadeada;
 
public class TesteFilaEncadeada {
 
    public static void main(String[] args) {
         
        No no1 = new No(10, null);
        No no2 = new No(20, null);
        No no3 = new No(30, null);
        No no4 = new No(40, null);
         
        FilaEncadeada fila = new FilaEncadeada();
        fila.imprimirFila();
         
        fila.insereFinal(no1);
        fila.insereFinal(no2);
        fila.insereFinal(no3);
        fila.insereFinal(no4);
         
        fila.imprimirFila();
         
        No no5 = new No(50, null);
        fila.insereFinal(no5);
        fila.imprimirFila();
         
        No no6 = new No(70, null);
        fila.insereFinal(no6);
        fila.imprimirFila();
         
        No noRemovido = fila.removerInicio();
        System.out.println("No removido: " + noRemovido.getElemento());
         
        fila.imprimirFila();
         
        fila.removerInicio();
        fila.removerInicio();
        fila.removerInicio();
        fila.removerInicio();
         
        fila.imprimirFila();
         
        fila.removerInicio();
        fila.imprimirFila();
         
    }
     
}
