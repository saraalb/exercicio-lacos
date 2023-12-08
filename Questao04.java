package exercicios03repeticao;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		//declaração de variaveis
		int idade=0, identidadeGenero, pessoaDev, contadorPessoas=0, contadorIdade=0, contadorBackend=0, 
				contadorMulheresFrontend=0, contadorHomemQuarenta=0, contadorNaoBinarioFSTrinta=0;
		float mediaIdade=0.0f;
		String continuar="s";
		Scanner leia = new Scanner(System.in);
		
		//entrada de dados / laço while / condicional / processamento
		while(continuar.equalsIgnoreCase("s")) {
			System.out.println("Digite idade:");
			idade = leia.nextInt();
			System.out.println("Identidade de gênero - Escolha uma opção:");
            System.out.println("1 – Mulher Cis");
            System.out.println("2 – Homem Cis");
            System.out.println("3 – Não Binário");
            System.out.println("4 – Mulher Trans");
            System.out.println("5 – Homem Trans");
            System.out.println("6 – Outros");
			identidadeGenero = leia.nextInt();
			System.out.println("Pessoa desenvolvedora - Escolha uma opção:");
	        System.out.println("1 – Backend");
	        System.out.println("2 – Frontend");
	        System.out.println("3 – Mobile");
	        System.out.println("4 – FullStack");
			pessoaDev = leia.nextInt();
			leia.nextLine();
			System.out.println("Deseja continuar?\nDigite S para sim ou N para não.");
			continuar = leia.nextLine();
			

			if(pessoaDev == 1) {
				contadorBackend++;
			} else if(pessoaDev == 2 && (identidadeGenero == 1 || identidadeGenero ==4)) {
				contadorMulheresFrontend++;
			} else if(pessoaDev == 3 && (identidadeGenero==2 || identidadeGenero==5)&& idade>40) {
				contadorHomemQuarenta++;
			} else if(pessoaDev == 4 && identidadeGenero==3 && idade<30) {
				contadorNaoBinarioFSTrinta++;		
			} else {
				System.out.println("\n");
			}
			contadorPessoas++;
			contadorIdade += idade;
		}
		
		mediaIdade = ((float)contadorIdade/contadorPessoas);
		
		//Saída de dados
		System.out.println("\n\nTotal de pessoas desenvolvedoras Backend: "+ contadorBackend);
		System.out.println("\nTotal de mulheres cis e trans desenvolvedoras FrontEnd: "+ contadorMulheresFrontend);
		System.out.println("\nTotal de homens cis e trans desenvolvedores mobile maiores de 40 anos: "+ contadorHomemQuarenta);
		System.out.println("\nTotal de pessoas não binárias desenvolvedoras FullStack menores de 30 anos: "+ contadorNaoBinarioFSTrinta);
		System.out.println("\nO número total de pessoas que responderam a pesquisa: "+contadorPessoas);
		System.out.printf("\nA média de idade das pessoas que responderam a pesquisa: %.2f", mediaIdade);

	}

}
