
public class SistemaInterno {
	
	void login(Autenticavel a){
		
		int senha = 0; //pegar senha de algum lugar
		boolean ok = a.autentica(senha);
		
		//posso chamar um autentica que n�o � necessariamente um funcion�rio, mas ainda n�o sei que objeto
		//a refer�ncia a est� chamando! Flexibilidade.
	}

}
