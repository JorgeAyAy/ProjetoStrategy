
public abstract class Funcionario {
	
	protected String nome; //Se quisermos acessar os atributos do pai, n�o queremos que ele seja public, ent�o deixamos protected
	protected String cpf; //S� pode ser acessado pela pr�pria classe ou por suas subclasses (filha)
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
