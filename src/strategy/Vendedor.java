package strategy;

public class Vendedor extends Funcionario{
	
	public boolean autentica(int senha){
		return super.autentica(senha);
	}
	
	public double getBonificacao(){
		return super.getBonificacao() + 100;
	}

}
