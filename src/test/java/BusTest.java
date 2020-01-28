import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before() {
        bus = new Bus("Glasgow");
        person = new Person();
        busStop = new BusStop("Hope Street");
        busStop.addPerson(person);
        busStop.addPerson(person);
        busStop.addPerson(person);

    }

    @Test
    public void passengersIsEmptyAtStart() {
        assertEquals(0, bus.getPassengers());
    }

    @Test
    public void canAddPassengerLessThanCapacity() {
        bus.addPassenger(person);
        assertEquals(1, bus.getPassengers());
    }

    @Test
    public void cannotAddPassengerGreaterThanCapacity() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(5, bus.getPassengers());
    }

    @Test
    public void removePassengerFromBus() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(2, bus.getPassengers());
    }

    @Test
    public void removePassengerNoPassengers() {
        bus.removePassenger(person);
        assertEquals(0, bus.getPassengers());
    }

    @Test
    public void canPickUpPerson() {
        bus.pickUp(busStop);
        bus.pickUp(busStop);
        assertEquals(2, bus.getPassengers());
    }

}
