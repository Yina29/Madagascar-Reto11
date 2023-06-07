package reto11;

public class Quiz {
	private String[] preguntas;
	private String[][] respuestas;
	private int[] respuestasCorrectas;
	private boolean[] puntuacion = new boolean[5];

	final private int[] RESPBIEN = {1, 1, 1, 1, 1};

	final private String[] PREGDEF = {
			"A.- ¿Idioma oficial de Madagascar?\n",
			"B.- Cual es la capital de Madagascar?\n",
			"C.- ¿Cuantas regiones hay en Madagascar?\n",
			"D.- ¿Cuál es la fecha de la independencia de Madagascar?\n",
			"E.- ¿Cuánto fue el PIB Per Capita de Madagascar en el año 2022?"
	};

	final private String[][] RESPDEF = {
			{"Malgache y Frances", "Frances", "Malgache", "Ingles"},
			{"Antananarivo", "Toamasina", "Mahajanga", "Toliary"},
			{"22", "6", "18", "12"},
			{"26 de junio", "16 de junio", "15 de junio", "25 de junio"},
			{"165.406M euros", "14.466M euros", "245 rupias", "4.010M euros"}
	};

	public Quiz() {
		this.preguntas = PREGDEF;
		this.respuestas = RESPDEF;
		this.respuestasCorrectas = RESPBIEN;
	}

	public void setPuntuacion(int num, boolean bien) {
		this.puntuacion[num] = bien;
	}

	public boolean [] getPuntuacion() {
		return puntuacion;
	}

	public String[][] getRespuestas() {
		return respuestas;
	}

	public String[] getPreguntas() {
		return preguntas;
	}

	public int getRespCorrecta(int num) {
		return this.respuestasCorrectas[num];
	}
}