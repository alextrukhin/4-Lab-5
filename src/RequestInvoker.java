import java.util.ArrayList;
import java.util.List;

/**
 * RequestInvoker is a class that is responsible for invoking the requests in the order of their priority.
 * Invoker part of the Command pattern.
 */
public class RequestInvoker {
    /**
     * priorities is an array of integers that represent the order of priority of the requests.
     */
    private static final int[] priorities = {1, 2, 3};
    /**
     * requests is a list of HTTPCommand objects that represent the requests to be executed.
     */
    private final List<HTTPCommand> requests = new ArrayList<HTTPCommand>();
    /**
     * Constructor for the RequestInvoker class.
     */
    public RequestInvoker() {}
    /**
     * addRequest is a method that adds a request to the list of requests.
     * @param request is an HTTPCommand object that represents the request to be added.
     */
    public void addRequest(HTTPCommand request) {
        requests.add(request);
    }
    /**
     * removeRequest is a method that removes a request from the list of requests.
     * @param request is an HTTPCommand object that represents the request to be removed.
     */
    public void removeRequest(HTTPCommand request) {
        requests.remove(request);
    }
    /**
     * executeRequests is a method that executes the requests in the order of their priority.
     */
    public void executeRequests() {
        for (int priority : priorities) {
            for (HTTPCommand request : requests) {
                if (request.GetPriority() == priority) {
                    request.execute();
                }
            }
        }
    }
}
