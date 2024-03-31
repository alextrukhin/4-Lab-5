/**
 * Browser class to make HTTP GET and POST requests
 * Receiver part of the Command pattern
 */
public class Browser {
    /**
     * Constructor for the Browser
     */
    public Browser() {}
    /**
     * Make an HTTP GET request
     */
    public void makeHTTPGETRequest() {
        System.out.println("Making Browser HTTP GET request");
    }
    /**
     * Make an HTTP POST request
     */
    public void makeHTTPPOSTRequest() {
        System.out.println("Making Browser HTTP POST request");
    }
}
