public class TestaGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("Jo�o da Silva");
		gerente.setSenha(19281);
		gerente.setSalario(5000);
		ControleDeBonificacoes cdb = new ControleDeBonificacoes();
		
		Autenticavel diretor = new Diretor(); 
		
		Autenticavel gerente1 = new Gerente(); //somente chama o m�todo que est� na interface
		
		cdb.registra(gerente);

		Funcionario funcionario = gerente;

		funcionario.setSalario(5000);
		cdb.registra(funcionario);

		cdb.registra(funcionario);

		System.out.println("\n" + cdb.getTotalDeBonificacoes());

	}
}
