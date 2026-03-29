package vit.devops.macse639.Project;

public class DialogBox extends Window {
    private String message;

    public DialogBox(String title, String message) {
        super(title, 400, 200);
        this.message = message;
    }

    public void showMessage() {
        System.out.println("Dialog: " + title + " - " + message);
    }

    public void submit(String inputData) {
        System.out.println("Submitted: " + inputData);
        close();
    }

    public String getMessage() { return message; }
}