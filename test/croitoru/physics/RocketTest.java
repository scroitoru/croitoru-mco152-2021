import org.junit.Assert;
import org.junit.Test;

public class RocketTest {

    @Test
    public void getX() {
        //given - set up variables
        Rocket rocket = new Rocket(71, 35);

        //when - run code that we are testing
        double x = rocket.getX(3);

        //then
        Assert.assertEquals(174.47, x, 0.01);
    }

    @Test
    public void getY() {
        //given - set up variables
        Rocket rocket = new Rocket(71, 35);

        //when - run code that we are testing
        double y = rocket.getY(3);

        //then
        Assert.assertEquals(78.07, y, 0.01);

    }

    @Test
    public void getFlightTime(){
        //given
        Rocket rocket = new Rocket(71, 35);

        //when
        double flightTime = rocket.getFlightTime();

        //then
        Assert.assertEquals(8.311, flightTime, 0.01 );
    }
}