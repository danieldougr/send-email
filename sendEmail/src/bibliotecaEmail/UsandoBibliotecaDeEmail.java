package bibliotecaEmail;

import org.apache.commons.mail.EmailException;

public class UsandoBibliotecaDeEmail {

	public static void main(String[] args) throws EmailException {
		Carteiro.enviar("danieldouglas20112011@gmail.com", "Assunto", "Xaina");

	}

}
