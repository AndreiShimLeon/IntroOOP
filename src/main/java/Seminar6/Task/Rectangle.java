package Seminar6.Task;

public class Rectangle {
    public double height;
    public double width;
}

class AreaCalculator{
    public double calculateArea(Rectangle rectangle){
        return rectangle.height*rectangle.width;
    }
}
