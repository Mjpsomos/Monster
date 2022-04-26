package Entities;

public class Monster {
    // fields - are the attributes that the class can have. A monster has a name. A monster has an age...etc.

    public String name;




    // Costructors Allows you to create the class and immediatly establish the attributes of that obj

    public Monster(String name) {
        this.name = name;
    }


    //methods

    public void attack(){
        System.out.println("!^_&amp;^$@+%$* I don't know how to attack!");

    }


    //gets and


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
} // end class
