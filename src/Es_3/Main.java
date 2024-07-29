package Es_3;

import Exceptions.BancaException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws BancaException {
        Scanner scanner = new Scanner(System.in);

        ContoCorrente myConto = new ContoCorrente("Diego", 5000);
        // myConto.preleva(5500);

        ContoOnLine myOnline = new ContoOnLine("Diego", 5000, 5000);
        myOnline.preleva(5500);

    }
}
