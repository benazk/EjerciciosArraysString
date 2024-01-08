
public class Nueve {

	public static void main(String[] args) {
		String cadenas[]= {"Sue", "Charlotte", "Anna", "Mike", "William" , "Ed"};
		int pos_max = 0;
		String cadena_larga = "";//Guarda el String mas largo
		for (int i = 0; i < cadenas.length; i++) {//Bucle para recorrer cada posicion del array
			if (cadenas[i].length() > cadena_larga.length()) {//Si la cadena en la posicion i es mayor a el String guardado, este es sustituido
				pos_max = i + 1;
				cadena_larga = cadenas[i];
			}
		}
		System.out.println("El nombre mas largo esta en la posicion " + pos_max);//Imprime en pantalla el resultado
	}

}
