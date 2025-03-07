package interativo.quiz;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// PERGUNTAS
		String[] perguntas = { "A - O que significa a sigla CPU?",
				"B - Quem escreveu o primeiro algoritmo de computador?", "C - Qual o nome do fundador da Apple",
				"D - Quantos bits equivalem a 1 byte?" };

		// ALTERNATIVAS
		String[][] alternativas = {
				{ "1. Central Programation Utility", "2. Central Processing Unit", "3. Computers, Programing,Unix",
						"4. Central Processing Utility" },
				{ "1. Ada Lovelace", "2. Audrey Hepburn", "3. Marrie Currie", "4. Charles Babbage" },
				{ "1. Bill Gates", "2. Elon Musk", "3. Steve Jobs", "4. Sam altman" },
				{ "1. 16 bits", "2. 2 bits", "3. 10 bits", "4. 8 bits" } };

		// INTRODUÇÃO AO QUIZ
		System.out.println("   *****************************   ");
		System.out.println("   Bem vindo ao quiz técnológico   ");
		System.out.println("   *****************************   \n");

		System.out.println("  Aperte enter para iniciar o quiz");
		sc.nextLine();

		// VARIÁVEIS
		int[] respostas = { 2, 1, 3, 4 };
		int pontuacao = 0;
		int escolha;

		// LÓGICA DO JOGO
		for (int i = 0; i < perguntas.length; i++) {
			System.out.println(perguntas[i]);

			for (String alternativa : alternativas[i]) {
				System.out.println(alternativa);

			}

			System.out.print("Informe sua escolha:");
			escolha = sc.nextInt();

			if (escolha == respostas[i]) {

				System.out.println("*****************");
				System.out.println("Resposta correta.");
				System.out.println("*****************");

				pontuacao++;

			}

			else {
				System.out.println("******************");
				System.out.println(" Resposta errada. ");
				System.out.println("******************");
			}

		}

		// RESULTADO
		System.out.println("Pontuação final: " + pontuacao + "/" + perguntas.length);
		
		if(pontuacao == perguntas.length) {
			System.out.println("Você acertou todas as questões!\nParabéns!!");
		}
		sc.close();
	}
}
