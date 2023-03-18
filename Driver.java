public class Driver extends Car{
    


    public void drive(){
        if(gas<=0){
            System.out.println("You're not allowed to use drive, you have no gas");
        } else{
            super.gas--;
            System.out.println("You are driving *broom*");
            System.out.println(String.format("Gas remaining: %d/%d", super.gas, super.totalGasCapacity));
            super.noMoreGas();
        }
        
    }

    public void boost(){
        if(gas<3){
            System.out.println("You're not allowed to use booster, you have insufficient gas");
        } else {
            super.gas-=3;
            System.out.println("You are using the booster *BROOOOOOM!*");
            System.out.println(String.format("Gas remaining: %d/%d", super.gas, super.totalGasCapacity));
            super.noMoreGas();
        }
    }

    public void refuel(){
        if(gas>8){
            System.out.println("You're not allowed to refuel, your tank is about to be full");
        } else {
            super.gas+=2;
            System.out.println("You are refueling. Ang mahal ng gas! !@#$%^&*");
            System.out.println(String.format("Gas remaining: %d/%d", super.gas, super.totalGasCapacity));
        }
    }
}
