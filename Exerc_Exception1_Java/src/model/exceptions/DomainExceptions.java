package model.exceptions;

//RuntimeException nn te obriga a tratar a exceção, ja o Exception sozinho te obriga a tratar
//no caso da classe DomainExceptions
public class DomainExceptions extends RuntimeException {

	//id default
	private static final long serialVersionUID = 1L;
	
	//Passa uma msn para a exceção personalizada 
	public DomainExceptions(String msg) {
		//repassando a msg para o constr da superclasse
		super(msg);
	}

}
