import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    private Person person;
    private BusStop busStop;

    @Before
    public void before() {
        person = new Person();
        busStop = new BusStop("Hope Street");
    }

    @Test
    public void initialQueueIsZero() {
        assertEquals(0, busStop.getQueue());
    }

    @Test
    public void canAddToQueue() {
        busStop.addPerson(person);
        assertEquals(1, busStop.getQueue());
    }

    @Test
    public void canRemoveFromQueue() {
        busStop.addPerson(person);
        busStop.addPerson(person);
        busStop.addPerson(person);
        busStop.removePerson(person);
        assertEquals(2, busStop.getQueue());
    }
}
