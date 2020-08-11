import java.time.LocalDateTime;
import java.util.HashMap;

public class Station {


    private static int counter =  0;
    int stationId;
    String location;
    Bike bike;

    Station(String location){
        this.stationId = counter++;
        this.location = location;

    }


    HashMap<Integer, Bike> storedBikes = new HashMap<>();

    public void addBikes(Bike bikeId){

        int bike = bikeId.getBikeId();
        if(storedBikes.containsKey(bike)){
        System.out.println("This bike is already there");
        }else{
            if(storedBikes.size() < 5){
                storedBikes.put(bike, bikeId);

            }else{
                System.out.println("Too much bikes in this Station");
            }
            System.out.println("Bike with Id " + bike + " ist stored in station " + location);
        }
    }

   private void removeBike(Bike bike){

        int bikeId = bike.getBikeId();
        if(storedBikes.containsKey(bikeId)){
            storedBikes.remove(bikeId);

            System.out.println("Bike "+ bikeId + " is removed from Station" );
        } else{
            System.out.println("Bike "+ bikeId + " is not here!!");
        }
    }

    //HashMap< Bike, Users> rentedBikes = new HashMap<Bike,Users>();
    Users user;

    public void userRent(Bike b , Users u){
        int userId = u.getUserId();
        int bikeId = b.getBikeId();
        Bike.Status s = b.getStatus();
        user = u;

        if(storedBikes.containsKey(bikeId)){
            if(s == Bike.Status.Discarded) {
                System.out.println("This Bike is Discarded");
            }else{
                user.rentBike(b,u);
                //rentedBikes.put(b,u);
                removeBike(b);
                System.out.println("Bike with the Id: " + bikeId + " is rented by User with Id: " + userId + ".");
            }

        } else{
            System.out.println("Bike " + bikeId + " is not here!!");
        }

    }


    public void giveBack(Bike b, Users u){
            user = u;

            user.giveBackBike(b, u);
            //removeBikeFromUser(b);
            addBikes(b);

    }

/*
    private void removeBikeFromUser(Bike b){

        rentedBikes.remove(b);

        if(rentedBikes.containsKey(b)){
            System.out.println("Failure with the remove proces of rentedBikes");
        }else{
            System.out.println("Bike is removed from User List");
        }

    }


 */





    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    public HashMap<Integer, Bike> getStoredBikes() {
        return storedBikes;
    }

    public void setStoredBikes(HashMap<Integer, Bike> storedBikes) {
        this.storedBikes = storedBikes;
    }
}
