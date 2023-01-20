
public class Roulette {

	public static void main(String[] args) {
		
		Bet casino = new Bet();
		
		casino.setAmount(1000.0);
		casino.setBet(1);
		
		casino.doBet();
		casino.doBet();
		casino.doBet();
		casino.doBet();
		casino.doBet();
		casino.doBet();
		casino.doBet();
		casino.doBet();
		casino.doBet();

		System.out.println();
		System.out.println("Saldo: " + casino.getAmount());
		System.out.println("Valor apostado: " + casino.getBet());
		System.out.println();
	}
}
