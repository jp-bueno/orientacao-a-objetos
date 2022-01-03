package aula;

public class funcionario {

	// ATRIBUTOS (DADOS)
	
	public String nome;
	public double valorPorHora;
	public int horas;
		
	// MÉTODOS = funções (COMPORTAMENTO)
	
	public double total() {
		return valorPorHora * horas;
	}
}
