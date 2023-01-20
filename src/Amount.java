
public class Amount {

	private double amount;
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	public boolean removeAmount(double amount) {
		if (this.amount >= amount) {
		this.amount -= amount;
		return true;
		} else {
			return false;
		}
	}
	
}
