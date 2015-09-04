package pl.pawelnielepkowicz;

/**
 * Created by Ja on 31/08/2015.
 */

public class VarArgs {


    Integer _Integer =  23;

    public VarArgs(){

        printArray(new Object[]{"one", "two", "three" });
        printArray(new Object[]{
                _Integer, new Float(3.14), new Double(11.11)
        });
    }

    static void printArray(Object [] args){
        for (Object obj : args){
            System.out.print(obj + " ");
            System.out.println();
        }

    }

}
