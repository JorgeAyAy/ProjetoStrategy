package strategy;


public class Gerente extends Funcionario implements Autenticavel{
	
	private int senha;
	private int numeroDeFuncionariosGerenciados;
	
	public void setSenha(int senha){
		this.senha = senha;
	}
	
	public int getSenha(){
		return this.senha;
	}
	
	public boolean autentica(int senha){
		if(this.senha == senha){
			System.out.println("Acesso permitido!");
			return true;
		}else{
			System.out.println("Acesso negado!");
			return false;
		}
	}
	
	public double getBonificacao(){
		return super.getBonificacao() + 1000;
	}
	
}
