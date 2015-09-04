package pl.pawelnielepkowicz;
/**
 * Created by Ja on 31/08/2015.
 */
class Mug {
    Mug(int marker) {
        System.out.println("Mug(" + marker + ")");
    }
    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}
public class InstanceInitialization {
    Mug mug1;
    Mug mug2;
    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 & mug2 initialized");
    }
    InstanceInitialization() {
        System.out.println("Mugs()");
    }
    InstanceInitialization(int i) {
        System.out.println("Mugs(int)");
    }
    public  void MakeIS() {
        System.out.println("Inside main()");
        new InstanceInitialization();
        System.out.println("new Mugs() completed");
        new InstanceInitialization(1);
        System.out.println("new Mugs(1) completed");

    }
}
