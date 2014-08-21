package strategy;


public class Diretor extends Funcionario{
		
	public boolean autentica(int senha){
		return super.autentica(senha);
	}
	
	public double getBonificacao(){
		return super.getBonificacao() + 2000;
	}
	

}
