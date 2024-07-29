package Es_3;

import Exceptions.BancaException;

public class ContoOnLine extends ContoCorrente {
    private final double maxPrelievo;

    public ContoOnLine(String titolare, double saldo, double maxPrelievo) {
        super(titolare, saldo);
        this.maxPrelievo = maxPrelievo;
    }

    public void stampaSaldo() {
        System.out.println("Titolare" + getTitolare() + "- Saldo: " + getSaldo() + "- Num movimenti:" + getnMovimenti() + "- Massimo movimenti: " + getMaxMovimenti() + "- massimo prelievo poissibile: " + maxPrelievo);
    }

    public void preleva(double x) throws BancaException {
        if (x <= maxPrelievo) {
            super.preleva(x);
        } else {
            throw new BancaException("Il prelievo non è disponibile!");
        }
    }

}
