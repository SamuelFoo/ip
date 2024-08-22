package tasks;

public class Event extends Task {
    private final String from, to;

    public Event(String description, String from, String to) {
        super(description);
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return "[E]" + super.toString()
                + String.format(" (from: %s to: %s)", from, to);
    }
}
