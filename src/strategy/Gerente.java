package strategy;


public class Gerente extends Funcionario{
	
	public boolean autentica(int senha){
		return super.autentica(senha);
	}
	
	public double getBonificacao(){
		return super.getBonificacao() + 1000;
	}
	
}
