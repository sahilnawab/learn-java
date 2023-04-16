package example;

public class Main {

	public static void main(String[] args) {
		Bank axis = new Bank("mehul",25000.32);
		Bank HDFC = new Bank("hiren", 100000.323);
		axis.deposit();
		HDFC.withdraw();
		

	}

}
