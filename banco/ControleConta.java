package banco;


public class ControleConta {

	 Banco umBanco = new Banco();
	

	public void adiciona(Conta umaConta){
		umBanco.getListaContas().add(umaConta);
	}
	
	public Conta pega(int numeroConta){
		for(int i = 0; i < umBanco.getListaContas().size(); i++) {
		if (numeroConta == umBanco.getListaContas().get(i).getNumeroConta())	
			return umBanco.getListaContas().get(i);
		}
		return null;
	}
	
	public int totalDeContas(int total){
		 total = umBanco.getListaContas().size();
		 return total;
	}

	
}
