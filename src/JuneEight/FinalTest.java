package JuneEight;

public class FinalTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        c1.showCircle();
    }
}

class Circle{
    final float PI = 3.14f;
    float radius;
    Circle(float r){
        radius=r;
    }
    void showCircle(){
        float area = PI * radius * radius;
        System.out.println("area of circle of radius "+radius +"is "+area);
    }
}
