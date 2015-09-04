package pl.pawelnielepkowicz;

/**
 * Created by Ja on 31/08/2015.
 */

class Depth {

    int f() {
        return 11;
    }

    int i = f();

    static void logSth() {
        System.out.println("logSth");
    }

}

public class VariousInit {

    Depth d = new Depth();

}
