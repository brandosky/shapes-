package oop.parcial2.shapes;

public class Shape {
public int Area;
public int Perimeter;
public int Sides;
private String name;
public Shape(String name){
    this.name=name;
}
    public double getArea(){
        return 0;
    }
    public double getPerimeter(){
        return 0;
    }
    public String getName(){
     return name;
    }

    public int getSidesCount(){
        return Sides;
    }
}
