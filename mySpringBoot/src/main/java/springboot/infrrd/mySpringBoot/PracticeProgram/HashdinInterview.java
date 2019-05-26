package springboot.infrrd.mySpringBoot.PracticeProgram;

import java.util.*;
import java.util.stream.Collectors;


public class HashdinInterview {
    public static void main(String ss[]) {


        Map<Integer, String> m = new HashMap<>();
        System.out.println(m.put(4, "180"));
        System.out.println(m.put(5, "100"));
        System.out.println(m.put(4, "10"));
        System.out.println(m.get(5));


        System.out.println(m.containsValue("180"));


//        Set<Map.Entry<Integer, String>> set = m.entrySet();
//        Set<Integer> s = m.keySet();
//
//
//
//        for ( Map.Entry<Integer, String> k : set ) {
//
//            //System.out.println(m.get(k));
//
//            System.out.println(k.getKey()+     "    "+k.getValue());
//        }


        AAA a = new AAA();


        List<String> l = new ArrayList();
        l.add(null);
        l.add("jagdish");
        l.removeIf(s->s==null);

        System.out.println(l);


    }
}


///This program is working find here
class AAA {
    int x, y;


    AAA() {
        this(5);
    }


    AAA(int x) {
        this.x = x;
        this.y = this.gety();
        System.out.println(this.x + "   " + this.y);
    }

    void o(Integer k) {
        System.out.println("Jagdish");
    }

    void o(String k) {
        System.out.println("Patidar");
    }


    int gety() {
        return 0;
    }
}
