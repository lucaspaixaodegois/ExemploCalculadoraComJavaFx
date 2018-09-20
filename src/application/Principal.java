package application;

import java.util.Scanner;

import math.Calculadora;

public class Principal {
	public static void main(String[] args) {
		Principal p = new Principal();
		Calculadora calc = new Calculadora();
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		while (menu != 9) {
			// imprimindo menu
			p.menu(calc);
			// solicitar opcao do menu
			System.out.println("Escolha um item do menu:");
			menu = scan.nextInt();
			// executando as acoes do menu
			Double valor = 0d;
			switch (menu) {
			case 1:
				p.limparTela();
				System.out.println("Digite um valor para inserir:");
				valor = scan.nextDouble();
				calc.inserirValorInicial(valor);
				p.limparTela();
				break;
			case 2:
				p.limparTela();
				System.out.println("Digite um valor para somar:");
				valor = scan.nextDouble();
				calc.somar(valor);
				p.limparTela();
				break;
			case 3:
				p.limparTela();
				System.out.println("Digite um valor para subtrair:");
				valor = scan.nextDouble();
				calc.subtrair(valor);
				p.limparTela();
				break;
			case 4:
				p.limparTela();
				System.out.println("Digite um valor para multiplicar:");
				valor = scan.nextDouble();
				calc.multiplicar(valor);
				p.limparTela();
				break;
			case 5:
				p.limparTela();
				System.out.println("Digite um valor para dividir:");
				valor = scan.nextDouble();
				calc.dividir(valor);
				p.limparTela();
				break;
			case 6:
				p.limparTela();
				System.out.println("Digite um valor para potencia:");
				int valorPotencia = scan.nextInt();
				calc.potencia(valorPotencia);
				p.limparTela();
				break;
			case 7:
				calc.inverterSinal();
				p.limparTela();
				break;
			case 8:
				calc.limpar();
				p.limparTela();
				break;
			case 9:
				p.limparTela();
				System.out.println("Obrigado por utilizar a Calculadora. :)");
				break;
			default:
				p.limparTela();
				System.out.println("Voce digitou um item do menú errado. Tente novamente. \n");
				break;
			}
		}
		scan.close();

	}

	public void menu(Calculadora calc) {
		System.out.println("CALCULADORA \n");
		System.out.println("Resultado: " + calc.obterResultado() + "\n");
		System.out.println("Menu:");
		System.out.println(" (1) - Inserir valor inicial;");
		System.out.println(" (2) - Somar;");
		System.out.println(" (3) - Subtrair;");
		System.out.println(" (4) - Multiplicar;");
		System.out.println(" (5) - Dividir;");
		System.out.println(" (6) - Potencia;");
		System.out.println(" (7) - Inverter Sinal;");
		System.out.println(" (8) - Limpar Resultado;");
		System.out.println(" (9) - Finalizar o programa.");
	}

	public void limparTela() {
		for (int i = 0; i < 100; i++) {
			System.out.println("\n");
		}
	}
}
