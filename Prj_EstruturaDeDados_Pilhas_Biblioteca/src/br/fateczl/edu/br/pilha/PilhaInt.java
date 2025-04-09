package br.fateczl.edu.br.pilha;

public class PilhaInt {
    
    No topo;
    
    public PilhaInt(){
        
        topo = null;
    }
    
    public boolean isEmpty(){
        if(topo == null){
            
            return true;
        }
        else{
            
            return false;
        }
    }
    
    public void push(int valor){
        
        No elemento = new No();
        elemento.dado = valor;
        elemento.proximo = topo;
        topo = elemento;
    }
    
    public int pop() throws Exception{
        
        if(isEmpty()){
            
            throw new Exception("Pilha Vazia!");
        }
        
        int valor = topo.dado;
        topo = topo.proximo;
        
        return valor;
    }
    
    public int top() throws Exception{
        
        if(isEmpty()){
            
            throw new Exception("Pilha Vazia");
        }
        
        int valor = topo.dado;
        return valor;
    }
    
    public int size(){
        
        int cta = 0;
        
        if(!isEmpty()){
            
            No auxiliar = topo;
            cta = 1;
            
            while(auxiliar.proximo != null){
                
                cta++;
                auxiliar = auxiliar.proximo;
            }
        }
        
        return cta;
    }
}
