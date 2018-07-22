package br.jeanheberth.principal;

import br.jeanheberth.modelo.Pessoa;

public class Principal {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa();
			
		pessoa1.setNome("Jean Heberth");
		pessoa1.setCpf("123456");
		pessoa1.setEndereco("Qsc 19 Chac 27 ");
		
		
		Pessoa pessoa2 = new Pessoa();
		
		pessoa2.setNome("Luiz Augusto");
		pessoa2.setCpf("123528");
		pessoa2.setEndereco("Qsc 19 Chaca 28");
		
		
		System.out.println("Dados informados da pessoa 1");
		
		System.out.println(" Nome: " +pessoa1.getNome());
		System.out.println(" Cpf: " +pessoa1.getCpf());
		System.out.println(" Endereco: " +pessoa1.getEndereco());

		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");

		System.out.println("Dados informados da pessoa 2");
		
		System.out.println(" Nome: " +pessoa2.getNome());
		System.out.println(" Cpf: " +pessoa2.getCpf());
		System.out.println(" Endereco: " +pessoa2.getEndereco());
		
		
		
		
	}

}
