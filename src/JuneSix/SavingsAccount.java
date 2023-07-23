package JuneSix;

public class SavingsAccount {
    public static void main(String[] args){

        SavingsAccountTest user1 = new SavingsAccountTest();
        user1.setSavingsAccount(218242,"Bhanu Pradeep",8717);
        user1.showSavingsAccount();
        user1.withdraw(2000);
        user1.showSavingsAccount();
        user1.deposit(10000);
        user1.showSavingsAccount();
        SavingsAccountTest user2 = new SavingsAccountTest();
        user2.setSavingsAccount(24567,"vijay",9000);
        user2.showSavingsAccount();
        user2.deposit(2000);
        user2.showSavingsAccount();
        

    }

}

class SavingsAccountTest{
    private int accountNumber;
    private String accountHolderName;
    private int accountBalance;
    void setSavingsAccount(int accountNumber,String accountHolderName,int accountBalance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }
    void showSavingsAccount(){
        System.out.println("account Number is :"+accountNumber);
        System.out.println("account Holder name is :"+accountHolderName);
        System.out.println("account Balance is :"+accountBalance);
    }

    void withdraw(double ToWithdraw){
        System.out.println("withdrwaing amount ...:"+ToWithdraw);
        accountBalance  -= ToWithdraw;
    }
    void deposit(double ToDeposit){
        System.out.println("depositing ammount ....:"+ToDeposit);
        accountBalance += ToDeposit;
    }
}
