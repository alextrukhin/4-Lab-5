/**
 * Implements the HTTPCommand interface to execute a POST request
 * on the Browser program.
 * ConcreteCommand part of the Command pattern
 */
public class BrowserPOSTCommand implements HTTPCommand {
    /**
     * The Browser program to execute the command on
     */
    private Browser program;
    /**
     * The priority of the command
     */
    public int priority = 3;
    /**
     * Constructor for the BrowserPOSTCommand
     * @param program the Browser program to execute the command on
     * @param priority the priority of the command
     */
    public BrowserPOSTCommand(Browser program, int priority) {
        this.program = program;
        this.priority = priority;
    }
    /**
     * Constructor for the BrowserPOSTCommand
     * @param program the Browser program to execute the command on
     */
    public BrowserPOSTCommand(Browser program) {
        this(program, 3);
    }
    /**
     * Get the priority of the command
     * @return the priority of the command
     */
    public int GetPriority() {
        return priority;
    }
    /**
     * Execute the command
     */
    public void execute() {
        program.makeHTTPPOSTRequest();
    }
}
