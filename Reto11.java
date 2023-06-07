package reto11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Reto11 {

	public static void main(String args[]) {
		int resp;
		String[] opcionesPrincipal = {"Informacion sobre el pais.","Curiosidades de Madagascar.","Gente famosa de Madagascar.",
				"Un divertido Quiz sobre Madagascar.","Salir."};

		Menu principal = new Menu(opcionesPrincipal);

		do {
			System.out.println("Bienvenido al menu de Madagascar");
			System.out.println("Que desea conocer sobre Madagascar:\n");
			System.out.println(principal.toString());

			do {
				resp = obtenerNumero();

				if(resp < 1 || resp > principal.getNumOpciones()) {
					System.out.println("\nIntroduce una opcion valida.\n");
				}

			}while (resp < 1 || resp > principal.getNumOpciones());

			switch (resp) {
			case 1:
				datosGenerales();
				break;
			case 2:
				curiosidades();
				break;
			case 3:
				personas();
				break;
			case 4:
				iniciarQuiz();
			}

		}while(resp != 5);
	}

	public static int obtenerNumero() {
		int num = 0;
		boolean error;
		Scanner sc = new Scanner(System.in);

		do {
			try {
				error = false;
				System.out.print("Introduce la opcion que desees: ");
				num = sc.nextInt();
			}catch(InputMismatchException e){
				sc.nextLine();
				error = true;
				System.err.println("Introduce un valor valido");
			}
		}while(error == true);

		return num;
	}

	public static void datosGenerales() {
		int resp;
		String[] opciones = {"Geografia", "Economia", "Religion", "Demografia", "Atras"};

		MenuDatosGenerales datosg = new MenuDatosGenerales(opciones);

		do {
			System.out.println("\n¡Elija qué quiere saber del país!");
			System.out.println(datosg.toString());

			do {
				resp = obtenerNumero();

				if(resp < 1 || resp > datosg.getNumOpciones()) {
					System.out.println("\nIntroduce una opcion valida.\n");
				}

			}while (resp < 1 || resp > datosg.getNumOpciones());

			if (resp != 5) {
				switch(resp) {
				case 1:
					System.out.println("\nVAMOS A VER LA GEOGRAFÍA DE MADAGASCAR!\n-------------------------------------------------------");
					System.out.println(datosg.getGeografia());
					break;

				case 2: 
					System.out.println("\nVAMOS A VER ECONOMÍA DE MADAGASCAR!\n------------------------------------------------------- ");
					System.out.println(datosg.getEconomia());
					break;

				case 3: 
					System.out.println("\nVAMOS A VER RELIGIÓN DE MADAGASCAR!\n-------------------------------------------------------");
					System.out.println(datosg.getReligion());
					break;

				case 4: 
					System.out.println("\nVAMOS A VER DEMOGRAFÍA DE MADAGASCAR!\n-------------------------------------------------------");
					System.out.println(datosg.getDemografia());
				}	
				datosg.pausa();
			}
		}while(resp != 5);
	}
	
	public static void curiosidades() {
		int resp;
		
		String [] opciones = {"Gastronomia", "Datos curiosos","Volver al menu principal"};
		MenuCuriosidades c = new MenuCuriosidades (opciones);

		do {
			System.out.println("\nEstas son algunas curiosidades de Madagascar:");
			System.out.println(c.toString());
			
			do {
				resp = obtenerNumero();
				
				if(resp < 1 || resp > c.getNumOpciones()) {
					System.out.println("\nIntroduce una opcion valida.\n");
				}
				
			}while (resp < 1 || resp > c.getNumOpciones());
			
			switch(resp) {
				case 1: 
					gastronomia(c);
					break;
				case 2:
					System.out.println("\nAlgunos datos curiosos\n");
					System.out.println(c.getCurioso());
			}
			
		}while(resp != 3);
	
	}
	
	public static void gastronomia(MenuCuriosidades c) {
		String[] menu = {"Comidas tipicas","Ingredientes tipicos","Estilo de cocina","Atras"};
		Menu gastro = new Menu(menu);
		int resp;
		
		do {
			System.out.println("\n"+gastro.toString());
			do {
				resp = obtenerNumero();
				
				if(resp < 1 || resp > gastro.getNumOpciones()) {
					System.out.println("\nIntroduce una opcion valida.\n");
				}
			}while (resp < 1 || resp > gastro.getNumOpciones());
			
			switch(resp) {
			case 1:
				System.out.println(c.getComidas());
				break;
			case 2:
				System.out.println(c.getIngredientes());
				break;
			case 3:
				System.out.println("\n"+c.getEstilo());
			}
		}while(resp != 4);
	}
	
	public static void personas() {
		int resp;
		String[] opciones = {"Albert Rakoto Ratsimamanga, el Científico Pionero","Gisèle Rabesahala, la Patriota",
				"Jean-Luc Raharimanana, el Guardián de la Memoria","Erick Manana, el Icono Cultural",
				"Jacques Rabemananjara, el Prisionero Político","Atras"};
		MenuPersonas perso = new MenuPersonas(opciones);

		do {
			System.out.println("\nEstas son algunas personas famosas de Madagascar:");
			System.out.println(perso.toString());

			do {
				resp = obtenerNumero();

				if(resp < 1 || resp > perso.getNumOpciones()) {
					System.out.println("\nIntroduce una opcion valida.\n");
				}

			}while (resp < 1 || resp > perso.getNumOpciones());

			if (resp != 6) {
				System.out.println(perso.getPersona(resp-1));
				perso.pausa();
			}
		}while(resp != 6);
	}
	
	public static void iniciarQuiz() {
        int respUsu;
        boolean r;
        Quiz q1 = new Quiz();

        for (int i = 0; i < q1.getPreguntas().length; i++) {
            printPregunta(i,q1);
            printRespuestas(i,q1);
            respUsu = obtenerRespUsuario(q1,i);
            r = validarRespuesta (q1, i, respUsu);
            q1.setPuntuacion(i, r);
        }
        mostrarPuntuacionFinal(q1.getPuntuacion());
    }

    public static void printPregunta(int num, Quiz q1) {
        System.out.println(q1.getPreguntas()[num]);
    }

    public static void printRespuestas(int num, Quiz q1) {
        for (int i = 0; i < q1.getRespuestas()[num].length; i++) {
            System.out.println((i + 1) + ".- " + q1.getRespuestas()[num][i]);
        }
    }
    
    public static int obtenerRespUsuario(Quiz q1, int num) {
        final int CANTRESP = q1.getRespuestas()[num].length;
        int opcion;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("\nIngrese su respuesta: ");
            opcion = scanner.nextInt();
            if (opcion < 1 || opcion > CANTRESP) {
                System.err.println("\nEl número debe estar entre 1 y " + CANTRESP + ".");
            }
        } while (opcion < 1 || opcion > CANTRESP);

        return opcion;
    }
    
    public static boolean validarRespuesta(Quiz q1, int num, int respuestaUsuario) {
        boolean valida = q1.getRespCorrecta(num) == respuestaUsuario;
        if (valida) {
            System.out.println("\n¡RESPUESTA CORRECTA!\n");
        } else {
            System.err.println("\nIncorrecto. La respuesta correcta es: " + q1.getRespuestas()[num][q1.getRespCorrecta(num) - 1]+"\n");
        }
        return valida;
    }

    public static void mostrarPuntuacionFinal(boolean[] puntuacion) {
		int puntos = 0;

		for (int i = 0 ; i < puntuacion.length ; i++) {
			if(puntuacion[i]) {
				puntos++;
			}
		}

		System.out.println("Tu puntuación final es " + puntos+"\n");
	}

}