package task4;

public class Circle implements Shape{
    private double area;
    public Circle(double area){
        this.area = area;
    }


    @Override
    public double getArea() {
        return area*3.14;
    }
}
