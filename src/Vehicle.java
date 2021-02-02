import java.io.Serializable;


public class Vehicle implements Serializable {

    private String type;
    private int number;
    private int m=0;
    private String mahdi;

    public void returnFavor(){

        System.out.println("I wil return your favor!");


    }


public void meToo(){

    System.out.println("I will return too!!");

}

    public Vehicle(String type, int number){

        this.type = type;
        this.number = number;

    }

    @Override
    public String toString(){

        return "Vehicle [type=" + ", number= "+ number + "]";

    }

}
