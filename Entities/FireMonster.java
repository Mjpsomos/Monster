package Entities;

public class FireMonster extends Monster {
    public FireMonster(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Attack with Fire! ");
    }
}

