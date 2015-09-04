package pl.pawelnielepkowicz;

/**
 * Created by Ja on 31/08/2015.
 */
public class MemberInit {
    // I will rely on default constructor

    boolean t;
    char c;
    int i;
    double d;


    void generateError(){
        int i;
        System.out.println("i++ will generate error, no default value!");
        // i++
    }

    void printInitialValues() {
        System.out.println("Data type Initial value");
        System.out.println("boolean " + t);
        System.out.println("char [" + c + "]");
        System.out.println("int " + i);
        System.out.println("double " + d);

    }


}
