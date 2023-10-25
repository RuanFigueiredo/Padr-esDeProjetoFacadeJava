package Banco;

public class ContaBancaria {
	//Atributos
	private String conta;
	private int saldo;
	
	public int depositar(int valor) {
		System.out.println("Depositando...");
		return this.setSaldo(this.getSaldo()+ valor);
	}
	
	//Método usado na classe Fachada
		public String obterNumeroConta() {
			System.out.println("Obtendo número da conta...");
			return this.conta;
		}
	
	//Método usado na classe Fachada
	public int obterSaldo() {
		System.out.println("Obtendo saldo...");
		return this.getSaldo();
	}
	
	// Esse Construtor será usado na classe Fachada
	public ContaBancaria() {}
	
	/* Esse Construtor será usado no método main na classe AplicacaoCliente
	para instanciar um objeto*/
	public ContaBancaria(String conta) {
		this.conta = conta;
	}
	
	public int getSaldo() {
		return saldo;
	}
	
	public int setSaldo(int saldo) {
		this.saldo = saldo;
		return saldo;
	}	
}
