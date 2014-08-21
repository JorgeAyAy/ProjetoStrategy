package strategy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestaFuncionarios {

	private Gerente gerente;
	private Diretor diretor;
	private ControleDeBonificacoes cdb;

	@Before
	public void criaFuncionario() {
		gerente = new Gerente();
		diretor = new Diretor();
		cdb = new ControleDeBonificacoes();
	}

	@Test
	public void criarGerente() {
		gerente.setNome("Rodrigo Villar");
		gerente.setSenha(19281);
		gerente.setSalario(10000);

		cdb.registra(gerente);
		double retornoEsperado = 2000;
		double retornoFeito = cdb.getTotalDeBonificacoes();
		assertEquals(0, Double.compare(retornoEsperado, retornoFeito));

		cdb.registra(gerente); // segunda bonificação
		double retornoEsperado2 = 4000;
		double retornoFeito2 = cdb.getTotalDeBonificacoes();
		assertEquals(0, Double.compare(retornoEsperado2, retornoFeito2));
		
		assertEquals(gerente.getNome(), "Rodrigo Villar");
	}

	@Test
	public void criarDiretor() {

		diretor.setNome("Jorge Lima");
		diretor.setSenha(19999);
		diretor.setSalario(15000);

		cdb.registra(diretor);
		double retornoFeito = cdb.getTotalDeBonificacoes();
		double retornoEsperado = 1500;
		assertEquals(0, Double.compare(retornoEsperado, retornoFeito));
		
		assertEquals(diretor.getNome(), "Jorge Lima");
	}

	@Test
	public void autenticacao() {

		Cliente cliente = new Cliente();

		diretor.setSenha(123456);
		gerente.setSenha(543210);
		cliente.setSenha(0000001);

		assertEquals(diretor.autentica(123456), true);
		assertEquals(gerente.autentica(543210), true);
		assertEquals(cliente.autentica(3209182), false);

	}

}
