public class CLIHEADCommand implements HTTPCommand {
    private CLIProgram program;
    public int priority = 3;
    public CLIHEADCommand(CLIProgram program, int priority) {
        this.program = program;
        this.priority = priority;
    }
    public CLIHEADCommand(CLIProgram program) {

        this(program, 3);
    }
    public int GetPriority() {
        return priority;
    }
    public void execute() {
        program.makeHTTPHEADRequest();
    }
}
