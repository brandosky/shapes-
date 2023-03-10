package oop.parcial2.shapes;

public class Triangle extends Shape {

    private double base;
    private double height;

 public Triangle(){
     super("triangulo▲");
 }
 public Triangle(double base,double height){
     this();
     this.base=base;
     this.height=height;
 }

public double getArea(){

    return base*height/2;
}
public double getPerimeter(){

    return 2*height+base;
}
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public int getSidesCount(){
        return 3;
    }
}
