package vit.devops.macse639.Project;

public abstract class Shape {
    public abstract void draw();
    public abstract void erase();
    public abstract void move(int dx, int dy);
    public abstract void resize(double factor);
}