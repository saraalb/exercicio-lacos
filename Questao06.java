package exercicios03repeticao;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		int num, contMultiplos=0, contador=0;
		float media;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();	
			if(num%3==0 && num!=0) {
				contMultiplos+=num;
				contador++;
			}
		} while(num!=0);
		
		media = (float)contMultiplos/contador;
		System.out.printf("A média de todos os números múltiplos de 3 é: %.1f",media);
	

	}

}
