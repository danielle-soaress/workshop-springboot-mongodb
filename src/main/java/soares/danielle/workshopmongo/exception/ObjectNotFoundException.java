package soares.danielle.workshopmongo.exception;

public class ObjectNotFoundException extends RuntimeException{
	// a runtime exception é uma exceção especial que não precisa ser tratada;
	// isso vai ser útil pq existirá uma classe que se responsabilizará por tratar exceções
	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException(String msg) {
		super(msg);
	}
	
	
}
