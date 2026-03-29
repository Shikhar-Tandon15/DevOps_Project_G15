package vit.devops.macse639.Project;

public class DrawingContext extends Window {
    private int pointX;
    private int pointY;

    public DrawingContext(int horizontalSize, int verticalSize) {
        super("DrawingContext", horizontalSize, verticalSize);
        this.pointX = 0;
        this.pointY = 0;
    }

    public void setPoint(int x, int y) {
        this.pointX = x;
        this.pointY = y;
        System.out.println("Point set to " + x + ", " + y);
    }

    public void clearScreen() {
        System.out.println("Screen cleared");
    }

    public int getVerticalSize() { return height; }
    public int getHorizontalSize() { return width; }
}