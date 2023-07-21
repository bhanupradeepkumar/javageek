package codechef.basic;
import java.util.Scanner;

public class CandyWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
int T = sc.nextInt();
while(T--!=0){
    int n = sc.nextInt();
    System.out.println((n%3==0)?"yes":"no");
}
    }
}
