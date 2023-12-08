package exercicios03repeticao;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		//declaraçao de variaveis
		int num1, num2;
		Scanner leia = new Scanner(System.in);
		
		//entrada de dados
		System.out.println("Informe o primeiro número do intervalo:");
		num1 = leia.nextInt();
		System.out.println("Informe o segundo número do intervalo:");
		num2 = leia.nextInt();
		
		//saída de dados/ processamento / condicional / laço loop
		if (num1>num2) {
			System.out.println("Intervalo inválido!");
		} else {
			System.out.println("No intervalo entre "+num1+" e "+num2+":");
			for(int i=num1; i<=num2;i++) {
				if (i%3==0 && i%5==0) {
					System.out.println(i+" é múltiplo de 3 e 5.");
				} 
			}
		}

	}

}
