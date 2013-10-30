package banco;

public class Gerente extends Funcionarios{
	
	private int senha;

	public Gerente(String nome) {
		super(nome);
		
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public String ConfereSenha(int senhaDigitada, int senhaGerente){
		senhaGerente=this.senha;
		if (senhaDigitada == this.senha){	
			return "Senha correta";
			}
		else 
		return "Senha Incorreta";
	}

}
