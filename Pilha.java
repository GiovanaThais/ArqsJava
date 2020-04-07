/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PilhaExpressao;
/**
Uma expressão matemática pode usar vários pares de parênteses agrupados. Ex.: ((A + B) * (C - D)). Sendo
assim, os pares de parênteses devem ser agrupados corretamente. Criar um programa para verificar se uma
expressão matemática tem os parênteses agrupados de forma correta, isto é, (1) se o número de parênteses à
esquerda e à direita são iguais e, (2) se todo parêntese aberto é seguido posteriormente por um fechamento
de parêntese. O programa deve ler uma expressão matemática e apresentar a mensagem “Bem Formada!” se
os parênteses da expressão estiverem agrupados corretamente; caso contrário, apresentar a mensagem “Mal
Formada!”.
• Exemplo 1: As expressões ((A + B) ou A + B( violam a condição 1
• Exemplo 2: As expressões )A + B( - C ou (A + B)) - (C + D violam a condição 2
Ideia de um Algoritmo usando Pilha
• Se ler um abre parêntese, empilha
• Se ler um fecha parêntese, desempilha. Se a pilha estiver vazia, a expressão é mal formada.
• Se chegar até o fim com a pilha vazia, a expressão é bem formada; caso contrário, é mal formada.
*/


/**
 *
 * @author tiago
 */

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