package Entities;

public class StoneMonster extends Monster{
    public StoneMonster(String name)
    {
        super(name);
    }

    @Override
    public void attack()
    {
        System.out.println("Attack With Stones");
    }
}
