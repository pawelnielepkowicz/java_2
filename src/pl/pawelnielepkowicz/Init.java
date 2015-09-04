package pl.pawelnielepkowicz;

/**
 * Created by Ja on 31/08/2015.
 */
public class Init {

    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {

            System.out.println("das");
            OverloadedConstructor OC = new OverloadedConstructor(i);
            OC.info();
            OC.info(i);
            OC.info("OC.info");


        }
        new OverloadedConstructor(222);
        new Simple_init();

        new MemberInit().printInitialValues();
        House h = new House();
        h.f(); // Shows that construction is done

        new InitStaticOrder();
        new InitOrder();

       //|w InstanceInitialization(); // will execude methods only defined in class constructor
        InstanceInitialization IS = new InstanceInitialization();
IS.MakeIS();// will execute methods defined in constructor and in MakeIS class//
       new ArrayInitialization();
new VarArgs();






    }
}
