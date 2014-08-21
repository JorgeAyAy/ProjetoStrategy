package strategy;

public abstract class Funcionario {

	private String nome; // Se quisermos acessar os atributos do pai, não
							// queremos que ele seja public, então deixamos
							// protected
	private String cpf; // Só pode ser acessado pela própria classe ou por suas
						// subclasses (filha)
	
	private double salario;
	private String dataEntrada;

	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	private int senha;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return this.salario;
	}

	public double getBonificacao() {
		return this.salario * 0.10;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getSenha() {
		return this.senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso permitido!");
			return true;
		} else {
			System.out.println("Acesso negado!");
			return false;
		}
	}

}
