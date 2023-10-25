package Banco;

public class AplicacaoCliente {
	public static void main(String[] args) {
		ClienteDoBanco cliente = new ClienteDoBanco("João De Barro");
		ContaBancaria conta = new ContaBancaria("1254-8");
		
		Fachada facade = new Fachada();
		
		facade.fazerDeposito(150, cliente, conta);
	}
}
 