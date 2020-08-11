package menu;

import java.time.LocalDateTime;

public class Rent {

    Rent(){

    }

    LocalDateTime rentStart;
    LocalDateTime rentEnd;


    public void beginn(){
        rentStart = LocalDateTime.now();

        System.out.println("beginn:"+ rentStart);

    }

    public void end(){
        rentEnd = LocalDateTime.now();

        System.out.println("Bike rented at" + rentStart + "given back at " + rentEnd);

    }

}
