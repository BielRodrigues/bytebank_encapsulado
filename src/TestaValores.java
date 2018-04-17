
public class TestaValores {
	public static void main(String[] args) {
		Conta conta1 = new Conta(1337, 2336);
		
		Conta conta2 = new Conta(1437, 2331);

		Conta conta3 = new Conta(111337, 236736);
		
		System.out.println("---------------");
		System.out.println("O total de contas criadas: " + Conta.getTotal());
	}
}
