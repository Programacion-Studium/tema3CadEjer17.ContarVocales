package es.Studium.cadEjer17;

import java.util.Scanner;

public class ContarVocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String palabra;
		int contador=0;
		System.out.println("indique la cadena a contar");
		palabra=teclado.nextLine();
		teclado.close();

		vocales(palabra, contador);
		
	}

	/**
	 * @param palabra
	 * @param contador
	 */
	private static void vocales(String palabra, int contador) 
	{
		for(int i=0;i<palabra.length();i++)
		{
			if((palabra.charAt(i)=='a')||(palabra.charAt(i)=='e')||(palabra.charAt(i)=='i')||(palabra.charAt(i)=='o')||(palabra.charAt(i)=='u')||(palabra.charAt(i)=='A')||(palabra.charAt(i)=='E')||(palabra.charAt(i)=='I')||(palabra.charAt(i)=='O')||(palabra.charAt(i)=='U'))
			{
				contador++;
			}
		}
		System.out.println(contador);
	}

}
