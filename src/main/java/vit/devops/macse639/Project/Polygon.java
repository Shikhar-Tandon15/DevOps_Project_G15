package vit.devops.macse639.Project;

public class Polygon extends Shape {
    private Point[] points;

    public Polygon(Point[] points) {
        this.points = points;
    }

    public void draw() {
        System.out.println("Drawing Polygon with " + points.length + " vertices");
    }

    public void erase() {
        System.out.println("Erasing Polygon");
    }

    public void move(int dx, int dy) {
        for (Point p : points) {
            p.x += dx;
            p.y += dy;
        }
    }

    public void resize(double f) {
        for (Point p : points) {
            p.x = (int)(p.x * f);
            p.y = (int)(p.y * f);
        }
    }
}