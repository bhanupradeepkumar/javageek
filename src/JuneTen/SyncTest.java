package JuneTen;

public class SyncTest {
    public static void main(String[] args) throws InterruptedException {

        Account a1 = new Account(2182,"Praadeep",3000);

        Transaction t1 = new Transaction(2000,"ramu",a1);
        Transaction t2 = new Transaction(5000,"madhu",a1);

        t1.start();
//        t1.join();
        t2.start();


    }
}

class Transaction extends Thread{
        float amt;
        String tellerName;
        Account accObj;

        Transaction(float amt,String tellerName,Account accObj){
            this.amt=amt;
            this.tellerName=tellerName;
            this.accObj=accObj;

        }
        public void run(){
            accObj.deposit(amt,tellerName);
        }
}

class Account{
    private int accountNumber;
    private String accountHolder;
    private float balance;

    Account(int accountNumber,String accountHolder,float balance){
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    public float getBalance(){
        return balance;
    }
    public void setBalance(float balance){
        this.balance=balance;
    }

    public void deposit(float amt,String tellerName){
        System.out.println("1.hello");
        System.out.println("iam sbi");
        System.out.println("icici");

        synchronized (this){
            float temp;
            temp = getBalance();
            System.out.println(tellerName+"getting balance"+temp);
            System.out.println(tellerName+"trying to set the balance");
            temp = temp+amt;
            setBalance(temp);
            System.out.println(tellerName+"setting the balance"+temp);
            System.out.println("4.bye");
            System.out.println("iam yolo");
            System.out.println("kashmir");
        }
    }
}