package loops;

import java.util.Scanner;

public class Break {

	private static Scanner ler;

	public static void main(String[] args) {
		
		ler = new Scanner(System.in);
		
		System.out.println("Digite o número inicial: ");
		int numI = ler.nextInt();
		
		System.out.println("Digite o número final: ");
		int numF = ler.nextInt();
		
		for(int i = numI; i <= numF; i ++){
			//System.out.println(i);
			if(i % 5 == 0){
				System.out.println("Número divisivel por 7: " + i);
				//break;
			}
		}

	}

}
