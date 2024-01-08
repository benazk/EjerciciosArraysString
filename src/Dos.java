
public class Dos {
	static String ordenar(String cadena[], String first, int p) { //clase para ordenar el array
		
	
	for(int i = 0; i < cadena.length - 1; i++) { //Este bucle recorre las posiciones del array
		if(cadena[i].compareTo(first) < 0) { //Compara dos String, si una es mayor que la otra, la mayor se guardara en prim
			first = cadena[i];
			p = i + 1; //Posicion del String alfabeticamente primero
		}
	}
	return first;
	}
	public static void main(String[] args) {
		String cadenas[]= {"Sue", "Charlotte", "Anna", "Mike", "William" , "Ed"};
		int pos = 0;
		String prim = cadenas[0];
		System.out.println(ordenar(cadenas, prim, pos)); //Imprime en pantalla
		
	}

}
