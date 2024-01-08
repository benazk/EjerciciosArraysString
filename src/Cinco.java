
public class Cinco {

	public static void main(String[] args) {
		String cadenas[]= {"Sue", "Charlotte", "Anna", "Mike", "William" , "Ed"};
		
		for(int i = 0; i < cadenas.length; i++) {//Bucle para recorrer cada posicion del array 
			System.out.print(cadenas[i].toUpperCase() + " | "); //Convierte cada String en mayusculas
		}

	}

}
