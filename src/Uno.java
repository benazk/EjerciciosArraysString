
public class Uno {

	public static void main(String[] args) {
		String cadenas[]= {"Sue", "Charlotte", "Anna", "Mike", "William" , "Ed"};
		int enteros[] = new int[cadenas.length];
		
		for(int i = 0; i < cadenas.length; i++) { //este bucle recorre enteros[], llenandola con en numero de la longitud del string de la misma posicion.
			enteros[i] = cadenas[i].length();
		}
		for (int i = 0; i < cadenas.length; i++) {//Saca en pantalla la tabla de nombres
			System.out.print(cadenas[i] + " ");
			
		}
		System.out.println("");
		for (int i = 0; i < cadenas.length; i++) { //Saca en pantalla la tabla de numeros
		System.out.print(enteros[i] + " ");
	}
	}

}
