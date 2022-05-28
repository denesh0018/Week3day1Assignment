package week3day1assignmetn3;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("Deposit policy changed");
	}

	public static void main(String[] args) {

		AxisBank obj=new AxisBank();
		obj.deposit();
		obj.fixed();
		obj.saving();
		
	}

}
