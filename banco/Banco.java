package banco;

import java.util.ArrayList;



public class Banco {
	
	private String qntClientes;
	private String qntFuncionarios;
	private Funcionarios funcionario;
	private Clientes cliente;
	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
		
	

	public ArrayList<Conta> getListaContas() {
		return listaContas;
	}

	public void setListaContas(ArrayList<Conta> listaContas) {
		this.listaContas = listaContas;
	}
	
	
	public String getQntClientes() {
		return qntClientes;
	}
	public void setQntClientes(String qntClientes) {
		this.qntClientes = qntClientes;
	}
	public String getQntFuncionarios() {
		return qntFuncionarios;
	}
	public void setQntFuncionarios(String qntFuncionarios) {
		this.qntFuncionarios = qntFuncionarios;
	}
	public Funcionarios getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionarios funcionario) {
		this.funcionario = funcionario;
	}
	public Clientes getCliente() {
		return cliente;
	}
	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}
	
		

}
