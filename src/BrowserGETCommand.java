/**
 * Command class for making a GET request in the browser.
 * This class is used to encapsulate the GET request functionality
 * in a command object.
 * ConcreteCommand part of the Command pattern
 */
public class BrowserGETCommand implements HTTPCommand {
    /**
     * The Browser program to execute the command on
     */
    private Browser program;
    /**
     * The priority of the command
     */
    public int priority = 3;
    /**
     * Constructor for the BrowserGETCommand
     * @param program the Browser program to execute the command on
     * @param priority the priority of the command
     */
    public BrowserGETCommand(Browser program, int priority) {
        this.program = program;
        this.priority = priority;
    }
    /**
     * Constructor for the BrowserGETCommand
     * @param program the Browser program to execute the command on
     */
    public BrowserGETCommand(Browser program) {
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
        program.makeHTTPGETRequest();
    }
}
