/**
 * Created by arkan on 23.04.2017.
 */
public class TestOne {
    public static void  main(String[] args){
        System.out.println("test - working?");
        System.out.println("after changes");
        //problem with github updates

        Bicycle firstBicycle = new Bicycle();
        firstBicycle.setGear(2);
        firstBicycle.showDetails();

        MountainBike secondBicycle = new MountainBike();
        secondBicycle.setGear(3);
        secondBicycle.setVelocity(50);
        secondBicycle.setTirePresure(2);
        secondBicycle.showDetails();
        secondBicycle.showTirePresure();
    }
}

class Bicycle{
    private int gear;
    private int velocity;

    void setGear(int val){
        gear = val;
    }
    void setVelocity(int val2){
        velocity = val2;
    }
    void showDetails(){
        System.out.print(gear + " " + velocity);
    }
}

class MountainBike extends Bicycle{
    private int tirePresure;

    void setTirePresure(int val3){
        tirePresure = val3;
    }
    void showTirePresure(){
        System.out.print(tirePresure);
    }
}