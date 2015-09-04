package pl.pawelnielepkowicz;

/**
 * Created by Ja on 31/08/2015.
 */



public class ArrayInitialization {

    ArrayInitialization(){

        int[] a1 = { 1, 2, 3, 4, 5 };
        int[] a2;
        a2 = a1; //the changes made via a2 are seen in a1.
        for(int i = 0; i < a2.length; i++)
            a2[i] = a2[i] + 1;
        for(int i = 0; i < a1.length; i++)
            System.out.println("a1[" + i + "] = " + a1[i]);

       // int a [];
      //  a = new int[rand.nextInt(5)];
    }

}
