public class SelectionSort {
    public static void main(String[] args) {
        int[] lista ={55,63,21,56,78};
        for (int i=0; i<lista.length-1; i++){
            int indxValorMIn = i;
            for(int j=i; j< lista.length;j++){
                indxValorMIn = j;
            }
        }
        int valorMin = lista[indxValorMIn];
        lista[indxValorMIn] = lista[i];
        lista[i] = valorMin;
    }
    return lista;
}
