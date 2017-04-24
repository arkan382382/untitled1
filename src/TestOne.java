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

        float f1 = 123.5f;
        double f2 = 123.6;
        float f3 = (float) 123.7;
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

        double d1 = 122.2;
        double d2 = 122.2d;
        System.out.println(d1);
        System.out.println(d2);

        float pi = 3.14_15f;
        System.out.println(pi);                         //3.1415
        long creditCardNr = 1234_4523_2231_0002L;
        System.out.println(creditCardNr);               //without '_'
        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

        // arrays
        int []anArray = new int[10];                    // declares and allocates memory for 10 integers
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

interface vehicle{
    void changeGear();

    void speedUP();
}

 abstract class Car implements vehicle{
    private int speed;
    private int gear;


    public void changeGear(int newGear) {
        gear = newGear;
    }

    public void speedUP(int newSpeed) {
        speed = newSpeed;
    }
}