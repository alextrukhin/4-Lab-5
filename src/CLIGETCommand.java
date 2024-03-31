public class CLIGETCommand implements HTTPCommand {
    private CLIProgram program;
    public int priority = 3;
    public CLIGETCommand(CLIProgram program, int priority) {
        this.program = program;
        this.priority = priority;
    }
    public CLIGETCommand(CLIProgram program) {
        this(program, 3);
    }
    public int GetPriority() {
        return priority;
    }
    public void execute() {
        program.makeHTTPGETRequest();
    }
}
