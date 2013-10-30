package banco;

public class Diretor extends Gerente {

	private int numeroDeGerentes;

	
	public Diretor(String nome) {
		super(nome);
	}
	
	
	public int getNumeroDeGerentes() {
		return numeroDeGerentes;
	}

	public void setNumeroDeGerentes(int numeroDeGerentes) {
		this.numeroDeGerentes = numeroDeGerentes;
	}
	
	
	
}
