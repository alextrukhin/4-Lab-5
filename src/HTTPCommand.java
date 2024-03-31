/**
 * HTTPCommand interface
 * Command part of the Command pattern
 */
public interface HTTPCommand {
    /**
     * Get the priority of the command
     * @return the priority of the command
     */
    public int GetPriority();
    /**
     * Execute the command
     */
    public void execute();
}
