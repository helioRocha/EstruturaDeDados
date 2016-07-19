package br.edu.ifce.estruturadados;
 
public class TesteFilaVetor {
 
    public static void main(String[] args) {
         
        Fila fila = new FilaImpl();
         
        fila.insereFinal(10);
        fila.insereFinal(20);
        fila.insereFinal(30);
        fila.insereFinal(40);
        fila.insereFinal(50);
         
        fila.imprimeFila();
         
        System.out.println("\n");
        fila.removeInicio();
        fila.imprimeFila();
         
    }
     
}
