package view;

import model.Pessoa;

public class Execucao {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Christopher Pitter");
		pessoa.setEndereco("Rua Confiss�o");
		pessoa.setBairro("Gleba Do Pessego");
		pessoa.setCidade("S�o Paulo");
		pessoa.setEstado("S�o Paulo");
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getEndereco());
		System.out.println(pessoa.getCep());
		System.out.println(pessoa.getBairro());
		System.out.println(pessoa.getCidade());
		System.out.println(pessoa.getEstado());

	}

}
