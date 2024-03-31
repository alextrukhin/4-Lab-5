import java.util.ArrayList;
import java.util.List;

public class RequestInvoker {
    private static int[] priorities = {1, 2, 3};
    private final List<HTTPCommand> requests = new ArrayList<HTTPCommand>();
    public void addRequest(HTTPCommand request) {
        requests.add(request);
    }
    public void removeRequest(HTTPCommand request) {
        requests.remove(request);
    }
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
