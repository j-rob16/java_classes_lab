import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;

    @Before
    public void before() {
        bus = new Bus("Glasgow", 30);
        person = new Person();
    }

    @Test
    public void hasDestination() {
        assertEquals("Glasgow", bus.getDestination());
    }

    @Test
    public void hasCapacity() {
        assertEquals(30, bus.getCapacity());
    }

    @Test
    public void hasNoPassengersAtStart() {
        assertEquals(0, bus.getPassengerNumbers());
    }

    @Test
    public void addOnePassengerToBus() {
        bus.addPassenger(person);
        assertEquals(1, bus.getPassengerNumbers());
    }

    @Test
    public void addTooManyPassengers() {
        Bus smallBus = new Bus("Edinburgh", 3);
        smallBus.addPassenger(person);
        smallBus.addPassenger(person);
        smallBus.addPassenger(person);
        smallBus.addPassenger(person);
        assertEquals(3, smallBus.getPassengerNumbers());
    }

    @Test
    public void removePassengerFromBus() {
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(0, bus.getPassengerNumbers());
    }
}
