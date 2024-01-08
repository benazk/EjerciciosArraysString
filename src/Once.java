
public class Once {

	public static void main(String[] args) {
		String cadenas[]= {"Sue", "Charlotte", "Anna", "Mike", "Willem" , "Ed"};
		int cant_voc = 0;
		int winner = 0;
		String ganador = "";
		for (int i = 0; i < cadenas.length; i++) {//Bucle para recorrer cada posicion del array
			for (int j = 0; j < cadenas[i].length(); j++) {//Bucle para recorrer cada posicion del string
				if (cadenas[i].charAt(j) == 'A' || //Si hay alguna vocal (mayuscula o minuscula), le suma 1 al contador de vocales
					cadenas[i].charAt(j) == 'E' ||
					cadenas[i].charAt(j) == 'I' ||
					cadenas[i].charAt(j) == 'O' ||
					cadenas[i].charAt(j) == 'U' ||
					cadenas[i].charAt(j) == 'a' ||
					cadenas[i].charAt(j) == 'e' ||
					cadenas[i].charAt(j) == 'i' ||
					cadenas[i].charAt(j) == 'o' ||
					cadenas[i].charAt(j) == 'u') {
					
					cant_voc++;
				}
			}
			if (cant_voc > winner ) {//Si el ultimo string le gana al anterior en cantidad de mayusculas, el ganador se sustituiria
				winner = cant_voc;
				ganador = cadenas[i];//Aqui se guarda el nombre del ganador
			}
			cant_voc = 0;
		}
		System.out.println("El nombre con mas vocales es " + ganador + ", con " + winner + " vocales");
	}

}
