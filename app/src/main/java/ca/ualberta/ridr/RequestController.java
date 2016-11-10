package ca.ualberta.ridr;

/**
 * Created by jferris on 22/10/16.
 * Worked on by Marc-O and Kristy on 03/11/2016
 */
public class RequestController {
    RequestController(){}
    private Request request;

    public void createRequest(Rider rider, String pickup, String dropoff){
        request = new Request(rider, pickup, dropoff);
        rider.addRequest(request);
    }

    public float getFareEstimate(float distance){
        return request.estimateFare(distance);
    }
}
