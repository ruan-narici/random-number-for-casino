
public class Bet extends Amount{
	
	private double bet;
	private static int count;
	private static int mult = 2;
	private static double totalApostado = 0;
	
	public int getCount() {
		return this.count;
	}
	
	public void setBet(double bet) {
		this.bet = bet;
	}
	
	public double getBet() {
		return this.bet;
	}
	
	public void doBet() {
		if (super.removeAmount(this.getBet())) {
		super.removeAmount(this.getBet());
		setBet(this.getBet() * mult);
		count ++;
		double vitoria = this.getBet() * 3;
		totalApostado += this.getBet();
		System.out.println("#Aposta numero " + this.getCount());
		System.out.println(". Apostou: " + this.getBet() +
				". Se ganhar, leva: " + vitoria + 
				". Total apostado: " + totalApostado);
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}

}
