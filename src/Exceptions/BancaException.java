package Exceptions;

public class BancaException extends Exception {
    // Se estendo RuntimeException sto creando un'eccezione di tipo UNCHECKED
    // Se estendo RuntimeException sto creando un'eccezione di tipo CHECKED
    public BancaException(String string) {
        super(string);
    }
}

