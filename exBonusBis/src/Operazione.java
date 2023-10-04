public class Operazione {
    public static void qualeoperazione(int x,int[]y,char oper){
            switch (oper) {
                case '+':
                    int addizione = Somma.somma(x, y);
                    System.out.println(addizione);
                    break;
                case '-':
                    int sottrazione = Sottrazione.sottrazio(x, y);
                    System.out.println(sottrazione);
                    break;
                case '*':
                    int moltiplicazione = Moltiplicazione.multi(x, y);
                    System.out.println(moltiplicazione);
                    break;
                case '/':
                    Divisione.divi(x, y);
                    break;
                default:
                    System.out.println("Operazione errata!");
                    break;

            }

    }

}
