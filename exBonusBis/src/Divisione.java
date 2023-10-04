public class Divisione {
    public static void divi(int x,int[]array) {
        int resto = array[0];
        int divis = array[0];
        for (int i = 1; i < array.length; i++) {
            divis /= array[i];

        }
        System.out.println(divis);
        System.out.println(resto%divis);
    }
}
