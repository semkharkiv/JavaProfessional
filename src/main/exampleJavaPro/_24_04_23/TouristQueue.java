package main.exampleJavaPro._24_04_23;

import java.util.LinkedList;
import java.util.Queue;

public class TouristQueue {
    private Queue<String> queue;
    private int maxSize;

    public Queue<String> getQueue() {
        return queue;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public TouristQueue(int maxSize) {
        this.queue = new LinkedList<String>();
        this.maxSize = maxSize;
    }
    public boolean addTourRequest(String request) {
        if (queue.size() < maxSize) {
            queue.add(request);
            System.out.println("Request " + request + "  added");
            return true;
        } else {
            System.out.println("Queue is full. Please wait and repeat your request later.");
            return false;
        }
    }
    public void processRequest() {
        if (!queue.isEmpty()){
            String requestDone = queue.poll();
            System.out.println("request " + requestDone + " is done");
        }else {
            System.out.println("List of request is empty");
        }

    }
}
