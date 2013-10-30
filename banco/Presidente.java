package banco;

public class Presidente extends Funcionarios {
	
	    private int numeroGerentes;
	
		public Presidente(String nome) {
		super(nome);
     	}
		
		public int getNumeroGerentes() {
			return numeroGerentes;
		}

		public void setNumeroGerentes(int numeroGerentes) {
			this.numeroGerentes = numeroGerentes;
		}
		
	
}
