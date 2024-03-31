/**
 * This class is a simple representation of a CLI program that can make HTTP GET and HEAD requests.
 * Receiver part of the Command pattern
 */
public class CLIProgram {
    /**
     * Constructor for the CLIProgram
     */
    public CLIProgram() {}
    /**
     * Make an HTTP GET request
     */
    public void makeHTTPGETRequest() {
        System.out.println("Making CLI HTTP GET request");
    }
    /**
     * Make an HTTP HEAD request
     */
    public void makeHTTPHEADRequest() {
        System.out.println("Making CLI HTTP HEAD request");
    }
}
