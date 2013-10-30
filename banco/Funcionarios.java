package banco;

public class Funcionarios extends Banco{
	
	private String nome;
	private String tipoFuncionario;
	private String CargaDeTrabalho;
	
	
	
	public Funcionarios(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipoFuncionario() {
		return tipoFuncionario;
	}
	public void setTipoFuncionario(String tipoFuncionario) {
		this.tipoFuncionario = tipoFuncionario;
	}
	public String getCargaDeTrabalho() {
		return CargaDeTrabalho;
	}
	public void setCargaDeTrabalho(String cargaDeTrabalho) {
		CargaDeTrabalho = cargaDeTrabalho;
	}
	
	

}
