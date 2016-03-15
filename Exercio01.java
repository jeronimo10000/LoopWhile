package exerciciosdeloop;

import java.util.Scanner;

public class Exercio01 {

	private static Scanner ler;

	public static void main(String[] args) {
		/*Faça um programa que peça uma nota, entre zero a dez.
		 * Mostre uma mensagem caso o valor seja inválido 
		 * e continue pedindo até que o usuário informe um valor válido.
		 */
		
		ler = new Scanner(System.in);
		
		boolean notaValida = false;
				
		while(!notaValida){
			
			System.out.println("Digite uma nota de 0 a 10: ");
			double nota = ler.nextDouble();
			
				if(nota>=0 && nota<=10){
						notaValida = true;
						System.out.println("Você digitou a nota: " + nota);
				}else {
						notaValida = false;
						System.out.println("Você digitou uma nota inválida!, Digite novamente!");
				}
		
		}
	}

}
