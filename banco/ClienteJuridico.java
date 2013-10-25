package banco;

public class ClienteJuridico extends Clientes{
	private  String cnpj;
	private  String tipoDeEmpresa;
	
	
	public ClienteJuridico(String nome, String cnpj) {
		super(nome);
		this.cnpj=cnpj;
		
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getTipoDeEmpresa() {
		return tipoDeEmpresa;
	}
	public void setTipoDeEmpresa(String tipoDeEmpresa) {
		this.tipoDeEmpresa = tipoDeEmpresa;
	}	
		
}
