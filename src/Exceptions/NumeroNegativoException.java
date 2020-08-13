package Exceptions;

public class NumeroNegativoException extends RuntimeException{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private double valor;
    
    public NumeroNegativoException() {
        super();
    }

 

    public NumeroNegativoException(double valor) {
        super();
        this.valor = valor;
    }

 

    public NumeroNegativoException(String message, Throwable cause) {
        super(message, cause);
    }

 

    public NumeroNegativoException (Throwable cause) {
        super(cause);
    }

 

    @Override
    public String toString() {
        return "Você digitou " + valor + ". Informe um valor positivo";
    }

 

}