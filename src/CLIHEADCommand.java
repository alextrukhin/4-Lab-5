/**
 * Implements the HTTPCommand interface to execute a HEAD request
 * using the CLIProgram class.
 * ConcreteCommand part of the Command pattern
 */
public class CLIHEADCommand implements HTTPCommand {
    /**
     * The CLIProgram to execute the command on
     */
    private CLIProgram program;
    /**
     * The priority of the command
     */
    public int priority = 3;
    /**
     * Constructor for the CLIHEADCommand
     * @param program the CLIProgram to execute the command on
     * @param priority the priority of the command
     */
    public CLIHEADCommand(CLIProgram program, int priority) {
        this.program = program;
        this.priority = priority;
    }
    /**
     * Constructor for the CLIHEADCommand
     * @param program the CLIProgram to execute the command on
     */
    public CLIHEADCommand(CLIProgram program) {

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
        program.makeHTTPHEADRequest();
    }
}
