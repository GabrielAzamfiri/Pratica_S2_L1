package Es_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kilometri;
        int litri;
        try {
            System.out.println("Inserisci il numero di KM:");
            kilometri = Integer.parseInt(scanner.nextLine());

            System.out.println("Inserisci il numero di litri consumati:");
            litri = Integer.parseInt(scanner.nextLine());


            System.out.println("kilometri/litri: " + (kilometri / litri));
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
            System.err.println("Inserire un valore numerico e non una stringa");


        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
            System.err.println("Non si può dividere per zero");

        } finally {
            scanner.close();
        }
    }

}
