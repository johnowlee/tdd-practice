import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MarsRoverTest {

    @Test
    void executeTest1() {
        MarsRover marsRover = new MarsRover();
        marsRover.execute("MMRMMLM");

        Assertions.assertEquals(2, marsRover.xCoordinate());
        Assertions.assertEquals(3, marsRover.yCoordinate());
        Assertions.assertEquals(MarsRover.DIRECTION.N, marsRover.direction());
    }

    @Test
    void executeTest2() {
        MarsRover marsRover = new MarsRover();
        marsRover.execute("MMMMMMMMMM");

        Assertions.assertEquals(0, marsRover.xCoordinate());
        Assertions.assertEquals(0, marsRover.yCoordinate());
        Assertions.assertEquals(MarsRover.DIRECTION.N, marsRover.direction());
    }

    @Test
    void executeTest3() {
        MarsRover marsRover = new MarsRover();
        marsRover.execute("RMMLM");

        Assertions.assertEquals(2, marsRover.xCoordinate());
        Assertions.assertEquals(1, marsRover.yCoordinate());
        Assertions.assertEquals(MarsRover.DIRECTION.N, marsRover.direction());
    }

    @Test
    void executeTest4() {
        MarsRover marsRover = new MarsRover();
        marsRover.execute("RRR");

        Assertions.assertEquals(MarsRover.DIRECTION.W, marsRover.direction());
    }

    @Test
    void executeTest5() {
        MarsRover marsRover = new MarsRover();
        marsRover.execute("MRMMMMMMMMMMMMM");

        Assertions.assertEquals(3, marsRover.xCoordinate());
        Assertions.assertEquals(1, marsRover.yCoordinate());
        Assertions.assertEquals(MarsRover.DIRECTION.E, marsRover.direction());
    }
}

