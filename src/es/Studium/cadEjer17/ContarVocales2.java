package es.Studium.cadEjer17;

import java.util.Scanner;

public class ContarVocales2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String palabra;
		String vocales="aeiouAEIOU";
		int contador=0;
		System.out.println("indique la cadena a contar");
		palabra=teclado.nextLine();
		teclado.close();
		//funcion para contar las vocales de un String
		contador = contarVocales(palabra, vocales, contador);
		//imprimimos el resultado
		System.out.println(contador);
	}

	private static int contarVocales(String palabra, String vocales, int contador) {
		//Recorremos la palabra introducida y sacamos los caracteres para compararlos con las vocales
		for(int i=0; i<palabra.length();i++)
		{
			for(int e=0; e<vocales.length();e++)
			{
				//Comparamos los caracteres para ver si tienen Vocales
				if(palabra.charAt(i)==vocales.charAt(e))
				{
					contador++;//sumamos 1 al encontrar un caracter
				}
			}
		}
		return contador;
	}

}
