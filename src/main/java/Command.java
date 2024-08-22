public enum Command {
    LIST("list"),
    MARK("mark"),
    UNMARK("unmark"),
    BYE("bye"),
    TODO("todo"),
    DEADLINE("deadline"),
    EVENT("event");

    private final String name;

    private Command(String name) {
        this.name = name;
    }

    public boolean equalsName(String name) {
        return this.name.equals(name);
    }

    public String toString() {
        return this.name;
    }
}
