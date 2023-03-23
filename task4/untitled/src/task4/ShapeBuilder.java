package task4;

import java.util.ArrayList;

public class ShapeBuilder {
    private ArrayList<Shape> shapes;
    public ShapeBuilder(){

        //this.shapes = new ArrayList<Shape>();
        this.shapes = new ArrayList<Shape>();
        Circle circle1 = new Circle(1);
        Rectangle rectangle1 = new Rectangle(1);
        Circle circle2 = new Circle(2);
        Rectangle rectangle2 = new Rectangle(2);
        shapes.add(circle1);
        shapes.add(rectangle1);
        shapes.add(circle2);
        shapes.add(rectangle2);


    }


    public double getTotalArea(){
        double result = 0;
        for(int i = 0;i <shapes.size();++i){
            result+=shapes.get(i).getArea();
        }
        return result;
    }


}
