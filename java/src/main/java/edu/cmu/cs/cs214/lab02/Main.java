package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Main {
    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle(2, 3);
//        Circle circle = new Circle(1.5);
//        Renderer renderer1 = new Renderer(2, 3);
//        Renderer renderer2 = new Renderer(circle);
        Shape shape = new Rectangle(2, 3);
        Renderer renderer = new Renderer(shape);

        renderer.draw();
    }
}
