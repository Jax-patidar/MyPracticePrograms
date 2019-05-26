package ProtectedPac;

import java.util.ArrayList;
import java.util.LinkedList;

class IntimeTecA {
    private IntimeTecA() {
    }

    public IntimeTecA(int a) {
    }


    void get()
    {
        System.out.println("Get from A");
    }
    void get(int s)
    {
        LinkedList<String>  list = new LinkedList<>();
        
                System.out.println("Get from A");
    }




}


public class IntimeTec extends IntimeTecA {
    IntimeTec() {
        super(2);
    }

    void get(int a, int r)
    {
        System.out.println("Get from B");

    }


    public static void main(String[] f)
    {
        IntimeTecA a = new IntimeTec();
        a.get();


    }

}
