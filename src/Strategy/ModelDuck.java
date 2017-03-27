package Strategy;

import Strategy.Fly.FlyNoWay;
import Strategy.Quack.Quack;

/**
 * Created by german on 27/3/17.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();

    }

    public void display() {
        System.out.println("I'm a model duck.");
    }
}
