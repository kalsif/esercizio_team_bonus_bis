public class Sottrazione {
   public static int sottrazio(int x, int[]array) {
       int meno = array[0];
       for (int i = 1; i < array.length; i++) {
           meno -= array[i];

       }
       return meno;
   }
}
