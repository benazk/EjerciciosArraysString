
public class Cuatro {

	public static void main(String[] args) {
		
		String cadenas[]= {"SUe", "CHARLotte", "Anna", "Mike", "WILLiam" , "Ed"};
		int caps = 0; 
		int la_mitad = 0; 
		int mas_mayus = 0; 
		
		for(int i = 0; i < cadenas.length; i++) { //Este bucle recorre las posiciones del array
			la_mitad = (int) Math.floor(cadenas[i].length() / 2); 
			for (int j = 0; j < cadenas[i].length(); j++) { //Este bucle recorre las posiciones de las palabras
				if (cadenas[i].charAt(j) >= 'A' && cadenas[i].charAt(j) <= 'Z') { //Esta condicion dictamina que si la letra esta entre 'A' y 'Z'
					caps++;														  //(Mayusculas), le añadira una al contador de mayus					
				}
			}
			if(caps > la_mitad) { //Si las mayusculas son mas de la mitad del array, suma 1 al mas_mayus
				mas_mayus++;
			}
			caps = 0; //resetea el contador de mayusculas por cada posicion del array
		}
		//Muestra en pantalla
		System.out.println("Hay " + mas_mayus + " palabras con mas mayusculas que minusculas"); 
	}

}
