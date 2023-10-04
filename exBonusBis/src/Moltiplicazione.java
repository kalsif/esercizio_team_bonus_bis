public class Moltiplicazione {
    public static int multi(int x,int[]array){
        int multi = array[0];
        for (int i = 1;i<array.length;i++){
            multi *= array[i];
        }
        return multi;

    }
}
