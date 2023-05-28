package main.exampleJavaPro._24_04_23;

public class TouristicApp {
    public static void main(String[] args) {
        TouristQueue tq = new TouristQueue(5);

        tq.addTourRequest("Request 1");
        tq.addTourRequest("Request 2");
        tq.addTourRequest("Request 3");

        tq.processRequest();
        tq.processRequest();
        tq.processRequest();
        tq.processRequest();

        tq.addTourRequest("Request 4");
        tq.addTourRequest("Request 5");
        tq.addTourRequest("Request 6");
        tq.addTourRequest("Request 7");
        tq.addTourRequest("Request 8");
        tq.addTourRequest("Request 9");
    }
}
