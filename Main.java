import Entities.FireMonster;
import Entities.Monster;
import Entities.StoneMonster;
import Entities.WaterMonster;

public class Main {
    public static void main(String[] args) {

//        Monster m1 = new Monster("Taco");
//            m1.attack();
//        Monster m2 = new FireMonster("Tomato");
//            m2.attack();
//        Monster m3 = new WaterMonster("Meat");
//            m3.attack();
//        Monster m4 = new StoneMonster("Lettuce");
//            m4.attack();


        Monster m1 = new FireMonster("D"); // upcast
        Monster m2 = new WaterMonster("c"); // upcast
        Monster m3 = new StoneMonster("B"); // upcast
// Invoke the actual implementation
        m1.attack(); // Run FireMonster&#39;s attack()
        m2.attack(); // Run WaterMonster&#39;s attack()
        m3.attack(); // Run StoneMonster&#39;s attack()
// m1 dies, generate a new instance and re-assign to m1.
        m1 = new StoneMonster("A"); // upcast
        m1.attack(); // Run StoneMonster&#39;s attack()
// We have a problem here!!!
        Monster m4 = new Monster("E");
        m4.attack();








    }

}
