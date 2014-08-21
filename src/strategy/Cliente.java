package strategy;


public class Cliente implements Autenticavel{
	
	private int senha;
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		
		if(this.senha == senha){
			System.out.println("Acesso permitido!");
			return true;
		}else{
			System.out.println("Acesso negado!");
			return false;
		}
	}

}
