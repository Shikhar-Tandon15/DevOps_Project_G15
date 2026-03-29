package vit.devops.macse639.Project;

public class Circle extends Shape {
    private float radius;
    private Point center;

    public Circle(float radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public double area(float radius) {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public void setCenter(Point center) { this.center = center; }
    public void setRadius(float radius) { this.radius = radius; }
    public Point getCenter() { return center; }
    public float getRadius() { return radius; }

    public void draw()   { System.out.println("Drawing Circle r=" + radius); }
    public void erase()  { System.out.println("Erasing Circle"); }
    public void move(int dx, int dy) { center.x += dx; center.y += dy; }
    public void resize(double f) { radius *= f; }
}