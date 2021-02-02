import java.io.Serializable;


public class Vehicle implements Serializable {

    private String type;
    private int number;
    private int m;
    private String mahdi;



    public Vehicle(String type, int number){

        this.type = type;
        this.number = number;

    }

    @Override
    public String toString(){

        return "Vehicle [type=" + ", number= "+ number + "]";

    }

}
