package vit.devops.macse639.Project;

import java.util.ArrayList;
import java.util.List;

public class Window extends Frame {
    private boolean isOpen;
    private int posX;
    private int posY;
    private List<Shape> shapes;

    public Window(String title, int width, int height) {
        super(title, width, height);
        this.isOpen = false;
        this.shapes = new ArrayList<>();
    }

    public Window(String title) {
        this(title, 800, 600);
    }

    public void open() {
        isOpen = true;
        System.out.println("Window opened: " + title);
    }

    public void close() {
        isOpen = false;
        System.out.println("Window closed: " + title);
    }

    public void move(int x, int y) {
        this.posX = x;
        this.posY = y;
        System.out.println("Window moved to " + x + ", " + y);
    }

    public void display() {
        System.out.println("Window: " + title);
        for (Shape s : shapes) {
            s.draw();
        }
    }

    public void handleEvent(Event e) {
        System.out.println("Event received: " + e.getType());
    }

    public void addShape(Shape s) {
        shapes.add(s);
    }

    public List<Shape> getShapes() { return shapes; }
    public boolean isOpen() { return isOpen; }
}