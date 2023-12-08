package exercicios03repeticao;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		//declaraçao de variaveis
		int num, soma=0;
		Scanner leia = new Scanner(System.in);
		
		//entrada de dados / processamento / laço do-while / condicional
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			if(num>0) {
				soma += num;
			}
		} while(num != 0);
		
		//saída de dados
		System.out.println("A soma dos números positivos é: "+soma);

	}

}
