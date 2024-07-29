package Es_3;

import Exceptions.BancaException;

public class ContoCorrente {
    private final int maxMovimenti = 50;
    private String titolare;
    private int nMovimenti;
    private double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }

    public String getTitolare() {
        return titolare;
    }

    public int getnMovimenti() {
        return nMovimenti;
    }

    public int getMaxMovimenti() {
        return maxMovimenti;
    }

    public double getSaldo() {
        return saldo;
    }

    public void preleva(double x) throws BancaException {
        if (nMovimenti < maxMovimenti && saldo - x >= 0) {
            saldo = saldo - x;
            System.out.println("Saldo conto: " + saldo);

        } else if (saldo - x < 0) {
            throw new BancaException("Il conto è in ROSSO!");
        } else {
            saldo = saldo - x - 0.50;
            nMovimenti++;
            System.out.println("Saldo conto: " + saldo);
        }


    }
}
