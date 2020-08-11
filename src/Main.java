import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Bike bike1 = new Bike("red", Bike.Status.CanBeRented);
        Bike bike2 = new Bike("red", Bike.Status.CanNotBeRented);
        Bike bike3 = new Bike("brown", Bike.Status.InService);
        Bike bike4 = new Bike("green", Bike.Status.Discarded);
        Bike bike5 = new Bike("blue", Bike.Status.CanBeRented);
        Bike bike6 = new Bike("black", Bike.Status.CanBeRented);
        Bike bike7 = new Bike("white", Bike.Status.CanNotBeRented);
        Bike bike8 = new Bike("brown", Bike.Status.CanBeRented);
        Bike bike9 = new Bike("black", Bike.Status.CanBeRented);

        Station station1 = new Station("Ring");
        Station station2 = new Station("Landstraße");
        Station station3 = new Station("Alser Straße");

        Users user1 = new Users("Fritz", "Hermann");
        Users user2 = new Users("Hans", "Zimmermann");
        Users user3 = new Users("Bertram", "Fuhrmann");
        Users user4 = new Users("Herbert", "Spengler");


        HashMap <Integer, Bike> bikes = new HashMap <Integer, Bike>();

        bikes.put(bike1.bikeId, bike1);
        bikes.put(bike2.bikeId, bike2);
        bikes.put(bike3.bikeId, bike3);
        bikes.put(bike4.bikeId, bike4);
        bikes.put(bike5.bikeId, bike5);
        bikes.put(bike6.bikeId, bike6);
        bikes.put(bike7.bikeId, bike7);
        bikes.put(bike8.bikeId, bike8);
        bikes.put(bike9.bikeId, bike9);



        HashMap <Integer, Station> stations = new HashMap<>();

        stations.put(station1.getStationId(),station1 );
        stations.put(station2.getStationId(),station2 );
        stations.put(station3.getStationId(),station3 );

        station1.addBikes(bike1);
        station1.addBikes(bike2);
        station1.addBikes(bike3);
        station1.addBikes(bike4);
        station2.addBikes(bike5);
        station2.addBikes(bike6);
        station2.addBikes(bike7);

        station1.userRent(bike1, user1);
        System.out.println("");
        station1.giveBack(bike1,user1);

        System.out.println("");
        System.out.println("");

        station2.userRent(bike5, user3);
        System.out.println("");
        station3.giveBack(bike5,user3);

    }





}
