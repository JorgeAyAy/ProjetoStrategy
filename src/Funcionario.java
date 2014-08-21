
public abstract class Funcionario {
	
	protected String nome; //Se quisermos acessar os atributos do pai, não queremos que ele seja public, então deixamos protected
	protected String cpf; //Só pode ser acessado pela própria classe ou por suas subclasses (filha)
	protected double salario;
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setSalario(double salario){
		this.salario = salario;
	}
	
	public double getSalario(){
		return this.salario;
	}
	
	public double getBonificacao(){
		return this.salario * 0.10;
	}
	
	
	
}
