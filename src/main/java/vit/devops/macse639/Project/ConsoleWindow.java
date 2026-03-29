package vit.devops.macse639.Project;

public class ConsoleWindow extends Window {

    public ConsoleWindow() {
        super("Console", 640, 300);
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}