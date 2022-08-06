package atm;

public class Main {

	public static void main(String[] args) {
		
		Cliente roberto = new Cliente();
		roberto.setNome("Roberto");		
			
		
		Conta cc = new ContaCorrente(roberto);
		Conta poupanca = new ContaPoupanca(roberto);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		
		
		// TODO Auto-generated method stub
		
	}

}
