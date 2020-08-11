package menu;

import java.util.HashMap;

public class Users extends Rent {

    private static int counter = 0;
    int userId;
    String firstName;
    String lastName;
    Rent rent;

    Users(String firsName, String lastName){
        this.userId = counter++;
        this.firstName = firsName;
        this.lastName = lastName;

    }

    HashMap<Bike, Users> rentedBikes = new HashMap<Bike,Users>();


    public void rentBike(Bike b, Users u){

        rentedBikes.put(b,u);
        beginn();
        if(rentedBikes.containsKey(b)){
            System.out.println("bike is in the rentlist User");
        }else{
            System.out.println("Fail in method rentBike Users");
        }
    }



    public void giveBackBike(Bike b, Users u){
        Bike bike = b;
        int bikeId = b.getBikeId();
        end();
        if(rentedBikes.containsKey(bike)){
            removeBikeFromUser(b);
        }else{
            System.out.println("The Bike " + bikeId + " is not in your Rentlist." );
        }
    }


    public void removeBikeFromUser(Bike b){

        rentedBikes.remove(b);

        if(rentedBikes.containsKey(b)){
            System.out.println("Failure with the remove proces of rentedBikes");
        }else{
            System.out.println("Bike is removed from User List");
        }

    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
