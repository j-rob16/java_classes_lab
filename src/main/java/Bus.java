import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPassengerNumbers() {
        return passengers.size();
    }

    public void addPassenger(Person newPassenger) {
        if (capacity > passengers.size()) {
        this.passengers.add(newPassenger);
        }
    }

    public void removePassenger() {
        this.passengers.remove(0);
    }
}

