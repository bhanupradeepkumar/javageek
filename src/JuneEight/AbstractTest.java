package JuneEight;

import java.awt.image.BandCombineOp;

public class AbstractTest {
    public static void main(String[] args) {
        Monkey m1 = new Monkey();
        m1.jump();

    }
}

class Monkey{
    void jump(){
        SavingsAccount savObj = new SavingsAccount(218242,"bhanu",8717,2);
        System.out.println(savObj.getAccountBalance());
        savObj.setAccountBalance(9000);
        System.out.println(savObj.getAccountBalance());
        savObj.withdraw(3000);
        savObj.showBackAccount();

    }
}

abstract class BankAccount{
    private int accountNumber;
    private String accountHolder;
    private double accountBalance;

    BankAccount(int accountNumber,String accountHolder,double accountBalance){
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.accountBalance=accountBalance;
    }
    void showBackAccount(){
        System.out.println("____Account Details___");
        System.out.println("accountNumber :"+accountNumber);
        System.out.println("accountHolder :"+accountHolder);
        System.out.println("accountBalance :"+accountBalance);
    }

    public double getAccountBalance(){
        return accountBalance;
    }
    public void setAccountBalance(double accountBalance){
        this.accountBalance=accountBalance;
    }

    abstract void withdraw(double amtToWithdraw);//mandate
    abstract void deposit(double amtToDeposit);//mandate
}

class SavingsAccount extends BankAccount{
    float rate;
    public SavingsAccount(int accountNumber,String accountHolder,double accountBalance
            ,float rate){
        super(accountNumber,accountHolder,accountBalance);
        this.rate = rate;
    }
    void withdraw(double amtToWithdraw){
        System.out.println("withdraw amount :"+amtToWithdraw);
        setAccountBalance(getAccountBalance()-amtToWithdraw);
    }
    void deposit(double amtToDeposit){
        System.out.println("depositing amount ..."+amtToDeposit);
        setAccountBalance(getAccountBalance()+amtToDeposit);
    }
}