
package PilhaExpressao;

public class Pilha {
    
    // atributos
    private Object [] dados;
    private int topo;
    
    // Construtor - Cria uma pilha vazia com capacidade escolhida
    public Pilha (int capacidade) {
        dados = new Object[capacidade];
        topo = -1;
    }
    
    // métodos
    public boolean isFull () {
        return (topo == dados.length - 1);
    }
    
    public boolean isEmpty () {
        return (topo == -1);
    }
    
    public void push (Object x) {
        if(!isFull()) {
            topo++;
            dados[topo] = x;
        }
    }
    
    public Object pop () {
        if (!isEmpty()) {
            Object x = dados[topo];
            topo--;
            return x;
        } else {
            return null;
        }
    }
    
    public Object topo () {
        if(!isEmpty()) {
            return dados[topo];
        } else {
            return null;
        }
    }
}
