import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> people;

    public Bus(String destination) {
        this.destination = destination;
        this.capacity = 5;
        this.people = new ArrayList<>();
    }

    public int getPassengers() {
        return this.people.size();
    }

    public void addPassenger(Person passenger) {
        // if people array length/size is less than 50
        // add passenger
        if(getPassengers() < this.capacity) {
            this.people.add(passenger);
        }
    }

    public void removePassenger(Person passenger) {
        if(getPassengers() != 0) {
            this.people.remove(passenger);
        }
    }

    public void pickUp(BusStop busStop) {
        if(busStop.getQueue() != 0) {
            Person newPassenger = busStop.getPassenger();
            busStop.removePerson(newPassenger);
            this.addPassenger(newPassenger);

        }
    }
}
