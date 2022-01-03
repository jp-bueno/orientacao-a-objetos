package aula;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		// sem orienta��o � objetos.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// declarando as vari�veis do tipo funcion�rio
		funcionario f1, f2;

		// instanciando os objetos (criando os objetos)
		f1 = new funcionario();
		f2 = new funcionario();

		System.out.println("Dados do primeiro funcion�rio: ");
		f1.nome = sc.next();
		f1.valorPorHora = sc.nextDouble();
		f1.horas = sc.nextInt();

		System.out.println("Dados do segundo funcion�rio: ");
		f2.nome = sc.next();
		f2.valorPorHora = sc.nextDouble();
		f2.horas = sc.nextInt();
		double total = f1.total() + f2.total();

		System.out.printf("Total = %.2f%n", total);
	}
}
