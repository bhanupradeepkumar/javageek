package codechef.arrays;
import java.util.Scanner;

public class PracticePerfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weeks[] = new int[4];
        int workedout =0;
        for(int i=0;i<4;i++) {
            weeks[i] = sc.nextInt();

            if(weeks[i]>=10){
                workedout++;
            }
        }
        System.out.println(workedout);
    }

}
