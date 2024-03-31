public class Main {
    public static void main(String[] args) {
        Browser browser = new Browser();
        CLIProgram cliProgram = new CLIProgram();

        CLIGETCommand cliGETCommand = new CLIGETCommand(cliProgram);
        CLIHEADCommand cliHEADCommand = new CLIHEADCommand(cliProgram, 2);
        CLIHEADCommand cliHEADCommand2 = new CLIHEADCommand(cliProgram);
        BrowserGETCommand browserGETCommand = new BrowserGETCommand(browser, 1);
        BrowserPOSTCommand browserPOSTCommand = new BrowserPOSTCommand(browser);

        RequestInvoker requestInvoker = new RequestInvoker();
        requestInvoker.addRequest(cliGETCommand);
        requestInvoker.addRequest(cliHEADCommand);
        requestInvoker.addRequest(cliHEADCommand2);
        requestInvoker.removeRequest(cliHEADCommand2);
        requestInvoker.addRequest(browserGETCommand);
        requestInvoker.addRequest(browserPOSTCommand);

        requestInvoker.executeRequests();
    }
}