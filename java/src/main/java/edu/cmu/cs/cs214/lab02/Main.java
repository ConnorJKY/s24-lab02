package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        Circle circle = new Circle(1.5);
        Renderer renderer1 = new Renderer(rectangle);
        Renderer renderer2 = new Renderer(circle);

        renderer1.draw();
        renderer2.draw();
    }
}
