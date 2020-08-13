package Exceptions;

public class TratamentoDeErros extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public TratamentoDeErros() {
	        super();
	    }

	    public TratamentoDeErros(String message) {
	        super(message);
	    }

	    public TratamentoDeErros(String message, Throwable cause) {
	        super(message, cause);
	    }

	    public TratamentoDeErros(Throwable cause) {
	        super(cause);
	    }

}
