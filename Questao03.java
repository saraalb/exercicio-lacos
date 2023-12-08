package exercicios03repeticao;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		//declaraçao de variaveis
		int i=0, idade=1, contadorMenorIdade=0, contadorMaiorIdade=0;
		Scanner leia = new Scanner(System.in);
		
		//processamento e saída de dadso - laço while
		while(idade>0) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			
			if(idade<21 && idade>0) {
				contadorMenorIdade+=1;
			} else if (idade>50) {
				contadorMaiorIdade+=1;
			}
			i++;
		}
		
		//saida de dados
		System.out.println("Total de pessoas menos de 21 anos: "+contadorMenorIdade);
		System.out.println("Total de pessoas maiores de 50 anos: "+contadorMaiorIdade);

	}

}
