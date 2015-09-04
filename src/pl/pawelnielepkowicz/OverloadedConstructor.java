package pl.pawelnielepkowicz;

/**
 * Created by Ja on 31/08/2015.
 */
public class OverloadedConstructor {
    int height;
    OverloadedConstructor(){
        System.out.println("OverloadedConstructor: no parameter");
    }

    OverloadedConstructor(int initialHeight){
        height = initialHeight;
        System.out.println("OverloadedConstructor: parameter int: " + height);

    }

    void info(){
        System.out.println("Overloaded methood: no parameter");
    }

    void info(String s){
        System.out.println("Overloaded methood: String parameter:" + s);
    }

    void info(int i){
        System.out.println("Overloaded methood: int parameter:" + i);
    }

}
