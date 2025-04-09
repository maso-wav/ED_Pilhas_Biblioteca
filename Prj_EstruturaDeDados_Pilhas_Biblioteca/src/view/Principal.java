package view;

import br.fateczl.edu.br.pilha.PilhaInt;

public class Principal {
    
    public static void main(String args[]){
        
        PilhaInt pilha = new PilhaInt();
        
        pilha.push(1);
        pilha.push(2);
        pilha.push(10);
        
        try{
            
            int valor = pilha.pop();
            System.out.println(valor);
            
            int topo = pilha.top();
            System.out.println("Topo = " + topo);
            
            pilha.push(5);
            pilha.push(8);
            
            int tamanho = pilha.size();
            System.out.println("Size = " + tamanho);
            
            valor = pilha.pop();
            System.out.println(valor);
            
            valor = pilha.pop();
            System.out.println(valor);            
            
            topo = pilha.top();
            System.out.println("Topo = " + topo);
            
            tamanho = pilha.size();
            System.out.println("Size = " + tamanho);
            
        }
        catch(Exception e){
            
            e.printStackTrace();
        }
    }
    
}
