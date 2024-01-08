
public class Diez {
		static boolean repetidas(String cad[], boolean rep) {//Funcion para recorrer toda la array mirando si hay String repetidas
			for (int i = 0; i < cad.length; i++) {//Bucle para recorrer cada posicion del array
				for (int j = 0; j < cad.length; j++) {//Bucle para recorrer cada posicion del array 
					if (cad[i] == cad[j] && i != j) { //Si la cadena en posicion j es igual a la de la posicion i, repetidas sera true
						rep = true;
					}
				}
			}
			return rep; //devuelve el boolean de repetidos
		}
	public static void main(String[] args) {
		String cadenas[]= {"Sue", "Charlotte", "Anna", "Anna", "William" , "Ed"};
		boolean repetidas = false; //
		
		if (repetidas(cadenas, repetidas) == true) {//Imprime el resultado en pantalla si repetidas es true
			System.out.println("Si hay cadenas repetidas");
		}
		else {//Si no, imprime esto
			System.out.println("No hay cadenas repetidas");
		}
		
	}

}
