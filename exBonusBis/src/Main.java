import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
             Scanner in = new Scanner(System.in);
             array(in);
    }
    public static void array(Scanner in){
        int dimension = getArrayLength(in);
        int [] array2 = new int[dimension];
        System.out.println("inserisci elementi : ");
        riempimento(dimension,array2,in);
    }

    public static int getArrayLength(Scanner in){
        System.out.println("inserisci lunghezza : ");
        int dimension;
        dimension = in.nextInt();
        return dimension;
    }
    public static void riempimento(int dimension, int [] array2, Scanner in){
        for (int i = 0;i<dimension;i++){
            array2[i] = in.nextInt();

        }
        System.out.println("Valore array = " + Arrays.toString(array2));

        boolean valorebuono = false;
        while (!valorebuono) {
            int sommaArray = 0;
            System.out.println("Scrivi operazione da usare : ");
            char operazione = in.next().charAt(0);

            Operazione.qualeoperazione(sommaArray, array2, operazione);

            if (operazione == '+' || operazione == '-' || operazione == '*' || operazione == '/'){
                valorebuono = true;
            }
        }
    }



}