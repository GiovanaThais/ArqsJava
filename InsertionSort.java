import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] vetor = {8,2,4,9,3,6}; //vetor desordenado
        insertionSort(vetor);
        System.out.println(Arrays.toString(vetor));

    }
    private static void insertionSort(int[] vetor){
        int x, j;
        for(int i=1; i<vetor.length; i++){ //laço externo começando da posição 1 do vetor 
            j = i-1;//decremento do maior elemento do vetor
            x = vetor[i]; //vetor atual = x
            while((j>=0) && x<vetor[j]){ //comparar so ate 0 ,e enquanto o atual for menor que o vetor j
                vetor[j+1] = vetor[j]; //valor copiado 
                j--;//buscar novos elementos
            }
            vetor[j+1] = x; //posição encontrada entao o vetor novo recebe atual
        }
    }
}
