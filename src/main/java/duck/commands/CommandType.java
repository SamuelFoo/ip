package duck.commands;

public enum CommandType {
    LIST("list"),
    FIND("find"),
    MARK("mark"),
    UNMARK("unmark"),
    DELETE("delete"),
    BYE("bye"),
    TODO("todo"),
    DEADLINE("deadline"),
    EVENT("event"),
    DOAFTER("do-after");

    private final String name;

    private CommandType(String name) {
        this.name = name;
    }

    /**
     * Check if the name of the command (its String form)
     * equals the given String.
     *
     * @param str String to be compared against.
     * @return a boolean
     */
    public boolean equalsName(String str) {
        return this.name.equals(str);
    }

    /**
     * Returns the name of the command.
     *
     * @return the name of the command
     */
    public String toString() {
        return this.name;
    }
}
