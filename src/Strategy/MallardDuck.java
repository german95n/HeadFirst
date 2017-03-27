package Strategy;

import Strategy.Fly.FlyWithWings;
import Strategy.Quack.Quack;

/**
 * Created by german on 27/3/17.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck.");
    }
}
