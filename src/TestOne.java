/**
 * Created by arkan on 23.04.2017.
 */
public class TestOne {
    public static void  main(String[] args){
        System.out.println("test - working?");
        System.out.println("after changes");
        //problem with github updates

        Bicycle firstBicycle = new Bicycle();
        firstBicycle.SetGear(2);
        firstBicycle.ShowDetails();

    }
}

class Bicycle{
    private int gear;

    void SetGear(int val){
        gear = val;
    }
    void ShowDetails(){
        System.out.print(gear);
    }
}