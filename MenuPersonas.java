package reto11;

public class MenuPersonas extends Menu{
	private String[] personas;
	final private String[] PERSONADEFECTO = {
			"Albert Rakoto Ratsimamanga es con diferencia el más renombrado científico de Madagascar.\nSe hizo famoso por su extenso trabajo sobre como entender mejor las propiedades curativas de la exclusiva flora endémica.\nSe le atribuyen unas 350 publicaciones científicas sobre temas que van desde la función de la glándula suprarrenal hasta remedios naturales para la diabetes.",
			"Gisèle Rabesahala fue una de las líderes de la lucha por la independencia de Madagascar.\nFue una periodista y activista política, creadora del periódico Imongo Vaovao.\nTambién fue la primera mujer malgache elegida en 1958 como representante del Ayuntamiento de Antananarivo, capital de Madagascar.\nCuando murió en 2011 Internet se inundó de tributos honrando su memoria.",
			"Jean-Luc Raharimanana es un escritor malgache.\nA los 20 años ya había ganado el Premio de Poesía Jean-Joseph Rabearivelo por sus primeros poemas.\nSus escritos fueron reconocidos por su retrato de la belleza de la naturaleza en su país natal, y también la pobreza y miseria, especialmente en los poblados de chabolas.\nEn su trabajo, las leyendas y viejas supersticiones se yuxtaponen con los eventos políticos contemporáneos.",
			"Erick Manana es un cantante y compositor descrito como el «Bob Dylan de Madagascar».\nSu carrera profesional como músico comenzó en 1982 como miembro de la banda Lolo sy ny Tariny.\nManana ha recibido varios premios y actuado en 2013 en la histórica Olympia en París para celebrar el 35 aniversario de su carrera.",
			"Jacques Rabemananjara fue un político, dramaturgo y poeta malgache.\nRabemananjara nació en la ciudad en Bahía de Antongil, en la costa este de Madagascar en 1913.\nRabemananjara fue reconocido como uno de los más importantes autores prolíficos del género Negritud, el movimiento literario e ideológico desarrollado por los intelectuales negros francófonos que rechazaban el colonialismo racista francés.\nSenghor, el famoso escritor senegalés convertido en presidente, es el creador del movimiento.\nFue sospechoso de estar involucrado en la fallida instigación del levantamiento malgache de 1947 contra el dominio colonial, a pesar de que había instado a los alborotadores a mantenerse calmados.\nFue arrestado y sentenciado a cadena perpetua con trabajos forzados.",
	};
	
	public MenuPersonas(String[] menu){
		super(menu);
		this.personas = PERSONADEFECTO;
	}
	
	public String getPersona(int num) {
		return this.personas[num];
	}

}
