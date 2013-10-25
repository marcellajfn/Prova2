package banco;

public class ClienteFisico extends Clientes{
	
	private String cpf;
	private String estadoCivil;
	private int idade;
	
	public ClienteFisico(String nome, String cpf) {
		super(nome);
		this.cpf=cpf;		
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	

}
