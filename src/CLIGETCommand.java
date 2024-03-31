/**
 * Implements the HTTPCommand interface to execute a GET request
 * using the CLIProgram class.
 * ConcreteCommand part of the Command pattern
 */
public class CLIGETCommand implements HTTPCommand {
    /**
     * The CLIProgram to execute the command on
     */
    private CLIProgram program;
    /**
     * The priority of the command
     */
    public int priority = 3;
    /**
     * Constructor for the CLIGETCommand
     * @param program the CLIProgram to execute the command on
     * @param priority the priority of the command
     */
    public CLIGETCommand(CLIProgram program, int priority) {
        this.program = program;
        this.priority = priority;
    }
    /**
     * Constructor for the CLIGETCommand
     * @param program the CLIProgram to execute the command on
     */
    public CLIGETCommand(CLIProgram program) {
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
