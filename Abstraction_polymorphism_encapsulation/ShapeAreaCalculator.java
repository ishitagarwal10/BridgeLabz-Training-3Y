//Parent class
abstract class Shape{
    //abstract method
    abstract double calculateArea();

}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    @Override
    double calculateArea(){
        return Math.PI * radius * radius;
    }
}
//Concrete class
class Rectangle extends Shape{
    double length;
    double breadth;

    public Rectangle(double length,double breadth) {
        this.length=length;
        this.breadth=breadth;

    }
    @Override
    double calculateArea(){
        return length * breadth;

    }

    
}
public class ShapeAreaCalculator{
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4,5);
        System.out.println("Area of circle"+ c.calculateArea());
        System.out.println("Area of Rectangle" + r.calculateArea());
    }
} 