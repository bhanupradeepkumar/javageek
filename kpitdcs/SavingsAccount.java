package kpitdcs;

public class SavingsAccount {
	public static void main(String[] args) {
		SavingMethod bhanu = new SavingMethod();
		bhanu.setSavingsAccount(4238000,"Bhanu" , 13717);
		bhanu.showSavingsAccount();
		bhanu.deposit(2000);
		bhanu.showSavingsAccount();
	}

}

class SavingMethod{
	private int accountNumber;
	private String accountHolder;
	private int accountBalance;
	
	void setSavingsAccount(int aN,String aNam,int aB) {
		accountNumber = aN;
		accountHolder = aNam;
		accountBalance = aB;
		
	}
	
	void showSavingsAccount() {
		System.out.println("accountNumber :"+accountNumber);
		System.out.println("accountHolder :"+accountHolder);
		System.out.println("accountBalance :"+accountBalance);
	}
	
	void withdraw(double amtToWithdraw) {
		System.out.println("withdrawing amount___");
		accountBalance -=amtToWithdraw;
	}
	void deposit(double amtToDeposit) {
		System.out.println("depositing amount....");
		accountBalance += amtToDeposit;
	}
}
