
public class Ocho {

	public static void main(String[] args) {
		String cadenas[]= {"Sue", "Charlotte", "Anna", "Mike", "William" , "Ed"};
		int empezar_a = 0;
		for (int i = 0; i < cadenas.length; i++) {//Bucle para recorrer cada posicion del array
			if (cadenas[i].startsWith("a") || cadenas[i].startsWith("A") ) {//Si empieza por a o A, le suma 1 a empezar_a
				empezar_a++;
			}
		}
		System.out.println("Hay " + empezar_a + " cadenas que empiezan por a/A");//Imprime en pantalla el resultado
	}

}
