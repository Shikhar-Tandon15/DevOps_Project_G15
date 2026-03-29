package vit.devops.macse639.Project;

public class Event {
    private String type;
    private int x;
    private int y;

    public Event(String type, int x, int y) {
        this.type = type;
        this.x = x;
        this.y = y;
    }

    public Event(String type) {
        this(type, 0, 0);
    }

    public String getType() { return type; }
    public int getX() { return x; }
    public int getY() { return y; }
}