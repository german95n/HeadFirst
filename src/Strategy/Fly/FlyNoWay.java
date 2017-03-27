package Strategy.Fly;

/**
 * Created by german on 27/3/17.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly(){
        System.out.println("I can't fly.");
    }
}
