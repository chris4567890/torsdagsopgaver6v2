package task4;

public class Rectangle implements Shape{
    private double area;
    public Rectangle(double area){
        this.area = area;
    }

    @Override
    public double getArea(){
        return area*area;
    }

}
