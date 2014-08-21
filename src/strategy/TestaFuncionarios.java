package strategy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestaFuncionarios {

	private Gerente gerente;
	private Diretor diretor;
	private ControleDeBonificacoes cdb;
	private Empresa empresa;

	@Before
	public void criaFuncionario() {
		gerente = new Gerente();
		diretor = new Diretor();
		empresa = new Empresa();
		cdb = new ControleDeBonificacoes();
	}

	@Test
	public void criarGerente() {
		gerente.setNome("Rodrigo Villar");
		gerente.setCpf("060.060.199-01");
		gerente.setSenha(19281);
		gerente.setSalario(10000);
		gerente.setDataEntrada("10-01-1981");

		cdb.registra(gerente);
		double retornoEsperado = 2000;
		double retornoFeito = cdb.getTotalDeBonificacoes();
		assertEquals(0, Double.compare(retornoEsperado, retornoFeito));

		cdb.registra(gerente); // segunda bonificação
		double retornoEsperado2 = 4000;
		double retornoFeito2 = cdb.getTotalDeBonificacoes();
		assertEquals(0, Double.compare(retornoEsperado2, retornoFeito2));

		assertEquals(empresa.imprimeFuncionario(gerente), true);
		
		
		
	}

	@Test
	public void criarDiretor() {

		diretor.setNome("Jorge Lima");
		diretor.setCpf("060.060.171-21");
		diretor.setSenha(19999);
		diretor.setSalario(15000);
		diretor.setDataEntrada("26-11-1965");

		cdb.registra(diretor);
		double retornoFeito = cdb.getTotalDeBonificacoes();
		double retornoEsperado = 3500;
		assertEquals(0, Double.compare(retornoEsperado, retornoFeito));

		assertEquals(empresa.imprimeFuncionario(diretor), true);
	}

	@Test
	public void autenticacao() {

		diretor.setSenha(123456);
		gerente.setSenha(543210);

		assertEquals(diretor.autentica(123456), true);
		assertEquals(gerente.autentica(5432101), false);

	}

}
