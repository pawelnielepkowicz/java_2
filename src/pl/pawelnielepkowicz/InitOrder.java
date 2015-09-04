package pl.pawelnielepkowicz;

/**
 * Created by Ja on 31/08/2015.
 */

class  Window{
    Window(int marker, String message){
        System.out.println("Window(" + marker + ")" + message);
    }
}

class House {

    Window w1 = new Window(1, "// Before constructor");

    House() {

        System.out.println("// House We’re in the constructor:()");
        w3 = new Window(33, "// Window We’re in the constructor");
    }

    Window w2 = new Window(2, "// After constructor");
    void f() { System.out.println("f()"); }
    Window w3 = new Window(3, "// At end");

}
class InitOrder{

    InitOrder(){

        House hh = new House();
        hh.f();
        System.out.println("dddddddddddddddddddddddd");
    }
}







