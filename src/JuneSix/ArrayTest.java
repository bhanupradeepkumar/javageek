package JuneSix;

public class ArrayTest {
    public static void main(String[] args) {
        int score[] = {10,100,45,80,95};
        int marks[] = new int[7];

        for(int i=0;i<score.length;i++){
            System.out.print(score[i]+" ");
        }
        System.out.println();
for(int i:score){
    System.out.println(i);
}
        marks[0] = 98;
        marks[1] = 28;
        marks[3] = 67;

        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }

}
