import java.util.*;
class AreaOfCircle {
    private
    double radius;


public AreaOfCircle(double radius){
    this.radius=radius;
    displayDetails(radius);
}
void displayDetails(double radius){
    System.out.println("Area of circle : " + 3.14*radius*radius);
    System.out.println("Circumference of circle : " + 2*3.14*radius);
}
}
public class Circle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double radius=sc.nextDouble();
        AreaOfCircle circleOne=new AreaOfCircle(radius);
    }
}