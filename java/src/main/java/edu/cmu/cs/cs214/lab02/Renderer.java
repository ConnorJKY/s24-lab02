package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;
import org.w3c.dom.css.Rect;

public class Renderer<Shape> {
    //    private Rectangle rectangle;
    private Shape shape;

    Renderer(Shape shape){
        this.shape = shape;
    }
    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }
//    public double hei, wid;
    
//    Renderer(double h, double l) {
//        this.hei = h;
//        this.wid = l;
//    }

//    Renderer(Rectangle rectangle){
//        this.hei = rectangle.height;
//        this.wid = rectangle.width;
//    }
//    public void setRectangle(Rectangle rectangle){
//        this.rectangle = rectangle;
//    }
//
//    public Rectangle getRectangle(){
//        return this.rectangle;
//    }
    public void draw() {
        double area = 0.0;
        if(this.shape instanceof Rectangle) {
            area = ((Rectangle) this.shape).getArea();
        }
        if(this.shape instanceof Circle) {
            area = ((Circle) this.shape).getArea();
        }
        // assume implementation

        System.out.println("Shape printed\n" + "Its area is " + area);
    }
}
