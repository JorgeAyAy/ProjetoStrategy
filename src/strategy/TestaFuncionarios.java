package strategy;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestaFuncionarios {

	@Test
	public void criarGerente() {
		Gerente gerente = new Gerente();
		gerente.setNome("Rodrigo Villar");
		gerente.setSenha(19281);
		gerente.setSalario(10000);
		ControleDeBonificacoes cdb = new ControleDeBonificacoes();

		cdb.registra(gerente);

		// Funcionario funcionario = gerente;
		//
		// funcionario.setSalario(5000);
		//
		// cdb.registra(funcionario); // 2000
		//
		double retornoEsperado = 2000;

		double retornoFeito = cdb.getTotalDeBonificacoes();

		assertEquals(0, Double.compare(retornoEsperado, retornoFeito));

		cdb.registra(gerente); // segunda bonificação

		double retornoEsperado2 = 4000;

		double retornoFeito2 = cdb.getTotalDeBonificacoes();

		assertEquals(0, Double.compare(retornoEsperado2, retornoFeito2));

		// System.out.println(cdb.getTotalDeBonificacoes());

	}

	@Test
	public void criarDiretor() {

		Diretor diretor = new Diretor();
		diretor.setNome("Jorge Lima");
		diretor.setSenha(19999);
		diretor.setSalario(15000);

		ControleDeBonificacoes cdb = new ControleDeBonificacoes();

		cdb.registra(diretor);

		double retornoFeito = cdb.getTotalDeBonificacoes();

		double retornoEsperado = 1500;

		assertEquals(0, Double.compare(retornoEsperado, retornoFeito));

		// System.out.println(cdb.getTotalDeBonificacoes());

	}

	@Test
	public void autenticacao() {

		Diretor diretor = new Diretor();
		Gerente gerente = new Gerente();
		Cliente cliente = new Cliente();

		diretor.setSenha(123456);
		gerente.setSenha(543210);
		cliente.setSenha(0000001);

		// Autenticavel gerente = new Gerente(); //somente chama o método que
		// está na interface

		assertEquals(diretor.autentica(123456), true);
		assertEquals(gerente.autentica(543210), true);
		assertEquals(cliente.autentica(3209182), false);

	}

}
