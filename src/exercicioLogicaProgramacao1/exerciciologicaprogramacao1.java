package exercicioLogicaProgramacao1;
//Considerando que todos os meses tenham 30 dias, 
//calcular o total de dias de "n" meses onde "n" é um valor informado pelo usuário.

import java.util.Scanner;

public class exerciciologicaprogramacao1 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		
		int mes;
		int dia;
				
		System.out.println("Digite quantidade de meses desejado: ")	;
		mes = valor.nextInt ();
		
		dia =(mes*30);
		System.out.println("Numero de dias são:" +dia );
		
		
	}


}
