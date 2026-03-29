package vit.devops.macse639.Project;

public class Main {
    public static void main(String[] args) {

        Window window = new Window("Paint Canvas");
        window.open();

        Circle circle = new Circle(5.0f, new Point(100, 100));
        Rectangle rect = new Rectangle(new Point(10, 10), 80, 60);
        Polygon poly = new Polygon(new Point[]{
            new Point(0, 0), new Point(50, 0), new Point(25, 40)
        });

        window.addShape(circle);
        window.addShape(rect);
        window.addShape(poly);
        window.display();

        window.handleEvent(new Event("CLICK", 150, 200));

        System.out.println("Circle area: " + circle.area(5.0f));
        System.out.println("Circle circumference: " + circle.circumference());

        ConsoleWindow console = new ConsoleWindow();
        console.open();
        console.log("Application started");

        DrawingContext ctx = new DrawingContext(1024, 768);
        ctx.setPoint(100, 200);
        ctx.clearScreen();

        DialogBox dialog = new DialogBox("Save", "Save your work?");
        dialog.showMessage();
        dialog.submit("my_drawing");

        window.close();
    }
}