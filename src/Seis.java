
public class Seis {
	static int palindromos (String cad[], int esp, int pal) { //funcion para hacer conteo de palíndromos
		for (int i = 0; i < cad.length; i++) {//Bucle para recorrer cada posicion del array
			int mitad = (int) Math.floor(cad[i].length() / 2);
			for (int j = 0; j < mitad; j++) {
				if(cad[i].charAt(j) == cad[i].charAt(cad[i].length() - j - 1)) {//Si la posicion espejo tiene el mismo char, suma 1 a espejo
						esp++;
				}
			}
			if (esp > 0) {//Si espejo es mayor a 0, suma 1 a palindromo
				pal++;
			}
			esp = 0; //Reinicia la variable
		}
		return pal;
	}
	public static void main(String[] args) {
		String cadenas[]= {"susan", "carrac", "anna", "michael", "william" , "ded"};
		int espejo = 0; 
		int palindromo = 0;
		
		
		System.out.println("Hay " + palindromos(cadenas, espejo, palindromo) + " nombres que son palindromos"); //Imprime en pantalla el resultado
		
	}

}
