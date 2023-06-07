package reto11;

import java.util.Scanner;

public class Menu{
	private String[] opciones;
	private int numOpciones;
	
	public Menu(String[] opciones) {
		this.opciones = opciones;
		this.numOpciones = opciones.length;
	}
	
	public int getNumOpciones() {
		return numOpciones;
	}
	
	public String toString() {
		String menu = "";
		
		for (int i = 0 ; i < this.numOpciones ; i++) {
			menu += i+1+".- "+opciones[i]+"\n";
		}
		
		return menu;
	}
	
	public void pausa() {
		Scanner sc = new Scanner(System.in);
		System.err.print("\nPulsa la tecla enter para continuar");
		sc.nextLine();
	}

}