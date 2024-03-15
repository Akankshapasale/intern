class Shape {
    public double calculateArea(){
        return 0.0;
    }
}
class Circle extends Shape{
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }
}
class Rectangle extends  Shape{
    double h;
    double w;

    public Rectangle(double h, double w){
        this.h=h;
        this.w=w;

    }

    @Override
    public double calculateArea() {
        return h*w;
    }
}
public class Main {
    public static void main(String[] args) {
        Shape[] shapes= new Shape[2];
        shapes[0]=new Circle(6);
        shapes[1]= new Rectangle(2,3);

        for(Shape shape:shapes){
            System.out.println("Area "+shape.calculateArea());
        }
    }
}