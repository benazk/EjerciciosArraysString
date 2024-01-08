
public class Siete {

	public static void main(String[] args) {
		String cadenas[]= {"Sue", "zarlotte", "zarina", "Mike", "William" , "Ed"};
		String sub_string = "zar";
		int contiene = 0;
		for (int i = 0; i < cadenas.length; i++) {//Bucle para recorrer cada posicion del array
			if (cadenas[i].indexOf(sub_string) >= 0) {//Si el indice de "zar" es > 0, suma 1 a contiene()
				contiene++;
			}
		}
		System.out.println("Hay " + contiene + " cadenas que tienen la subcadena 'zar'.");//Imprime en pantalla el resultado
	}

}
