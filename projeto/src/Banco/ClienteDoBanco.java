package Banco;

public class ClienteDoBanco {
	//Atributo
	private String nome;
	
	//Método
	public String obterNomeDoCliente() {
		return this.nome;
	}
	//Construtor vazio que será usado na classe fachada
	public ClienteDoBanco() {}
	//construtor que será usado para instanciar um objeto no método main
	public ClienteDoBanco(String nome) {
		this.nome = nome;
	}
}
