package br.com.fiap;

public class UsaPessoa {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa("Bolo Bolinho Bolanha", 1999);

		pessoa1.setNome("Berada");
		pessoa1.setAnoNascimento(1998);

		System.out.println("Nome: " + pessoa1.getNome());
		System.out.println("Idade: " + pessoa1.calculaIdade(2022));

		System.out.println("\nNome: " + pessoa2.getNome());
		System.out.println("Idade: " + pessoa2.calculaIdade(2022));
	}
}
