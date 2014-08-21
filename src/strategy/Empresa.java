package strategy;

public class Empresa {
    
    private Funcionario[] empregados;

    public Funcionario getFuncionario(int posicao) {
        return this.empregados[posicao];
    }
    
    public boolean imprimeFuncionario(Funcionario f){
    	
    	System.out.println("Nome: "+f.getNome());
    	System.out.println("CPF: "+f.getCpf());
    	System.out.println("Salario: "+f.getSalario());
    	System.out.println("Data Entrada: "+f.getDataEntrada()+"\n");
    	
    	return true;
    }

}
