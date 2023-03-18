/**
 * Car
 */
public class Car {

    public int gas;
    public int totalGasCapacity = 10;

    Car(){
        this.gas = 10;
    }

    // Add a 'game over' message to your car class that is displayed when the gas reaches zero.
    public void noMoreGas(){
        if(gas<=0){
            System.out.println("game over");
        }
    }
}