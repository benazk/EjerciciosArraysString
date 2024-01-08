
public class Tres {

	public static void main(String[] args) {
		String cadenas[]= {"Sue", "Charlotte", "Anna", "Mike", "William" , "Ed"};
		int caps = 0;
		for(int i = 0; i < cadenas.length; i++) {//Bucle para recorrer cada posicion del array
			for (int j = 0; j < cadenas[i].length(); j++) {//Bucle para recorrer cada posicion del String
				if (cadenas[i].charAt(j) >= 'A' && cadenas[i].charAt(j) <= 'Z') {//Esto mira si la letra esta en el grupo de mayusculas
					caps++;
				}
			}
			System.out.println(cadenas[i] + " tiene " + caps + " mayusculas." ); //Imprime en pantalla el resultado por cada String
			caps = 0;//Reinicia el contador de mayusculas
		}

	}

}
