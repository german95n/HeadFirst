package Strategy.Quack;

/**
 * Created by german on 27/3/17.
 */
public class MuteQuack implements QuackBehavior {
    public void quack(){
        System.out.println("<< Silence >>");
    }
}
