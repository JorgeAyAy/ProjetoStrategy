
public class SistemaInterno {
	
	void login(Autenticavel a){
		
		int senha = 0; //pegar senha de algum lugar
		boolean ok = a.autentica(senha);
		
		//posso chamar um autentica que não é necessariamente um funcionário, mas ainda não sei que objeto
		//a referência a está chamando! Flexibilidade.
	}

}
