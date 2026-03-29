package vit.devops.macse639.Project;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {

    @Test
    void testCircleArea() {
        Circle c = new Circle(5.0f, new Point(0, 0));
        assertEquals(Math.PI * 25, c.area(5.0f), 0.001);
    }

    @Test
    void testCircleCircumference() {
        Circle c = new Circle(7.0f, new Point(0, 0));
        assertEquals(2 * Math.PI * 7, c.circumference(), 0.001);
    }

    @Test
    void testCircleSetRadius() {
        Circle c = new Circle(3.0f, new Point(0, 0));
        c.setRadius(10.0f);
        assertEquals(Math.PI * 100, c.area(10.0f), 0.001);
    }

    @Test
    void testRectangleArea() {
        Rectangle r = new Rectangle(new Point(0, 0), 10, 5);
        assertEquals(50.0, r.area(), 0.001);
    }

    @Test
    void testRectanglePerimeter() {
        Rectangle r = new Rectangle(new Point(0, 0), 4, 6);
        assertEquals(20.0, r.perimeter(), 0.001);
    }

    @Test
    void testPolygonNotNull() {
        Point[] pts = { new Point(0,0), new Point(5,0), new Point(2,4) };
        Polygon p = new Polygon(pts);
        assertNotNull(p);
    }

    @Test
    void testCircleMoveUpdatesCenter() {
        Circle c = new Circle(5.0f, new Point(10, 10));
        c.move(5, 5);
        assertEquals(15, c.getCenter().x);
        assertEquals(15, c.getCenter().y);
    }
}