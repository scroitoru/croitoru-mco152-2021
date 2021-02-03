//Class to calculate rocket time land

public class Rocket {

    private final double velocity;
    private final double angle;

    //constructor
    public Rocket(double velocity, double angle) {
        this.velocity = velocity;
        this.angle = Math.toRadians(angle);
    }

    /**
     *
     * @param time
     * @return the X location of the rocket at the specified time
     */
    public double getX(double time){
        double xVelocity = Math.cos(angle) * velocity;
        double x = xVelocity * time;
        return x;
    }

    /**
     *
     * @param time
     * @return the Y location of the rocket at the specified time
     */
    public double getY(double time){
        final double GRAVITY = 9.8;
        double yVelocity = Math.sin(angle) * velocity;
        double y = yVelocity * time - 0.5 * GRAVITY * time * time;
        return y;
    }

    //HW:
    // write method that will tell what time rocket will land back to earth
    //you know its back to earth when y = 0

    /**
     *
     * @return time in seconds that the rocket lands
     */
    public double getFlightTime(){
        final double GRAVITY = 9.8;
        double yVelocity = Math.sin(angle) * velocity; //40.7239
        double flightTime = yVelocity/ (0.5 * GRAVITY);
        return flightTime;
    }

}
