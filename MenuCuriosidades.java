package reto11;

public class MenuCuriosidades extends Menu {

	private String[] comida;
	private String[] ingredientes;
	private String estilo;
	private String[] curioso;
	final private String[] COMIDADEFECTO = {
			"Lasopy: \nLos protagonistas de este plato son las verduras y los huesos de ternera.\nGeneralmente, se usan hortalizas como zanahorias, nabos y puerros. \nAdemás del sabor de estas verduras, sientes la del tomate y las habichuelas cocinadas con pimienta negra. \nAunque no están siempre presentes, las patatas pueden encontrarse en esta sopa. \nLos malgaches preparan las verduras y los huesos por separado, así los sabores no se pierden.\n",
			"Ravitoto: \nSe trata de un guisado de cerdo con hojas de mandioca (conocido también como yuca o casabe) que se sirve con arroz y, en algunos casos, salsa de tomate especiada. \nEl sabor de la carne es el que más está presente, quizás por ser sazonado y salteado aparte de las verduras.\n", 
			"Romazava: \nEste plato no es solo típico, sino también originario de Madagascar: el romazava. Si te decides a probarlo prepárate para una explosión de picante en tu boca. \nEl romazava se hace con brèdes mafana unas flores típicas de Madagascar que son muy, muy picantes. \nTe aseguramos que el sabor de los botones amarillos de esta planta no los podrás probar sino en la isla, y si te gusta el fuego en la comida, seguramente no te arrepientas. \nAdemás del picante, te encontrarás con carne de res sazonada con jengibre y chile tipo tailandés; esta carne es cocinada con tomate y en ocasiones también con acelga. \nEste plato se acompaña tradicionalmente con arroz y la tradicional salsa rougail (tomate, limón y jengibre).\n",
			"Hen’omby ritra: \nSe trata de carne de res en cubos cocinadas comúnmente, pero sazonadas de una manera malgache. \nLos trozos de carne suelen ser algo grandes, pues así se previene la pérdida de jugo y sabor. \nLos trozos son primero sazonados con sal y salteados hasta que se tornan marrones. \nLuego pasan a ser cocinados con poca agua hasta que esta se evapora por completo. \nEs aqui cuando se le añade el ajo y el jengibre, y no antes, pues estos sabores se perderían y la idea es que la carne tenga un fuerte sabor a estos dos sazonadores"
	};
	final private String[] INGREDEFECTO = {
			"Arroz: \nEl arroz, también conocido vary en malgache, es la piedra angular de la dieta malgache y normalmente se consume en todas las comidas. \nEl arroz se prepara con cantidades variables de agua para producir un arroz seco mullido, que se come con algún tipo de acompañamiento en salsa. \nambién se hace una papilla de arroz espesa llamada vary sosoa que normalmente se come para el desayuno o se prepara para los enfermos.\n",
			"Laoka: \nLaoka es el nombre que se le da al acompañamiento que se sirve con el arroz. \nLos laoka se sirven frecuentemente con algún tipo de salsa. \nEn las tierras altas, la salsa generalmente está compuesta de tomate, mientras que en las zonas costeras a menudo se agrega leche de coco durante la cocción.\n",
			"Carne de cebu: \nLa carne de cebú se caracteriza por tener un sabor intenso y un poco más fuerte que la carne de otras razas de vacas, debido a la mayor cantidad de fibras musculares que contiene. \nAdemás, su carne es magra y tiene menos grasa que la de otros tipos de ganado vacuno."
	};
	final private String ESTILODEFECTO = "Estilo cocina: \nEl estilo de cocina utilizado en madagascar es el contemporaneo. \nLa Cocina contemporánea es la que mantiene una constante búsqueda de innovación y creatividad a base de colores, formas y sabores, buscando obtener un producto \nde muy alta calidad y desarrollar nuevas presentaciones y tendencias en los platos; para de esta manera provocar una satisfacción cada vez más exquisita al comensal.";
	final private String[] CURIOSODEFECTO = {
			"Con 587.000 kilómetros cuadrados es la 4ª isla más grande del mundo, por detrás de Groenlandia, Nueva Guinea y Borneo.",
			"En Madagascar habitan el 58% de las especies de animales y plantas del mundo, de los cuales más del 80% son endémicas de Madagascar.",
			"En Madagascar habitan el 58% de las especies de animales y plantas del mundo, de los cuales más del 80% son endémicas de Madagascar.",
			"Madagascar es uno de los países más pobres del mundo. El sueldo diario de un trabajador malgache ronda 1 USD por día.",
			"Por el color predominante de su suelo se le conoce como La Gran Isla Roja.",
			"En Madagascar coexisten 18 tribus diferentes, cada uno con culturas y costumbres diferentes.",
			"La montaña más alta es Maromokotro con 2.876 metros.",
			"100 son las especies de primates lémures que se pueden encontrar en Madagascar.",
			"Hay 3.000 especies de mariposas endémicas de Madagascar.",
			"Las mujeres malgaches se pintan las caras de forma llamativa con corteza triturada de árboles no solo para estar más atractivas, también para protegerse del sol y de los insectos."
	};

	public MenuCuriosidades (String[] opciones) {
		super(opciones);
		this.comida = COMIDADEFECTO;
		this.ingredientes = INGREDEFECTO;
		this.estilo = ESTILODEFECTO;
		this.curioso = CURIOSODEFECTO;
	}
	
	public String getComidas() {
		String menu = "";
		
		for (int i = 0 ; i < this.comida.length ; i++) {
			menu += i+1+".- "+comida[i]+"\n";
		}
		
		return menu;
	}
	
	public String getIngredientes() {
		String menu = "";
		
		for (int i = 0 ; i < this.ingredientes.length ; i++) {
			menu += i+1+".- "+ingredientes[i]+"\n";
		}
		
		return menu;
	}
	
	public String getEstilo() {
		return estilo;
	}
	
	public String getCurioso() {
		String menu = "";
		
		for (int i = 0 ; i < this.curioso.length ; i++) {
			menu += i+1+".- "+curioso[i]+"\n";
		}
		
		return menu;
	}

}