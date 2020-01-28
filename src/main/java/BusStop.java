import java.util.ArrayList;

public class BusStop {
    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<>();
    }

    public int getQueue() {
        return this.queue.size();
    }

    public void addPerson(Person person) {
        this.queue.add(person);
    }

    public Person getPassenger() {
        return this.queue.get(1);
    }

    public void removePerson(Person person) {
        if(getQueue() != 0) {
            this.queue.remove(person);
        }
    }
}
