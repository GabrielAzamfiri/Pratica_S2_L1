import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int[] numeri = new int[5];
        for (int i = 0; i < numeri.length; i++) {
            try {
                System.out.println("Inserisci un numero da 1 a 10");
                int numUtente = Integer.parseInt(scanner.nextLine());
                if (numUtente < 1 || numUtente > 10) {
                    System.err.println("Il numero non è compreso tra 1 e 10. Riprova");
                    i--;
                } else {
                    numeri[i] = numUtente;
                    System.out.println(Arrays.toString(numeri));

                }
                if (numUtente == 0) break;
                if (i == 4) i = -1;
            } catch (Exception e) {
                System.err.println(e.getMessage());
                System.err.println("Il valore non è compreso tra 1 e 10. Riprova");
                i--;
            }


        }


    }
}