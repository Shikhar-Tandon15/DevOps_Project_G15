package vit.devops.macse639.Project;

public class Rectangle extends Shape {
    private Point topLeft;
    private int width;
    private int height;

    public Rectangle(Point topLeft, int width, int height) {
        this.topLeft = topLeft;
        this.width   = width;
        this.height  = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public void draw()  { System.out.println("Drawing Rectangle " + width + "x" + height); }
    public void erase() { System.out.println("Erasing Rectangle"); }
    public void move(int dx, int dy) { topLeft.x += dx; topLeft.y += dy; }
    public void resize(double f) {
        width  = (int)(width * f);
        height = (int)(height * f);
    }
}