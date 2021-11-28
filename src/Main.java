
public class Main {

	public static void main(String[] args) {
		Cliente titular = new Cliente();
		titular.setNome("João da Silva");

		Conta cc = new ContaCorrente(titular);
		Conta poupanca = new ContaPoupanca(titular);

		cc.depositar(100);
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		System.out.println("");
		poupanca.imprimirExtrato();
	}

}
