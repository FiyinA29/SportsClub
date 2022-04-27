package tasks;

public class Task {

    public String description;
    public boolean isComplete;

    public Task (String description) {
        this.description = description;
        this.isComplete = false;
    }

    public String getDescription() {
        return description;
    }

    public void setIsComplete(boolean complete) {
        this.isComplete = complete;
    }
}