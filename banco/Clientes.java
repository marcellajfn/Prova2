package banco;

public class Clientes {
	
	private String nome;
	private int email;
	private String telefone;
	
	//construtor
	public Clientes(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEmail() {
		return email;
	}
	public void setIdade(int email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
