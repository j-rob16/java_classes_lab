import org.junit.Before;
import org.junit.Test;

import java.util.Queue;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busStop;
    Person person;

    @Before
    public void setUp() {
        busStop = new BusStop("CodeClan");
        person = new Person();
    }

    @Test
    public void busStopHasName() {
        assertEquals("CodeClan", busStop.getName());
    }

    @Test
    public void
}
