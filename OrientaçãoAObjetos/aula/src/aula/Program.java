package aula;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		// sem orientação à objetos.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// declarando as variáveis do tipo funcionário
		funcionario f1, f2;

		// instanciando os objetos (criando os objetos)
		f1 = new funcionario();
		f2 = new funcionario();

		System.out.println("Dados do primeiro funcionário: ");
		f1.nome = sc.next();
		f1.valorPorHora = sc.nextDouble();
		f1.horas = sc.nextInt();

		System.out.println("Dados do segundo funcionário: ");
		f2.nome = sc.next();
		f2.valorPorHora = sc.nextDouble();
		f2.horas = sc.nextInt();
		double total = f1.total() + f2.total();

		System.out.printf("Total = %.2f%n", total);
	}
}
