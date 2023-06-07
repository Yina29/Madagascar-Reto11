package reto11;

public class MenuPersonas extends Menu{
	private String[] personas;
	final private String[] PERSONADEFECTO = {
			"Albert Rakoto Ratsimamanga es con diferencia el m�s renombrado cient�fico de Madagascar.\nSe hizo famoso por su extenso trabajo sobre como entender mejor las propiedades curativas de la exclusiva flora end�mica.\nSe le atribuyen unas 350 publicaciones cient�ficas sobre temas que van desde la funci�n de la gl�ndula suprarrenal hasta remedios naturales para la diabetes.",
			"Gis�le Rabesahala fue una de las l�deres de la lucha por la independencia de Madagascar.\nFue una periodista y activista pol�tica, creadora del peri�dico Imongo Vaovao.\nTambi�n fue la primera mujer malgache elegida en 1958 como representante del Ayuntamiento de Antananarivo, capital de Madagascar.\nCuando muri� en 2011 Internet se inund� de tributos honrando su memoria.",
			"Jean-Luc Raharimanana es un escritor malgache.\nA los 20 a�os ya hab�a ganado el Premio de Poes�a Jean-Joseph Rabearivelo por sus primeros poemas.\nSus escritos fueron reconocidos por su retrato de la belleza de la naturaleza en su pa�s natal, y tambi�n la pobreza y miseria, especialmente en los poblados de chabolas.\nEn su trabajo, las leyendas y viejas supersticiones se yuxtaponen con los eventos pol�ticos contempor�neos.",
			"Erick Manana es un cantante y compositor descrito como el �Bob Dylan de Madagascar�.\nSu carrera profesional como m�sico comenz� en 1982 como miembro de la banda Lolo sy ny Tariny.\nManana ha recibido varios premios y actuado en 2013 en la hist�rica Olympia en Par�s para celebrar el 35 aniversario de su carrera.",
			"Jacques Rabemananjara fue un pol�tico, dramaturgo y poeta malgache.\nRabemananjara naci� en la ciudad en Bah�a de Antongil, en la costa este de Madagascar en 1913.\nRabemananjara fue reconocido como uno de los m�s importantes autores prol�ficos del g�nero Negritud, el movimiento literario e ideol�gico desarrollado por los intelectuales negros franc�fonos que rechazaban el colonialismo racista franc�s.\nSenghor, el famoso escritor senegal�s convertido en presidente, es el creador del movimiento.\nFue sospechoso de estar involucrado en la fallida instigaci�n del levantamiento malgache de 1947 contra el dominio colonial, a pesar de que hab�a instado a los alborotadores a mantenerse calmados.\nFue arrestado y sentenciado a cadena perpetua con trabajos forzados.",
	};
	
	public MenuPersonas(String[] menu){
		super(menu);
		this.personas = PERSONADEFECTO;
	}
	
	public String getPersona(int num) {
		return this.personas[num];
	}

}
