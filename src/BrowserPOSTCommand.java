public class BrowserPOSTCommand implements HTTPCommand {
    private Browser program;
    public int priority = 3;
    public BrowserPOSTCommand(Browser program, int priority) {
        this.program = program;
        this.priority = priority;
    }
    public BrowserPOSTCommand(Browser program) {
        this(program, 3);
    }
    public int GetPriority() {
        return priority;
    }
    public void execute() {
        program.makeHTTPPOSTRequest();
    }
}
