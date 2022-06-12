package console;

import java.util.Scanner;

public class Interacao {

	Scanner receba = new Scanner(System.in);
	
	public Integer lerNumero(String texto) {
		System.out.print(texto);
		return receba.nextInt();
	}
	
	public Double lerDecimal(String texto) {
		System.out.print(texto);
		return receba.nextDouble();
	}
	
	public String lerLinha(String texo) {
		return receba.nextLine();
	}
	
	public void fecharScanner() {
		receba.close();
	}
	
	public void print(String texto) {
		System.out.print(texto);
	}
	
	public void println(String texto) {
		System.out.println(texto);
	}
	
	public void imprimirErro(String texto) {
		System.err.println(texto);
	}
}
