package vit.devops.macse639.Project;

public class Frame {
    protected String title;
    protected int width;
    protected int height;

    public Frame(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
    }

    public String getTitle() { return title; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }
}