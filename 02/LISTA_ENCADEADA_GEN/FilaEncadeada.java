package br.edu.ifce.estruturadados.filaencadeada;
 
public class FilaEncadeada {
 
 
    public No cabeca;
    public int tamanho;
 
 
    public FilaEncadeada() {
        cabeca = null;
        tamanho = 0;
 
 
    }
 
    //Adicionar no fim (Cauda)
 
    public void insereFinal(No novoNo){
 
        //localiza a cauda
        // o setProximo da cauda apontaria para o no a ser inserido
        // cauda.setProximo = novoNo
        //tamanho = tamanho + 1
         
        if(tamanho == 0){   
            cabeca = novoNo;
        } else {
            getCauda().setProximo(novoNo);
        }
 
        novoNo.setProximo(null);
        tamanho = tamanho + 1;
 
    }
 
 
    //Remover do Inicio (Cabeca)
    public No removerInicio(){
 
         
        if(tamanho == 0){
            return null;
        }
         
        // o No cabeca iria apontar para o segundo elemento
        // cabeca = cabeca.getProximo
        // setProximo do cabeca anterior iria apontar para null
        //tamanho = tamanho - 1
 
        No noRemovido = cabeca;
        cabeca = cabeca.getProximo();
 
        noRemovido.setProximo(null);
 
        tamanho = tamanho - 1;
 
        return noRemovido;
 
    }
 
    public No getCauda(){
 
        No no = cabeca;
         
        if(tamanho == 0){
            return cabeca;
        } 
        if(tamanho > 0){
            while(no.getProximo() != null){
                no = no.getProximo();
            }
             
        }
        return no;
    }
 
 
    public void imprimirFila(){
 
        if(tamanho == 0){
            System.out.println("Fila Vazia");
            return;
        }
 
        No aux = cabeca;
 
        while(aux.getProximo() != null){   // Navega do primeiro ao ultimo elemento
            System.out.print(aux.getElemento() + " --> ");
            aux = aux.getProximo();
        }
        System.out.println(aux.getElemento()); //imprime o ultimo elemento
 
    }
}
