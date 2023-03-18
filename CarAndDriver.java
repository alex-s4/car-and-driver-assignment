/**
 * CarAndDriver
 */
public class CarAndDriver {

    public static void main(String[] args) {
        
        Driver driver1 = new Driver();

        // Call the drive method four times, the boost method once, and the refuel method three times
        driver1.drive();
        driver1.drive();
        driver1.drive();
        driver1.drive();

        driver1.boost();

        driver1.refuel();
        driver1.refuel();
        driver1.refuel(); 
    }
}