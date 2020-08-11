package menu;

public class Bike {

    private static int counter = 0;
    int bikeId;
    String color;
    Status status;



    enum Status{
        CanBeRented,
        CanNotBeRented,
        InService,
        Discarded
    }


    Bike(String color, Status status ){
        this.bikeId = counter++;
        this.color = color;
       this.status =  status;
    }




    public int getBikeId() {
        return bikeId;
    }

    public void setBikeId(int bikeId) {
        this.bikeId = bikeId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
