public class BrowserGETCommand implements HTTPCommand {
    private Browser program;
    public int priority = 3;
    public BrowserGETCommand(Browser program, int priority) {
        this.program = program;
        this.priority = priority;
    }
    public BrowserGETCommand(Browser program) {
        this(program, 3);
    }
    public int GetPriority() {
        return priority;
    }
    public void execute() {
        program.makeHTTPGETRequest();
    }
}
