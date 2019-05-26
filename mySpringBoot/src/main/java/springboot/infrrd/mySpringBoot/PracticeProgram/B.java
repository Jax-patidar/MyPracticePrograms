package springboot.infrrd.mySpringBoot.PracticeProgram;

import org.hibernate.validator.constraints.URL;

import java.util.*;

public class B extends A {

   public void display(int a,int k)
   {
       //System.out.println("B");
   }

    public static void main(String []cv)
    {
        A a = new B();
        a.display(10);

        List<String> s = new ArrayList<>();

        HashMap<String,String> ss = new HashMap<>();

        System.out.println(ss.put("j",""));
        System.out.println(ss.put("j",""));

        System.out.println(ss.put("b",""));
        System.out.println(ss.put("b",""));

        Set<String> k = new HashSet<>();

        System.out.println(k.add("j"));
        System.out.println(k.add("j"));

        System.out.println(23%(16-1));


    }
}

 class A {
   public void display(int a)
   {
       //System.out.println("A");
   }
}
