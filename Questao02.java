package exercicios03repeticao;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		//declaraçao de variaveis
		Scanner leia = new Scanner(System.in);
		int num, contadorPar=0, contadorImpar=0;
		
		for(int i=0; i<10;i++) {
			System.out.println("Digite o "+(i+1)+"º número:");
			num = leia.nextInt();
			if(num%2==0) {
				contadorPar+=1;
			} else {
				contadorImpar+=1;
			}

		}
		System.out.println("Total de números pares: "+ contadorPar);
		System.out.println("Total de números ímpares: "+ contadorImpar);
	}

}
