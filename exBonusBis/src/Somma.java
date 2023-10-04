public class Somma {
    public static int somma(int x,int[] array){
        int somma = 0;
        for(int i = 0;i<array.length;i++){
            somma += array[i];
        }
        return somma;
    }
}
